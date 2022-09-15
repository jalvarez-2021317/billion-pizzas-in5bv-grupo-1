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

                    break;
                case "eliminar":
                    eliminarEmpleado(request, response);
                    break;
            }

        }

    }

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
