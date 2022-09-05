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

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarEmpleado(request, response);
                    break;
                case "editar":

                    break;
                case "eliminar":

                    break;
            }

        }

    }

    private void listarEmpleado(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Empleado> data = new EmpleadoDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listarEmpleado", data);
        response.sendRedirect("empleados/empleados.jsp");

    }

}

