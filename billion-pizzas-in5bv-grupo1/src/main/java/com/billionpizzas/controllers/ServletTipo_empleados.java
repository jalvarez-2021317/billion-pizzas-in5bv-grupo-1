
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
import java.util.List;
import java.io.IOException;

//anotación
@WebServlet("/ServletTipo_empleados")
public class ServletTipo_empleados extends HttpServlet {

    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException  {
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
                    //
                    break;
            }

        }

    }
    
    private void listarTipos_empleados(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Tipo_empleado> data = new Tipo_empleadoDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listarTipos_empleados", data);
        response.sendRedirect("tipos-empleados/tipos-empleados.jsp");

    }
    
    
    
    
    
    
    
    
    
    
    
    
}
