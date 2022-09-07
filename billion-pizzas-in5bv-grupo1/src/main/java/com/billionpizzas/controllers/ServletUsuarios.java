

package com.billionpizzas.controllers;

/**
 *
 * @author Kevin Josue Xulú Solis
 * @date 4/09/2022
 * Carne: 2021348
 * Código tecnico: IN5BV
 * Grupo: 1
 */


import com.billionpizzas.models.dao.UsuarioDaoImpl;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.billionpizzas.models.domain.Usuario;
import java.util.List;
import java.io.IOException;

@WebServlet("/ServletUsuarios")
public class ServletUsuarios extends HttpServlet{
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listaUsuarios(request, response);
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

    private void listaUsuarios(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Usuario> data = new UsuarioDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeUsuarios", data);
        response.sendRedirect("usuarios/usuarios.jsp");
    }

}
