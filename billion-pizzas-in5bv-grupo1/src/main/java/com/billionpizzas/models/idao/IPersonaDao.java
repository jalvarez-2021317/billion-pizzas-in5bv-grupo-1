package com.billionpizzas.models.idao;

/**
 *
 * @author Carlos Emmanuel Pérez Simón
 * @date 4/09/2022
 * @time 23:08:18
 * 
 */
import com.billionpizzas.models.domain.Persona;
import java.util.List;

public interface IPersonaDao {
    // Listar todos los registros
    public List<Persona> getAll();
    
    // Buscar o encontrar un registro en específico
    public Persona get(Persona persona);
    
    //Agregar un nuevo registro
    public int add(Persona persona);
    
    //Modificar un registro
    public int update(Persona persona);
    
    //Eliminar un registro
    public int delete(Persona persona);
}
