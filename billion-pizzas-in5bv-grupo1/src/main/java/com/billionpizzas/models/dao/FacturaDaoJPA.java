package com.billionpizzas.models.dao;

/**
 *
 * @author Carlos Emmanuel Pérez Simón
 * @date 13/09/2022
 * @time 23:03:39
 *
 * Codigo Tecnico: IN5BV
 *
 */
import com.billionpizzas.db.ConexionPU;
import com.billionpizzas.models.domain.Factura;
import com.billionpizzas.models.idao.IFacturaDao;
import java.util.List;

public class FacturaDaoJPA implements IFacturaDao{
    private ConexionPU con = ConexionPU.getInstance();

    @Override
    public List<Factura> getAll() {
        return con.getEntityManager().createNamedQuery("Factura.findAll").getResultList();
    }

    @Override
    public Factura get(Factura factura) {
        return (Factura) con.getEntityManager().createNamedQuery("Factura.find").setParameter("noFactura", factura.getNoFactura()).getSingleResult();
    }

    @Override
    public int add(Factura factura) {
        int rows = 0;
        try{
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().persist(factura);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        }catch(Exception e){
            System.err.println("Se produjo un error al intentar insertar el siguiente registro: " + factura.toString());
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }

    @Override
    public int update(Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Factura factura) {
        int rows = 0;
        try{
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(factura);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        }catch(Exception e){
            e.printStackTrace();
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }
}
