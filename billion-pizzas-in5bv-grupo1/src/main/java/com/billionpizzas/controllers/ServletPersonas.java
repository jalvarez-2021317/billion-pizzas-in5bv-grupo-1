package com.billionpizzas.controllers;

/**
 *
 * @author Carlos Emmanuel Pérez Simón
 * @date 4/09/2022
 * @time 23:07:02
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

import com.billionpizzas.models.domain.Persona;
import com.billionpizzas.models.dao.PersonaDaoImpl;
import com.billionpizzas.models.dao.PersonaDaoJPA;
import java.util.List;
import java.io.IOException;

@WebServlet("/ServletPersonas")
public class ServletPersonas extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        
        System.out.println("doPost");
        String accion = request.getParameter("accion");
        
        if(accion != null) {
            switch(accion){
                case "insertar":
                    insertarPersona(request, response);
                    break;
                case "actualizar":
                    // Actualizar
                    break;
            }
        }
    }
    
    private void insertarPersona(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Recuperar los valores del formulario agregar estudiante
        String nombre1 = request.getParameter("nombre1");
        String nombre2 = request.getParameter("nombre2");
        String nombre3 = request.getParameter("nombre3");
        String apellido1 = request.getParameter("apellido1");
        String apellido2 = request.getParameter("apellido2");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String direccion = request.getParameter("direccion");
        
        // Crear el objeto tipo estudiante (bean)
        Persona persona = new Persona(nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion);
        System.out.println(persona);
        
        //Insertar el nuevo objeto de tipo estudiante en la base de datos
        int registrosInsertados = new PersonaDaoImpl().add(persona);
        listaPersonas(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listaPersonas(request, response);
                    break;
                case "editar":
                    //...
                    break;
                case "eliminar":
                    eliminarPersona(request, response);
                    break;
            }
        }
    }
    
    private void eliminarPersona(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("dpi"));
        //Estudiante estudiante= new Estudiante(id);
        Persona persona = new PersonaDaoJPA().get(new Persona(id));
        //int registroEstudiante = new EstudianteDaoImpl().delete(estudiante);
        int registroPersona = new PersonaDaoJPA().delete(persona);
        listaPersonas(request, response);
    }

    private void listaPersonas(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Persona> data = new PersonaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDePersonas", data);
        response.sendRedirect("personas/personas.jsp");
    }
}
