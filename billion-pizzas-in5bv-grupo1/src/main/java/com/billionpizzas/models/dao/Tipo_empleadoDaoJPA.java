package com.billionpizzas.models.dao;

/**
 *
 * @author Isai Subuyuj
 */
import com.billionpizzas.db.ConexionPU;
import com.billionpizzas.models.domain.Tipo_empleado;
import com.billionpizzas.models.idao.ITipo_empleadoDao;
import java.util.List;

public class Tipo_empleadoDaoJPA implements ITipo_empleadoDao{

    private ConexionPU con = ConexionPU.getInstance();

    @Override
    public List<Tipo_empleado> getAll() {
        return con.getEntityManager().createNamedQuery("Tipo_empleado.findAll").getResultList();
    }

    @Override
    public Tipo_empleado get(Tipo_empleado tipo_empleado) {
        return (Tipo_empleado) con.getEntityManager().createNamedQuery("Tipo_empleado.find").setParameter("id", tipo_empleado.getId()).getSingleResult();
    }

    @Override
    public int add(Tipo_empleado tipo_empleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Tipo_empleado tipo_empleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Tipo_empleado tipo_empleado) {
        int rows = 0;
        try{
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(tipo_empleado);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        }catch (Exception e){
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
        }
        return rows; 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
