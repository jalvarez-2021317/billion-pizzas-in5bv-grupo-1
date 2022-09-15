package com.billionpizzas.models.dao;

import com.billionpizzas.models.domain.Bebida;
import com.billionpizzas.models.idao.IBebidaDao;
import java.util.List;
import com.billionpizzas.db.ConexionPU;

/**
 *
 * @author Marcos Alcántara Hernández
 * @date 13/09/2022
 * @time 15:31:52
 */
public class BebidaDaoJPA implements IBebidaDao{
    
    private ConexionPU con = ConexionPU.getInstance();

    @Override
    public List<Bebida> getAll() {
        return con.getEntityManager().createNamedQuery("Bebida.findAll").getResultList();
    }

    @Override
    public Bebida get(Bebida bebida) {
        return (Bebida) con.getEntityManager().createNamedQuery("Bebida.find")
                .setParameter("id", bebida.getId_bebidas()).getSingleResult();
    }

    @Override
    public int add(Bebida bebida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Bebida bebida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Bebida bebida) {
        int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(bebida);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
            //rollback regresa to a como estaba antes si se genera algun problema
        }
        return rows;
    }

}
