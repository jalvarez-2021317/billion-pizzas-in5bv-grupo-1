package com.billionpizzas.models.dao;

/**
 *
 * @author Carlos Emmanuel Pérez Simón
 * @date 12/09/2022
 * @time 21:56:42
 *
 * Codigo Tecnico: IN5BV
 *
 */
import com.billionpizzas.db.ConexionPU;
import com.billionpizzas.models.domain.Persona;
import com.billionpizzas.models.idao.IPersonaDao;
import java.util.List;

public class PersonaDaoJPA implements IPersonaDao{
    
    private ConexionPU con = ConexionPU.getInstance();
    
    @Override
    public List<Persona> getAll() {
        return con.getEntityManager().createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona get(Persona persona) {
        return (Persona) con.getEntityManager().createNamedQuery("Persona.find").setParameter("dpi", persona.getDpi()).getSingleResult();
    }

    @Override
    public int add(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Persona persona) {
        int rows = 0;
        try{
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(persona);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        }catch(Exception e){
            e.printStackTrace();
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }
}
