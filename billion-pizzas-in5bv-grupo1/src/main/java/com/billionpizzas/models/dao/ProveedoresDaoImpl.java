package com.billionpizzas.models.dao;

import com.billionpizzas.db.Conexion;
import com.billionpizzas.models.domain.Proveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.billionpizzas.models.idao.IProveedoresDao;

/**
 *
 * @author Jeremy Joseph Cardona Orenos
 * @date 4 sep. 2022
 * @time 15:52:41
 */
public class ProveedoresDaoImpl implements IProveedoresDao {

    private static final String SQL_SELECT = "SELECT id,nombre_empresa,telefono,correo FROM proveedores";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Proveedores proveedores = null;
    private List<Proveedores> listaproveedores = new ArrayList<>();

    @Override
    public List<Proveedores> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                proveedores = new Proveedores(
                        rs.getInt("id"),
                        rs.getString("nombre_empresa"),
                        rs.getString("telefono"),
                        rs.getString("correo")
                       ); listaproveedores.add(proveedores);

            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar las Proveedores");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaproveedores;

    }

    @Override
    public boolean add(Proveedores proveedores) {
        return false;
    }

    @Override
    public boolean update(Proveedores proveedores) {
        return false;
    }

    @Override
    public boolean delete(Proveedores proveedores) {
        return false;
    }

}
