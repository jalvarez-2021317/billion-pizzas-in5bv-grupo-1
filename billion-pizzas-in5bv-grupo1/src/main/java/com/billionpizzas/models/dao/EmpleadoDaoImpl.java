package com.billionpizzas.models.dao;

import com.billionpizzas.db.Conexion;
import com.billionpizzas.models.domain.Empleado;
import com.billionpizzas.models.idao.IEmpleadoDao;
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
 * @time 15:52:24
 */
public class EmpleadoDaoImpl implements IEmpleadoDao {

    private static final String SQL_SELECT = "SELECT id_empleado,persona_id,tipo_empleado_id FROM empleados";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Empleado empleado = null;
    private List<Empleado> listarEmpleado = new ArrayList<>();

    @Override
    public List<Empleado> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                empleado = new Empleado(
                        rs.getInt("id_empleado"),
                        rs.getInt("persona_id"),
                        rs.getInt("tipo_empleado_id")
                );
                listarEmpleado.add(empleado);

            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar los Empleados");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listarEmpleado;
    }

    @Override
    public boolean add(Empleado empleado) {
        return false;
    }

    @Override
    public boolean update(Empleado empleado) {
        return false;
    }

    @Override
    public boolean delete(Empleado empleado) {
        return false;
    }
}
