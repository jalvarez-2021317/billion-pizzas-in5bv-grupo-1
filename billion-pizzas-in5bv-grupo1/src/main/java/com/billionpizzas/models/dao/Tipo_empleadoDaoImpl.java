
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
    private static final String SQL_DELETE = "DELETE FROM tipos_empleados WHERE id = ?";
    private Connection con = null;
    private PreparedStatement pstmt = null; 
    private ResultSet rs = null;
    private Tipo_empleado tipo_empleado = null; 
    private List<Tipo_empleado> listarEmpleados = new ArrayList<>();
    
    @Override
    public List<Tipo_empleado> getAll() {
       
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                tipo_empleado = new Tipo_empleado(rs.getInt("id"), rs.getString("puesto"));
                listarEmpleados.add(tipo_empleado);
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
        return listarEmpleados;
       
    }

    @Override
    public int add(Tipo_empleado tipo_empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(Tipo_empleado tipo_empleado) {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    @Override
    public int delete(Tipo_empleado tipo_empleado) {
        int rows = 0;
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, tipo_empleado.getId());
            System.out.print(pstmt.toString());
            
            rows = pstmt.executeUpdate();
            
            
        } catch (SQLException e){
            System.err.println("Se produjo un error al tratar de eliminar el registro con el id "+ tipo_empleado.getId());
            e.printStackTrace(System.out);
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
        return rows;
    }

    @Override
    public Tipo_empleado get(Tipo_empleado tipo_empleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
