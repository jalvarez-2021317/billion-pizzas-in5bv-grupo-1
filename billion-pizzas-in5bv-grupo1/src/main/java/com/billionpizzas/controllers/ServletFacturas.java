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
import com.billionpizzas.models.dao.FacturaDaoJPA;
import java.util.List;
import java.io.IOException;

@WebServlet("/ServletFacturas")
public class ServletFacturas extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listaFacturas(request, response);
                    break;
                case "editar":
                    editarFacturas(request, response);
                    break;
                case "eliminar":
                    eliminarFactura(request, response);
                    break;
            }
        }
    }
    
    private void editarFacturas(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        // Recuperar el ID de la factura
        int idFactura = Integer.parseInt(request.getParameter("noFactura"));
        // Buscar toda la informacion de la factura por medio de su ID
        Factura factura = new FacturaDaoImpl().get(new Factura(idFactura));
        HttpSession sesion = request.getSession();
        sesion.setAttribute("factura", factura);
        response.sendRedirect(request.getContextPath() + "/facturas/editar-factura.jsp");
    }
    
    private void eliminarFactura(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idFactura = Integer.parseInt(request.getParameter("noFactura"));
        Factura factura = new FacturaDaoImpl().get(new Factura(idFactura));
        int registroFactura = new FacturaDaoImpl().delete(factura);
        listaFacturas(request, response);
    }

    private void listaFacturas(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Factura> data = new FacturaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeFacturas", data);
        response.sendRedirect("facturas/facturas.jsp");
    }
}
