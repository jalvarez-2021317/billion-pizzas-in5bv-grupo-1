package com.billionpizzas.controllers;

/**
 *
 * @author Isai Subuyuj
 */
import com.billionpizzas.models.dao.ComidaDaoImpl;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import com.billionpizzas.models.domain.Comida;
import com.billionpizzas.models.dao.ComidaDaoJPA;
import com.billionpizzas.models.dao.Tipo_empleadoDaoJPA;
import com.billionpizzas.models.domain.Tipo_empleado;
import java.util.List;
import java.io.IOException;

//anotación
@WebServlet("/ServletComidas")
public class ServletComidas extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "insertar":
                    System.out.println("Insertando...");
                    insertarComida(request, responce);
                    break;
                case "editar":
                    System.out.println("Actualizando...");
                    editarComida(request, responce);
                    break;
                default:
                    editarComida(request, responce);
                    throw new AssertionError();
            }
        }
    }

    private void editarComida(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int id_comidas = Integer.parseInt(request.getParameter("id_comidas"));

        Comida comida = new ComidaDaoJPA().get(new Comida(id_comidas));

        request.setAttribute("comida", comida);
        request.getRequestDispatcher("comidas/editar-comida.jsp");
    }

    private void insertarComida(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nombre_comida = request.getParameter("nombre_comida");
        Integer precio = Integer.parseInt(request.getParameter("precio"));

        Comida comida = new Comida(nombre_comida, precio);
        System.out.println(comida);
        int registrosInsertados = new ComidaDaoJPA().add(comida);
        // int registrosInsertados = new ComidaDaoImpl().add(comida);

        listarComidas(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        System.out.println("Entraste a Doget del Servlet");
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarComidas(request, response);
                    break;
                case "editar":
                    // Otras accioens
                    break;
                case "eliminar":
                    eliminarComida(request, response);
                    break;
            }

        }

    }

    private void eliminarComida(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id_comidas = Integer.parseInt(request.getParameter("id_comidas"));

        Comida comida = new ComidaDaoJPA().get(new Comida(id_comidas));
        int registrosEliminados = new ComidaDaoJPA().delete(comida);

        listarComidas(request, response);
    }

    private void listarComidas(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Comida> listaComida = new ComidaDaoJPA().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listarComidas", listaComida);
        sesion.setAttribute("totalEmpleados", listaComida.size());
        response.sendRedirect(request.getContextPath() + "comidas/comidas.jsp");

    }

}
