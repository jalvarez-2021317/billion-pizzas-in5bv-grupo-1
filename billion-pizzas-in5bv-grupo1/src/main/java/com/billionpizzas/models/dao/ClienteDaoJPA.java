package com.billionpizzas.models.dao;

import com.billionpizzas.models.domain.Cliente;
import com.billionpizzas.models.idao.IClienteDao;
import java.util.List;
import com.billionpizzas.db.ConexionPU;

/**
 *
 * @author Kevin Josué Xulu Solis
 * @date 13/09/2022
 * Código tecnico: IN5BV
 * Grupo: 1
 */

public class ClienteDaoJPA implements IClienteDao{
    
    private ConexionPU con = ConexionPU.getInstance();

    @Override
    public List<Cliente> getAll() {
        return con.getEntityManager().createNamedQuery("Cliente.findAll").getResultList();
    }

    @Override
    public Cliente get(Cliente cliente) {
        return (Cliente) con.getEntityManager().createNamedQuery("Cliente.find")
                .setParameter("id", cliente.getId_clientes()).getSingleResult();
    }

    @Override
    public int add(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Cliente cliente) {
        int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(cliente);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
           
        }
        return rows;
    }

}
