package com.billionpizzas.models.dao;

/**
 *
 * @author Marcos Alcántara Hernández
 * @date 6/09/2022
 * @time 18:22:43
 */

import com.billionpizzas.db.Conexion;
import com.billionpizzas.models.domain.Menu;
import com.billionpizzas.models.idao.IMenuDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
        
public class MenuDaoImpl implements IMenuDao {
    
    private static final String SQL_SELECT = "SELECT id_menu, horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id FROM menu";
    private static final String SQL_SELECT_BY_ID = "SELECT id_menu, horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id FROM menu WHERE id_menu = ?";
    private static final String SQL_DELETE = "DELETE FROM menu WHERE id_menu = ?"; //Se envia ? para indicar el parametro
    private static final String SQL_INSERT = "INSERT INTO menu(horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id) VALUES (?,?,?,?,?)";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Menu menu = null;
    private List<Menu> listaMenu = new ArrayList<>();

    @Override
    public List<Menu> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                menu = new Menu(rs.getInt("id_menu"),
                        rs.getTimestamp("horario_comida"), 
                        rs.getTimestamp("horario_apertura"), 
                        rs.getTimestamp("horario_cierre"), 
                        rs.getInt("comidas_id"), 
                        rs.getInt("bebidas_id")); 
                listaMenu.add(menu);
            }                      
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar Listar Menu");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace();
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaMenu;
    }

    @Override
    public int add(Menu menu) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_INSERT);
            pstmt.setTimestamp(1, menu.getHorario_comida());
            pstmt.setTimestamp(2, menu.getHorario_apertura());
            pstmt.setTimestamp(3, menu.getHorario_cierre());
            pstmt.setInt(4, menu.getComidas_id());
            pstmt.setInt(5, menu.getBebidas_id());
            
            System.out.println(pstmt.toString());           
            rows = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar Insertar el registro: " + menu);
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return rows;
    }

    @Override
    public int update(Menu menu) {
        return 0;
    }

    @Override
    public int delete(Menu menu) {
        int rows = 0;        
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareCall(SQL_DELETE);
            pstmt.setInt(1, menu.getId_menu());
            System.out.println(pstmt.toString());
            
            rows = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id: " + menu.getId_menu());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return rows;
    }

    @Override
    public Menu get(Menu menu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
