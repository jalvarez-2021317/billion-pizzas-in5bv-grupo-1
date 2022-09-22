package com.billionpizzas.controllers;

/**
 *
 * @author Isai Subuyuj
 */
import com.billionpizzas.models.dao.Tipo_empleadoDaoImpl;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import com.billionpizzas.models.domain.Tipo_empleado;
import com.billionpizzas.models.dao.Tipo_empleadoDaoJPA;
import java.util.List;
import java.io.IOException;

//anotación
@WebServlet("/ServletTipo_empleados")
public class ServletTipo_empleados extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        System.out.println("Entraste a Dopost de Servlet");
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "insertar":
                    System.out.println("Insertando...");
                    insertarTipo_empleado(request, responce);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    private void insertarTipo_empleado(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        String puesto = request.getParameter("puesto");
        
        Tipo_empleado tipo_empleado = new Tipo_empleado(puesto);
        System.out.println(tipo_empleado);
        // int registrosInsertados = new Tipo_empleadoDaoImpl().add(tipo_empleado);
        int registrosInsertados = new Tipo_empleadoDaoJPA().add(tipo_empleado);
        listarTipos_empleados(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        System.out.println("Entraste a Doget del Servlet");
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarTipos_empleados(request, response);
                    break;
                case "editar":
                    System.out.println("Actualizando...");
                    editarTipo_empleado(request, response);
                    break;
                case "eliminar":
                    eliminarTipo_empleado(request, response);
                    break;
            }

        }

    }

    private void editarTipo_empleado(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Tipo_empleado tipo_empleado = new Tipo_empleadoDaoJPA().get(new Tipo_empleado(id));
        
        request.setAttribute("tipo_empleado", tipo_empleado);
        request.getRequestDispatcher("tipos-empleados/editar-tipo-empleado.jsp");
    }
    private void eliminarTipo_empleado(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Tipo_empleado tipo_empleado = new Tipo_empleadoDaoJPA().get(new Tipo_empleado(id));
        int registrosEliminados = new Tipo_empleadoDaoJPA().delete(tipo_empleado);

        listarTipos_empleados(request, response);
    }

    private void listarTipos_empleados(HttpServletRequest request, HttpServletResponse response) throws IOException {

        List<Tipo_empleado> listaTipo_empleado = new Tipo_empleadoDaoJPA().getAll();
        //List<Tipo_empleado> data = new Tipo_empleadoDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaTipos_empleados", listaTipo_empleado);
        sesion.setAttribute("totalEmpleados", listaTipo_empleado.size());
        response.sendRedirect(request.getContextPath() + "tipos-empleados/tipos-empleados.jsp");

    }

}
