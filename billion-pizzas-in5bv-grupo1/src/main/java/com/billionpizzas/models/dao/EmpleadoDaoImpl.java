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
    private static final String SQL_INSERT = "INSERT INTO empleados(persona_id,tipo_empleado_id) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE empleados SET persona_id = ?, tipo_empleado_id = ? WHERE id_empleado=? ";
    private static final String SQL_DELETE = "DELETE FROM empleados WHERE id_empleado=?";
    private static final String SQL_SELECT_BY_ID = "SELECT id_empleado,persona_id,tipo_empleado_id FROM empleados WHERE id_empleado = ?";
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
    public int add(Empleado empleado) {
     int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_INSERT);
            pstmt.setInt(1, empleado.getPersona_id());
            pstmt.setInt(2, empleado.getTipo_empleado_id());
          

            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar insertar el registro: " + empleado);
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
    public int update(Empleado empleado) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_UPDATE);
            pstmt.setInt(1, empleado.getPersona_id());
            pstmt.setInt(2, empleado.getTipo_empleado_id());
            pstmt.setInt(3, empleado.getId_empleado());
            

            System.out.println(pstmt.toString());

            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Se produjo un error al intentar actuaalizar el siguiente registro " + empleado);
            e.printStackTrace(System.out);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return rows;
    }
        

    @Override
    public int delete(Empleado empleado) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, empleado.getId_empleado());

            System.out.println(pstmt.toString());
            rows= pstmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id: " + empleado.getId_empleado());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return rows;
    }

    @Override
    public Empleado get(Empleado empleado) {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setInt(1, empleado.getId_empleado());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                empleado = new Empleado(rs.getInt("id_empleado"),
                        rs.getInt("persona_id"),
                        rs.getInt("tipo_empleado_id"));
            }
            System.out.println("Empleado: " + empleado);
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar los Empleados");
            e.printStackTrace(System.out);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return empleado;
    }
}
