package com.billionpizzas.controllers;

/**
 *
 * @author Marcos Alcántara Hernández
 * @date 6/09/2022
 * @time 19:27:46
 */

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.billionpizzas.models.domain.Menu;
import com.billionpizzas.models.dao.MenuDaoImpl;

import java.util.List;
import java.io.IOException;

@WebServlet("/ServletMenu")
public class ServletMenu extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String accion = request.getParameter("accion");
        
        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarMenu(request, response);
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
    
    private void listarMenu(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Menu> data = new MenuDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeMenu", data);
        response.sendRedirect("menus/menu.jsp");

    }
}
