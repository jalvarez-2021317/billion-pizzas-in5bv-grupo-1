package com.billionpizzas.models.idao;

import com.billionpizzas.models.domain.Orden;
import java.util.List;

/**
 *
 * @author Joshua David Alvarez Calderon
 */
public interface IOrdenDao {
    //Listar registros
    public List<Orden> getAll();
    
    
    // Agregar un nuevo Registro
    public boolean add(Orden orden);
    
    // Modificar un registro
    public boolean update(Orden orden);
    
    // Eliminar un registro
    
    public boolean delete(Orden orden);
}