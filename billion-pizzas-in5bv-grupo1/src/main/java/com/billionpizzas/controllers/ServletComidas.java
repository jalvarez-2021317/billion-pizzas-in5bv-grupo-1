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
import java.util.List;
import java.io.IOException;

//anotación
@WebServlet("/ServletComidas")
public class ServletComidas extends HttpServlet {

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
        }catch (Exception e){
            System.out.println("n----------ERROR------------n");
            System.out.println("\nError doGet\n");
            e.printStackTrace();
        }
    }
    
    private void eliminarComida(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int id_comidas = Integer.parseInt(request.getParameter("id_comidas"));
        // Comida comida = new Comida(id_comidas);
        Comida comida = new ComidaDaoJPA().get(new Comida(id_comidas));
        int registrosEliminados = new ComidaDaoJPA().delete(comida);
        // int eliminarComida = new ComidaDaoImpl().delete(comida);
        listarComidas(request, response);
    }

    private void listarComidas(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Comida> listaComida = new ComidaDaoJPA().getAll();
        //List<Comida> data = new ComidaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listarComidas", listaComida);
        response.sendRedirect(request.getContextPath()+ "comidas/comidas.jsp");

    }

}
