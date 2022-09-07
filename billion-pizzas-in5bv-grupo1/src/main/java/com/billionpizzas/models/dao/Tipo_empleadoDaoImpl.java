
package com.billionpizzas.models.dao;

import com.billionpizzas.db.Conexion;
import com.billionpizzas.models.domain.Tipo_empleado;
import com.billionpizzas.models.idao.ITipo_empleadoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Isai Subuyuj 
 */
public class Tipo_empleadoDaoImpl implements ITipo_empleadoDao{

    private static final String SQL_SELECT = "SELECT id,puesto FROM tipos_empleados";
    private Connection con = null;
    private PreparedStatement pstmt = null; 
    private ResultSet rs = null;
    private Tipo_empleado tipo_empleado = null; 
    private List<Tipo_empleado> listaEmpleados = new ArrayList<>();
    
    @Override
    public List<Tipo_empleado> getAll() {
       
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                tipo_empleado = new Tipo_empleado(rs.getInt("id"), rs.getString("puesto"));
                listaEmpleados.add(tipo_empleado);
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar los tipos de empleados");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        } 
        return listaEmpleados;
       
    }

    @Override
    public boolean add(Tipo_empleado tipo_empleado) {
        return false;
    }

    @Override
    public boolean update(Tipo_empleado tipo_empleado) {
        return false;
    }

    @Override
    public boolean delete(Tipo_empleado tipo_empleado) {
        return false;
    }

    
    
    
    
    
    
    
}
