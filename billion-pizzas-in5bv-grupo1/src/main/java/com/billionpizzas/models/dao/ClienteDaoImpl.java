

package com.billionpizzas.models.dao;

/**
 *
 * @author Kevin Josue Xulú Solis
 * @date 5/09/2022
 * Carne: 2021348
 * Código tecnico: IN5BV
 * Grupo: 1
 */

import com.billionpizzas.db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.billionpizzas.models.idao.IClienteDao;
import com.billionpizzas.models.domain.Cliente;


public class ClienteDaoImpl implements IClienteDao{
    private static final String SQL_SELECT = "SELECT id_cliente, nit, persona_id FROM clientes";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Cliente cliente = null;
    private List<Cliente> listaClientes = new ArrayList<>();
    
    @Override
    public List<Cliente> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                cliente = new Cliente(rs.getInt("id_cliente"), rs.getString("nit"), rs.getInt("persona_id"));
                listaClientes.add(cliente);
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar clientes");
            e.printStackTrace(System.out);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaClientes;
    }
    
    
    @Override
    public boolean add(Cliente cliente) {
        return false;
    }

    @Override
    public boolean update(Cliente cliente) {
        return false;
    }

    @Override
    public boolean delete(Cliente cliente) {
        return false;
    }

    
}
