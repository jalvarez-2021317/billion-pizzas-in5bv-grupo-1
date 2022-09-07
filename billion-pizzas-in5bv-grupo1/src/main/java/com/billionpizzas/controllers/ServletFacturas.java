package com.billionpizzas.controllers;

/**
 *
 * @author Carlos Emmanuel Pérez Simón
 * @date 4/09/2022
 * @time 20:54:35
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

import com.billionpizzas.models.domain.Factura;
import com.billionpizzas.models.dao.FacturaDaoImpl;
import java.util.List;
import java.io.IOException;

@WebServlet("/ServletFacturas")
public class ServletFacturas extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listaFacturas(request, response);
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

    private void listaFacturas(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Factura> data = new FacturaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeFacturas", data);
        response.sendRedirect("facturas/facturas.jsp");
    }
}