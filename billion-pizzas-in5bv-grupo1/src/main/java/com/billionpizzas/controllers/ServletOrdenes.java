package com.billionpizzas.controllers;

/**
 *
 * @author Joshua David Alvarez Calderon
 * @date 4 sep. 2022
 * @time 15:51:52
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import com.billionpizzas.models.domain.Orden;
import com.billionpizzas.models.dao.OrdenDaoImpl;
import java.util.List;
import java.io.IOException;
import java.sql.Time;

@WebServlet("/ServletOrdenes")
public class ServletOrdenes extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        System.out.println("doPost");
        String accion = request.getParameter("accion");
        
        if(accion != null) {
            switch(accion){
                case "insertar":
                    insertarEstudiante(request, responce);
                    break;
                case "actualizar":
                    
                    break;
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarOrdenes(request, response);
                    break;
                case "editar":
                    editarOrden(request, response);
                    break;
                case "eliminar":
                    eliminarOrden(request, response);
                    break;
            }

        }

    }
     private void editarOrden(HttpServletRequest request, HttpServletResponse response)throws IOException , ServletException {
        System.out.println("Editando ORdenes");
        // recuperar el id del estudiante
        int idOrden = Integer.parseInt(request.getParameter("idOrden"));
        // buscar toda la informacion del estudiante por medio de su ID
        Orden orden = new OrdenDaoImpl().get(new Orden(idOrden));
        System.out.println(orden);
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("orden", orden);
        
        
        
        response.sendRedirect(request.getContextPath()+ "/ordenes/editar-orden.jsp");  }
    
    private void insertarEstudiante(HttpServletRequest request, HttpServletResponse response) throws IOException {
       /* // Recuperar los valores del formulario agregar estudiante
        Time hora_entrega = Time.parse(request.getParameter("hora_entrega"));
        int cliente_id = Integer.parseInt(request.getParameter("cliente_id"));
        int menu_id = Integer.parseInt(request.getParameter("menu_id"));
        
        // Crear el objeto tipo estudiante (bean)
        Orden orden = new Orden(hora_entrega, cliente_id, menu_id);
        System.out.println(orden);
        
        //Insertar el nuevo objeto de tipo estudiante en la base de datos
        int registrosInsertados = new OrdenDaoImpl().add(orden));
        listarOrdenes(request, response);
*/
    }
    
    
     private void eliminarOrden(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int idORden = Integer.parseInt(request.getParameter("id_orden"));
        Orden orden = new OrdenDaoImpl().get(new Orden(idORden));
        int registroOrden = new OrdenDaoImpl().delete(orden);
        listarOrdenes(request, response);
    }
     
    private void listarOrdenes(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Orden> data = new OrdenDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeOrdenes", data);
        response.sendRedirect("ordenes/ordenes.jsp");

    }
    

    
}
