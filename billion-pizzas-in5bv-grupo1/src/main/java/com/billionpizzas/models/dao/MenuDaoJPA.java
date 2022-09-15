package com.billionpizzas.models.dao;

import com.billionpizzas.models.domain.Menu;
import com.billionpizzas.models.idao.IMenuDao;
import java.util.List;
import com.billionpizzas.db.ConexionPU;

/**
 *
 * @author Marcos Alcántara Hernández
 * @date 13/09/2022
 * @time 15:30:05
 */

public class MenuDaoJPA implements IMenuDao {
    
    private ConexionPU con = ConexionPU.getInstance();

    @Override
    public List<Menu> getAll() {
        return con.getEntityManager().createNamedQuery("Menu.findAll").getResultList();
    }

    @Override
    public Menu get(Menu menu) {
        return (Menu) con.getEntityManager().createNamedQuery("Menu.find")
                .setParameter("id", menu.getId_menu()).getSingleResult();
    }

    @Override
    public int add(Menu menu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Menu menu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Menu menu) {
        int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(menu);
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
