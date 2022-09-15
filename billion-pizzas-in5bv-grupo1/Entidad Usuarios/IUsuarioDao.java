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

    //Bucar un registro en especifo
    public Usuario get(Usuario usuario);
    
    
    //Agregar un nuevo registro
    public int add(Usuario usuario);
    
    //Modificar un registro
    public int update(Usuario usuario);
    
    //Eliminar un registro
    public int delete(Usuario usuario);
}
