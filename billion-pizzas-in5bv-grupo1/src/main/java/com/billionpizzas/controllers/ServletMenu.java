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
import com.billionpizzas.models.dao.MenuDaoJPA;

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
                    eliminarMenu(request, response);
                    break;
            }

        }
    }
    
    private void listarMenu(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //List<Menu> data = new MenuDaoImpl().getAll();
        List<Menu> data = new MenuDaoJPA().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeMenu", data);
        sesion.setAttribute("totalMenus", data.size());
        response.sendRedirect("menus/menu.jsp");
    }
    
    private void eliminarMenu(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //getParameter da String asi que hay que hacer converción a Int
        int idMenu = Integer.parseInt(request.getParameter("idMenu")); 
        
        //Menu menu = new Menu(idMenu);
        Menu menu = new MenuDaoJPA().get(new Menu(idMenu));
        
        //int registrosEliminados = new MenuDaoImpl().delete(menu);        
        int registrosEliminados = new MenuDaoJPA().delete(menu);
        
        listarMenu(request, response); //Para mostrar de nuevo los resgitros.
    }
}
