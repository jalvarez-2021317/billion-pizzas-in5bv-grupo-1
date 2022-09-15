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

import com.billionpizzas.models.dao.BebidaDaoJPA;

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
                    eliminarBebida(request, response);
                    break;
            }

        }

    }
    
    private void listarBebida(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //List<Bebida> data = new BebidaDaoImpl().getAll();
        List<Bebida> data = new BebidaDaoJPA().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoBebida", data);
        sesion.setAttribute("totalBebidas", data.size());
        response.sendRedirect("bebidas/bebidas.jsp");
    }
    
    private void eliminarBebida(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //getParameter da String asi que hay que hacer converción a Int
        int idBebida = Integer.parseInt(request.getParameter("idBebida"));
        
        //Bebida bebida = new Bebida(idBebida);
        Bebida bebida = new BebidaDaoJPA().get(new Bebida(idBebida));
        
        //int registrosEliminados = new BebidaDaoImpl().delete(bebida);
        int registrosEliminados = new BebidaDaoJPA().delete(bebida);
        
        listarBebida(request, response);//Para mostrar de nuevo los resgitros.
    }

}
