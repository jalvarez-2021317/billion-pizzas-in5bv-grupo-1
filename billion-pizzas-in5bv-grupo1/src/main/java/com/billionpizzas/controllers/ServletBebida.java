package com.billionpizzas.controllers;

/**
 *
 * @author Marcos Alcántara Hernández
 * @date 6/09/2022
 * @time 19:34:24
 */

import com.billionpizzas.models.dao.BebidaDaoImpl;
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
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet("/ServletBebida")
public class ServletBebida extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {       
        request.setCharacterEncoding("UTF-8");
        
        System.out.println("doPost");
        String accion = request.getParameter("accion");
        
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    System.out.println("Insertando...");
                    //Lamaremos a un método para insertar
                    insertarBebida(request, response);
                    break;                   
            }
        }
    }
    
    private void insertarBebida(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Llegamos al metodo de insertarBebida");
        //Recuperacion de valores de formulario agregar Bebida
        String nombreBebida = request.getParameter("nombreBebida");
        Date fecha_caducida = Date.valueOf(request.getParameter("fechaCaducidad"));
        int precio = Integer.parseInt(request.getParameter("precio"));
        int proveedorId = Integer.parseInt(request.getParameter("proveedorId"));
        
        //Creacion de Objeto tipo bebida(bean)
        Bebida bebida = new Bebida(nombreBebida, fecha_caducida, precio, proveedorId);
        System.out.println(bebida);
        
        //Insertar el nuevo objeto de tipo estudiante en la base de datos
        //int registrosInsertados = new BebidaDaoImpl().add(bebida); con jdbc
        int registrosInsertados = new BebidaDaoJPA().add(bebida);
        
        listarBebida(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        System.out.println("doGet");
        
        String accion = request.getParameter("accion");
        
        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarBebida(request, response);
                    break;
                case "editar":
                    editarBebida(request, response);
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
    
    private void editarBebida(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        //Recuperar el ID de Bebidas
        int idBebida = Integer.parseInt(request.getParameter("idBebida"));
        
        //Buscar toda la informacion del estudiante por medio de su ID
        Bebida bebida = new BebidaDaoImpl().get(new Bebida(idBebida));
        
        request.setAttribute("bebida", bebida);
        request.getRequestDispatcher("bebidas/editar-bebidas.jsp");
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
