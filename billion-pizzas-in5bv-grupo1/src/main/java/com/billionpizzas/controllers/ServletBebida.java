package com.billionpizzas.controllers;

/**
 *
 * @author Marcos Alcántara Hernández
 * @date 6/09/2022
 * @time 19:34:24
 */

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.billionpizzas.models.domain.Bebida;
import com.billionpizzas.models.dao.BebidaDaoImpl;

import java.util.List;
import java.io.IOException;

@WebServlet("/ServletBebida")
public class ServletBebida extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String accion = request.getParameter("accion");
        
        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarBebida(request, response);
                    break;
                case "editar":
                    //..
                    break;
                case "eliminar":
                    //..
                    break;
            }

        }

    }
    
    private void listarBebida(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Bebida> data = new BebidaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoBebida", data);
        response.sendRedirect("bebidas/bebidas.jsp");

    }

}
