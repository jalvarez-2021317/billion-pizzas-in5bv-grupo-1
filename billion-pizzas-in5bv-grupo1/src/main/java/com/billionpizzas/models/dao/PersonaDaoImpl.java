package com.billionpizzas.models.dao;

/**
 *
 * @author Carlos Emmanuel Pérez Simón
 * @date 4/09/2022
 * @time 23:08:01
 *
 * Codigo Tecnico: IN5BV
 *
 */
import com.billionpizzas.db.Conexion;
import com.billionpizzas.models.domain.Persona;
import com.billionpizzas.models.idao.IPersonaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImpl implements IPersonaDao {

    private static final String SQL_SELECT = "SELECT dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion FROM personas";
    private static final String SQL_INSERT = "INSERT INTO personas(dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_SELECT_BY_ID = "SELECT dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion FROM personas WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM personas WHERE id=?";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Persona persona = null;
    private List<Persona> listaPersonas = new ArrayList<>();

    @Override
    public List<Persona> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                persona = new Persona(rs.getInt("dpi_cui"), rs.getString("nombre1"), rs.getString("nombre2"),
                        rs.getString("nombre3"), rs.getString("apellido1"), rs.getString("apellido2"), rs.getString("telefono"),
                        rs.getString("correo"), rs.getString("direccion"));
                listaPersonas.add(persona);
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar a las personas");
            e.printStackTrace(System.out);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaPersonas;
    }

    @Override
    public int add(Persona persona) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_INSERT);
            pstmt.setInt(1, persona.getDpi());
            pstmt.setString(2, persona.getNombre1());
            pstmt.setString(3, persona.getNombre2());
            pstmt.setString(4, persona.getNombre3());
            pstmt.setString(5, persona.getApellido1());
            pstmt.setString(6, persona.getApellido2());
            pstmt.setString(7, persona.getTelefono());
            pstmt.setString(8, persona.getCorreo());
            pstmt.setString(9, persona.getDireccion());

            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar insertar el registro: " + persona);
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
    public int update(Persona persona) {
        int rows = 0;
        return rows;
    }

    @Override
    public int delete(Persona persona) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, persona.getDpi());

            System.out.println(pstmt.toString());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id: " + persona.getDpi());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return rows;
    }

    @Override
    public Persona get(Persona persona) {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setInt(1, persona.getDpi());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                persona = new Persona(rs.getInt("dpi_cui"), rs.getString("nombre1"), rs.getString("nombre2"),
                        rs.getString("nombre3"), rs.getString("apellido1"), rs.getString("apellido2"), rs.getString("telefono"),
                        rs.getString("correo"), rs.getString("direccion"));
            }
            System.out.println("Persona: " + persona);
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar a las personas");
            e.printStackTrace(System.out);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return persona;
    }
}
