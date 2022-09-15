package com.billionpizzas.models.dao;

import com.billionpizzas.db.Conexion;
import com.billionpizzas.models.domain.Bebida;
import com.billionpizzas.models.idao.IBebidaDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos Alcántara Hernández
 * @date 6/09/2022
 * @time 18:23:03
 */
public class BebidaDaoImpl implements IBebidaDao {
    
    private static final String SQL_SELECT = "SELECT id_bebidas, nombre_bebidas, fecha_caducida, precio, proveedor_id FROM bebidas";
    private static final String SQL_DELETE = "DELETE FROM bebidas WHERE id_bebidas = ?";//Se envia ? para indicar el parametro
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Bebida bebida = null;
    private List<Bebida> listaBebida = new ArrayList<>();

    @Override
    public List<Bebida> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                bebida = new Bebida(rs.getInt("id_bebidas"),
                        rs.getString("nombre_bebidas"),
                        rs.getDate("fecha_caducida"),
                        rs.getInt("precio"),
                        rs.getInt("proveedor_id")); 
                listaBebida.add(bebida);
            }               
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar Listar Bebida");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace();
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaBebida;
    }

    @Override
    public int add(Bebida bebida) {
        return 0;
    }

    @Override
    public int update(Bebida bebida) {
        return 0;
    }

    @Override
    public int delete(Bebida bebida) {
        int rows = 0;
        
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareCall(SQL_DELETE);
            pstmt.setInt(1, bebida.getId_bebidas());
            System.out.println(pstmt.toString());
            
            rows = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id: " + bebida.getId_bebidas());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return rows;
    }

    @Override
    public Bebida get(Bebida bebida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
