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

    /*
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {

    }*/

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String accion = request.getParameter("accion");
            if (accion != null) {
                switch (accion) {
                    case "listar":
                        listarTipos_empleados(request, response);
                        break;
                    case "editar":
                        //
                        break;
                    case "eliminar":
                        eliminarTipo_empleado(request, response);
                        break;
                }

            }
        }catch (Exception e){
            System.out.println("n----------ERROR------------n");
            System.out.println("\nError doGet\n");
            e.printStackTrace();
        }

    }

    private void eliminarTipo_empleado(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        // Tipo_empleado tipo_empleado = new Tipo_empleado(id);
        Tipo_empleado tipo_empleado = new Tipo_empleadoDaoJPA().get(new Tipo_empleado(id));
        int registrosEliminados = new Tipo_empleadoDaoJPA().delete(tipo_empleado);
        // int registrosEliminados = new Tipo_empleadoDaoImpl().delete(tipo_empleado);
        listarTipos_empleados(request, response);
    }
            
            
            
    private void listarTipos_empleados(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        List<Tipo_empleado> listaTipo_empleado = new Tipo_empleadoDaoJPA().getAll();
        //List<Tipo_empleado> data = new Tipo_empleadoDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listarTipos_empleados", listaTipo_empleado);
        response.sendRedirect(request.getContextPath()+ "tipos-empleados/tipos-empleados.jsp");

    }

}
