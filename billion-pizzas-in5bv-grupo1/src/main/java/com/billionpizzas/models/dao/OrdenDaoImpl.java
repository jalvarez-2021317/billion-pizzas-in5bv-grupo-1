package com.billionpizzas.models.dao;

import com.billionpizzas.db.Conexion;
import com.billionpizzas.models.domain.Orden;
import com.billionpizzas.models.idao.IOrdenDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joshua David Alvarez Calderon
 * @date 4 sep. 2022
 * @time 15:52:41
 */
public class OrdenDaoImpl implements IOrdenDao {

    private static final String SQL_SELECT = "SELECT id_orden,hora_entrega,cliente_id,menu_id FROM orden";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Orden orden = null;
    private List<Orden> listaorden = new ArrayList<>();

    @Override
    public List<Orden> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                orden = new Orden(
                        rs.getInt("id_orden"),
                        rs.getTime("hora_entrega"),
                        rs.getInt("cliente_id"),
                        rs.getInt("menu_id")
                       ); listaorden.add(orden);

            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar las Ordenes");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaorden;

    }

    @Override
    public boolean add(Orden orden) {
        return false;
    }

    @Override
    public boolean update(Orden orden) {
        return false;
    }

    @Override
    public boolean delete(Orden orden) {
        return false;
    }

}
