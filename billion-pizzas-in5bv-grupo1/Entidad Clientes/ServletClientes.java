

package com.billionpizzas.controllers;

/**
 *
 * @author Kevin Josue Xulú Solis
 * @date 5/09/2022
 * Código tecnico: IN5BV
 * Grupo: 1
 */


import com.billionpizzas.models.dao.ClienteDaoImpl;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.billionpizzas.models.domain.Cliente;
import com.billionpizzas.models.dao.ClienteDaoJPA;
import java.util.List;
import java.io.IOException;


@WebServlet("/ServletClientes")
public class ServletClientes extends HttpServlet{
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listaClientes(request, response);
                    break;
                case "editar":
                    //...
                    break;
                case "eliminar":
                    eliminarCliente(request, response);
                    break;
            }
        }
    }

    private void listaClientes(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //List<Cliente> data = new ClienteDaoImpl().getAll();
        List<Cliente> data = new ClieteDaoJPA().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeClientes", data);
        sesion.setAttribute("totalClientes", data.size());
        response.sendRedirect("clientes/clientes.jsp");
    }

    private void eliminarCliente(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //getParameter da String asi que hay que hacer converción a Int
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        
        //Bebida bebida = new Bebida(idBebida);
        Cliente cliente = new ClienteDaoJPA().get(new Cliente(idCliente));
        
        //int registrosEliminados = new BebidaDaoImpl().delete(bebida);
        int registrosEliminados = new ClienteDaoJPA().delete(cliente);
        
        listarCliente(request, response);//Para mostrar de nuevo los resgitros.
    }

}
