package com.billionpizzas.controllers;

/**
 *
 * @author Joshua David Alvarez Calderon
 * @date 4 sep. 2022
 * @time 15:51:39
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import com.billionpizzas.models.domain.Empleado;
import com.billionpizzas.models.dao.EmpleadoDaoImpl;
import java.util.List;
import java.io.IOException;

@WebServlet("/ServletEmpleados")
public class ServletEmpleados extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        System.out.println("doPost");
        String accion = request.getParameter("accion");
        
        if(accion != null) {
            switch(accion){
                case "insertar":
                    insertarEmpleado(request, responce);
                    break;
                case "actualizar":
                    break;
            }
        }
    }

    private void insertarEmpleado(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Recuperar los valores del formulario agregar estudiante
        int persona_id = Integer.parseInt(request.getParameter("persona_id"));
        int tipo_empleado_id = Integer.parseInt(request.getParameter("tipo_empleado_id"));
        
        
        // Crear el objeto tipo estudiante (bean)
        Empleado empleado = new Empleado(persona_id, tipo_empleado_id);
        System.out.println(empleado);
        
        //Insertar el nuevo objeto de tipo estudiante en la base de datos
        int registrosInsertados = new EmpleadoDaoImpl().add(empleado);
        listarEmpleado(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarEmpleado(request, response);
                    break;
                case "editar":
                    editarEmpleados(request, response);
                    break;
                case "eliminar":
                    eliminarEmpleado(request, response);
                    break;
            }

        }

    }
    
     private void editarEmpleados(HttpServletRequest request, HttpServletResponse response)throws IOException , ServletException {
        System.out.println("Empleado");
        // recuperar el id del estudiante
        int idEmpleado = Integer.parseInt(request.getParameter("idEmpleado"));
        // buscar toda la informacion del estudiante por medio de su ID
        Empleado empleado = new EmpleadoDaoImpl().get(new Empleado(idEmpleado));
        System.out.println(empleado);
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("empleado", empleado);
        
        
        
        response.sendRedirect(request.getContextPath()+ "/empleados/editar-empleado.jsp");  }

    private void eliminarEmpleado(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int idEmpleado = Integer.parseInt(request.getParameter("id_empelado"));
        Empleado empleado = new EmpleadoDaoImpl().get(new Empleado(idEmpleado));
        int registroEmpleado = new EmpleadoDaoImpl().delete(empleado);
        listarEmpleado(request, response);
    }

    private void listarEmpleado(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Empleado> data = new EmpleadoDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listarEmpleado", data);
        response.sendRedirect("empleados/empleados.jsp");

    }

}
