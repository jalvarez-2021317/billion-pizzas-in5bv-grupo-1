
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
    private Connection con = null;
    private PreparedStatement pstmt = null; 
    private ResultSet rs = null;
    private Comida comida = null; 
    private List<Comida> listaComida = new ArrayList<>();
    
    @Override
    public List<Comida> getAll() {
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                comida = new Comida(rs.getInt("id_comidas"), rs.getString("nombre_comida"), rs.getInt("precio"));
                listaComida.add(comida);
            }
        }catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar las comidas");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        } 
        return listaComida;
    }

    @Override
    public boolean add(Comida comida) {
        return false; 
    }

    @Override
    public boolean update(Comida comida) {
        return false;
    }

    @Override
    public boolean delete(Comida comida) {
        return false; 
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
