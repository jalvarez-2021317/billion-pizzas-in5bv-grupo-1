package com.billionpizzas.controllers;

/**
 *
 * @author Carlos Emmanuel Pérez Simón
 * @date 4/09/2022
 * @time 23:07:02
 *
 * Codigo Tecnico: IN5BV
 *
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.billionpizzas.models.domain.Persona;
import com.billionpizzas.models.dao.PersonaDaoImpl;
import java.util.List;
import java.io.IOException;

@WebServlet("/ServletPersonas")
public class ServletPersonas extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listaPersonas(request, response);
                    break;
                case "editar":
                    //...
                    break;
                case "eliminar":
                    //.....
                    break;
            }
        }
    }

    private void listaPersonas(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Persona> data = new PersonaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDePersonas", data);
        response.sendRedirect("personas/personas.jsp");
    }
}
