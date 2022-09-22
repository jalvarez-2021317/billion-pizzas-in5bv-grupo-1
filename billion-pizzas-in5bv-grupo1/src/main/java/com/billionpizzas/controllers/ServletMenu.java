package com.billionpizzas.controllers;

/**
 *
 * @author Marcos Alcántara Hernández
 * @date 6/09/2022
 * @time 19:27:46
 */

import com.billionpizzas.models.dao.MenuDaoImpl;
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
import java.net.http.HttpRequest;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

@WebServlet("/ServletMenu")
public class ServletMenu extends HttpServlet {

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
                    insertarMenu(request, response);
                    break;                   
            }
        }
    }
    
    private void insertarMenu(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Llevamos al metodo insertarAlumnos");
         //Recuperacion de valores de formulario agregar Menu
         Timestamp horario_comida = Timestamp.valueOf(request.getParameter("horarioComida"));
         Timestamp horario_apertura = Timestamp.valueOf(request.getParameter("horarioApertura"));
         Timestamp horario_cierre = Timestamp.valueOf(request.getParameter("horarioCierre"));
         int comidaId = Integer.parseInt(request.getParameter("comidasId"));
         int bebidasId = Integer.parseInt(request.getParameter("bebidasId"));
         
         //Creacion de Objeto tipo bebida(bean)
         Menu menu = new Menu(horario_comida, horario_apertura, horario_cierre, comidaId, bebidasId);
         System.out.println(menu);
         
         //Insertar el nuevo objeto de tipo estudiante en la base de datos
        //int registrosInsertados = new MenuDaoImpl().add(menu); jdbc
        int registrosInsertados = new MenuDaoJPA().add(menu);
        
        listarMenu(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        System.out.println("doGet");
        
        String accion = request.getParameter("accion");
        
        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarMenu(request, response);
                    break;
                case "editar":
                    editarMenu(request, response);
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
    
    private void editarMenu(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        //Recuperar el ID de Menu
        int idMenu = Integer.parseInt(request.getParameter("idMenu"));
        
        //Buscar toda la informacion del estudiante por medio de su ID
        Menu menu = new MenuDaoImpl().get(new Menu(idMenu));
        
        request.setAttribute("menu", menu);
        request.getRequestDispatcher("menus/editar-menu.jsp");
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
