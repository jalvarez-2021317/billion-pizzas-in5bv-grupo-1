
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
import java.util.List;
import java.io.IOException;

//anotación
@WebServlet("/ServletComidas")
public class ServletComidas extends HttpServlet {

    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException  {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarComidas(request, response);
                    break;
                case "editar":
                    //
                    break;
                case "eliminar":
                    //
                    break;
            }

        }

    }
    
    
    private void listarComidas(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Comida> data = new ComidaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listarComidas", data);
        response.sendRedirect("comidas/comidas.jsp");

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
