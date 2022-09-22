package com.billionpizzas.models.dao;

import com.billionpizzas.models.domain.Usuario;
import com.billionpizzas.models.idao.IUsuarioDao;
import java.util.List;
import com.billionpizzas.db.ConexionPU;

/**
 *
 * @author Kevin Josué Xulu Solis
 * @date 13/09/2022
 * Código tecnico: IN5BV
 * Grupo: 1
 */
public class UsuarioDaoJPA implements IUsuarioDao{
    
    private ConexionPU con = ConexionPU.getInstance();

    @Override
    public List<Usuario> getAll() {
        return con.getEntityManager().createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario get(Usuario usuario) {
        return (Usuario) con.getEntityManager().createNamedQuery("Usuario.find")
                .setParameter("id", usuario.getId_usuarios()).getSingleResult();
    }

    @Override
    public int add(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Usuario usuario) {
        int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(usuario);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }

}
