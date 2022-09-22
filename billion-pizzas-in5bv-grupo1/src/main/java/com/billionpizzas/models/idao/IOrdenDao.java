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
    
     public Orden get(Orden Orden);
    
    
    // Agregar un nuevo Registro
    public int add(Orden orden);
    
    // Modificar un registro
    public int update(Orden orden);
    
    // Eliminar un registro
    
    public int delete(Orden orden);
}
