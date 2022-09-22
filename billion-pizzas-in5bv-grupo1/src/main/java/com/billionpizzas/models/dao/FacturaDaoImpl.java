package com.billionpizzas.models.dao;

/**
 *
 * @author Carlos Emmanuel Pérez Simón
 * @date 4/09/2022
 * @time 20:55:22
 *
 * Codigo Tecnico: IN5BV
 *
 */
import com.billionpizzas.db.Conexion;
import com.billionpizzas.models.domain.Factura;
import com.billionpizzas.models.idao.IFacturaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacturaDaoImpl implements IFacturaDao {

    private static final String SQL_SELECT = "SELECT no_factura, serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id FROM factura";
    private static final String SQL_INSERT = "INSERT INTO factura(no_factura, serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_SELECT_BY_ID = "SELECT no_factura, serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id FROM factura WHERE id = ?";
    private static final String SQL_UPDATE = "UPDATE factura SET serie=?, fecha=?, nombre=?, direccion=?, nit=?, total=?, cliente_id=?, orden_id=? WHERE no_factura=?";
    private static final String SQL_DELETE = "DELETE FROM factura WHERE id=?";
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Factura factura = null;
    private List<Factura> listaFacturas = new ArrayList<>();

    @Override
    public List<Factura> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                factura = new Factura(rs.getInt("no_factura"), rs.getString("serie"), rs.getDate("fecha"), 
                        rs.getString("nombre"), rs.getString("direccion"), rs.getString("nit"), rs.getDouble("total"), 
                        rs.getInt("cliente_id"), rs.getInt("orden_id"));
                listaFacturas.add(factura);
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar las facturas");
            e.printStackTrace(System.out);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaFacturas;
    }

    @Override
    public int add(Factura factura) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_INSERT);
            pstmt.setInt(1, factura.getNoFactura());
            pstmt.setString(2, factura.getSerie());
            pstmt.setDate(3, factura.getFecha());
            pstmt.setString(4, factura.getNombre());
            pstmt.setString(5, factura.getDireccion());
            pstmt.setString(6, factura.getNit());
            pstmt.setDouble(7, factura.getTotal());
            pstmt.setInt(8, factura.getClienteId());
            pstmt.setInt(9, factura.getOrdenId());
            
            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar insertar el registro: " + factura);
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }finally{
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return rows;
    }

    @Override
    public int update(Factura factura) {
        int rows = 0;

        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_UPDATE);
            pstmt.setString(1, factura.getSerie());
            pstmt.setDate(2, factura.getFecha());
            pstmt.setString(3, factura.getNombre());
            pstmt.setString(4, factura.getDireccion());
            pstmt.setString(5, factura.getNit());
            pstmt.setDouble(6, factura.getTotal());
            pstmt.setInt(7, factura.getClienteId());
            pstmt.setInt(8, factura.getOrdenId());
            pstmt.setInt(9, factura.getNoFactura());

            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar actualizar el siguiente registro: " + factura);
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
    public int delete(Factura factura) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, factura.getNoFactura());

            System.out.println(pstmt.toString());
            rows= pstmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id: " + factura.getNoFactura());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }finally{
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return rows;
    }

    @Override
    public Factura get(Factura factura) {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setInt(1, factura.getNoFactura());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                factura = new Factura(rs.getInt("no_factura"), rs.getString("serie"), rs.getDate("fecha"), 
                        rs.getString("nombre"), rs.getString("direccion"), rs.getString("nit"), rs.getDouble("total"), 
                        rs.getInt("cliente_id"), rs.getInt("orden_id"));
            }
            System.out.println("Estudiante: " + factura);
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar las facturas");
            e.printStackTrace(System.out);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return factura;
    }

    
}
