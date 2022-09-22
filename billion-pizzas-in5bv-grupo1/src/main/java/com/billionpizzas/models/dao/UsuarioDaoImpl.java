

package com.billionpizzas.models.dao;

/**
 *
 * @author Kevin Josue Xulú Solis
 * @date 4/09/2022
 * Carne: 2021348
 * Código tecnico: IN5BV
 * Grupo: 1
 */

import com.billionpizzas.db.Conexion;
import com.billionpizzas.models.domain.Usuario;
import com.billionpizzas.models.idao.IUsuarioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDaoImpl implements IUsuarioDao{
   private static final String SQL_SELECT = "SELECT user, password, empleado_id FROM usuarios";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Usuario usuario = null;
    private List<Usuario> listaUsuarios = new ArrayList<>();
    
    
    @Override
    public List<Usuario> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                usuario = new Usuario(rs.getString("user"), rs.getString("password"), rs.getInt("empleado_id"));
                listaUsuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar las usuarios");
            e.printStackTrace(System.out);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaUsuarios;
    }

    @Override
    public int add(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
