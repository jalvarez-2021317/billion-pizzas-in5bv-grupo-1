package com.billionpizzas.models.dao;

/**
 *
 * @author Isai Subuyuj
 */
import com.billionpizzas.db.ConexionPU;
import com.billionpizzas.models.domain.Comida;
import com.billionpizzas.models.idao.IComidaDao;
import java.util.List;

public class ComidaDaoJPA implements IComidaDao{

    private ConexionPU con = ConexionPU.getInstance();

    @Override
    public List<Comida> getAll() {
        return con.getEntityManager().createNamedQuery("Comida.findAll").getResultList();
    }

    @Override
    public Comida get(Comida comida) {
        return (Comida) con.getEntityManager().createNamedQuery("Comida.find").setParameter("id_comidas", comida.getId_comidas()).getSingleResult();
    }

    @Override
    public int add(Comida comida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Comida comida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Comida comida) {
        int rows = 0;
        try{
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(comida);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        }catch (Exception e){
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
