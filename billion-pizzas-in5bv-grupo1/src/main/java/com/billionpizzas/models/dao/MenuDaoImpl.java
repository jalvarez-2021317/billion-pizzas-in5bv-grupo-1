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
import java.util.ArrayList;
import java.util.List;
        
public class MenuDaoImpl implements IMenuDao {
    
    private static final String SQL_SELECT = "SELECT id_menu, horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id FROM menu";
    private static final String SQL_DELETE = "DELETE FROM menu WHERE id_menu = ?"; //Se envia ? para indicar el parametro
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
                        rs.getTime("horario_comida"), 
                        rs.getTime("horario_apertura"), 
                        rs.getTime("horario_cierre"), 
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
        return 0;
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
