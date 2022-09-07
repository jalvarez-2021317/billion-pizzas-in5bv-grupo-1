package com.billionpizzas.controllers;

/**
 *
 * @author Jeremy Joseph Cradona Orenos
 * @date 4 sep. 2022
 * @time 15:51:52
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import com.billionpizzas.models.dao.ProveedoresDaoImpl;
import com.billionpizzas.models.domain.Proveedores;
import java.util.List;
import java.io.IOException;

@WebServlet("/ServletProveedores")
public class ServletProveedores extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarOrdenes(request, response);
                    break;
                case "editar":

                    break;
                case "eliminar":

                    break;
            }

        }

    }

    private void listarOrdenes(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Proveedores> data = new ProveedoresDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeProveedores", data);
        response.sendRedirect("proveedores/proveedores.jsp");

    }

    
}