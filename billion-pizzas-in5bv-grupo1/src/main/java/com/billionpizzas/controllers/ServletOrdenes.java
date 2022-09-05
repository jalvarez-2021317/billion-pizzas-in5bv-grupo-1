/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.billionpizzas.controllers;

/**
 *
 * @author Joshua David Alvarez Calderon
 * @date 4 sep. 2022
 * @time 15:51:52
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import com.billionpizzas.models.domain.Orden;
import com.billionpizzas.models.dao.OrdenDaoImpl;
import java.util.List;
import java.io.IOException;

@WebServlet("/ServletOrdenes")
public class ServletOrdenes extends HttpServlet {

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
        List<Orden> data = new OrdenDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeOrdenes", data);
        response.sendRedirect("ordenes/ordenes.jsp");

    }

    
}
