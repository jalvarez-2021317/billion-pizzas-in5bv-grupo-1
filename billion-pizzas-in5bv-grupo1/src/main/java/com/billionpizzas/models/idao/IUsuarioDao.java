package com.billionpizzas.models.idao;

/**
 *
 * @author Kevin Josue Xulú Solis
 * @date 4/09/2022
 * Carne: 2021348
 * Código tecnico: IN5BV
 * Grupo: 1
 * 
 */
import com.billionpizzas.models.domain.Usuario;
import java.util.List;

public interface IUsuarioDao {
    // Listar todos los registros
    public List<Usuario> getAll();
    
    //Agregar un nuevo registro
    public boolean add(Usuario usuario);
    
    //Modificar un registro
    public boolean update(Usuario usuario);
    
    //Eliminar un registro
    public boolean delete(Usuario usuario);
}
