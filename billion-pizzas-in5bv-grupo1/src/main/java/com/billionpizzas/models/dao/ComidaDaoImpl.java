package com.billionpizzas.models.dao;

import com.billionpizzas.db.Conexion;
import com.billionpizzas.models.domain.Comida;
import com.billionpizzas.models.idao.IComidaDao;

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
public class ComidaDaoImpl implements IComidaDao {

    private static final String SQL_SELECT = "SELECT id_comidas,nombre_comida,precio FROM comidas";
    private static final String SQL_SELECT_BY_ID = "SELECT id_comidas,nombre_comida,precio FROM comidas WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM comidas WHERE id_comidas = ?";
    private static final String SQL_INSERT = "INSERT INTO comidas(nombre_comida, precio) VALUES (?, ?)";
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Comida comida = null;
    private List<Comida> listarComida = new ArrayList<>();

    @Override
    public List<Comida> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                comida = new Comida(rs.getInt("id_comidas"), rs.getString("nombre_comida"), rs.getInt("precio"));
                listarComida.add(comida);
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar las comidas");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listarComida;
    }

    @Override
    public int add(Comida comida) {
        int rows = 0; 
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_INSERT);
            pstmt.setString(1, comida.getNombre_comida());
            pstmt.setInt(2, comida.getPrecio());
            
            System.out.println(pstmt.toString());
            
            rows = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Se produjo un error al tratar de insertar el registro con el id " + comida);
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        } 
        return rows; 
    }

    @Override
    public int update(Comida comida) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(Comida comida) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, comida.getId_comidas());
            System.out.println(pstmt.toString());

            rows = pstmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Se produjo un error al tratar de eliminar el registro con el id " + comida.getId_comidas());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return rows; 
    }

    @Override
    public Comida get(Comida comida) {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setInt(1, this.comida.getId_comidas());
            System.out.println(pstmt.toString());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                comida = new Comida(rs.getInt("id_comidas"), rs.getString("nombre_comida"), rs.getInt("precio"));
                
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar las comidas");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return comida;
    }

}
