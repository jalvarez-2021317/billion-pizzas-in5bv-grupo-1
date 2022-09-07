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
    public boolean add(Factura factura) {
        return false;
    }

    @Override
    public boolean update(Factura factura) {
        return false;
    }

    @Override
    public boolean delete(Factura factura) {
        return false;
    }
}
