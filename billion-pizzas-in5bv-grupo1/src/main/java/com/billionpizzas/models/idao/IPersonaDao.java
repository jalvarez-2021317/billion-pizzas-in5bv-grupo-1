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
    
    //Agregar un nuevo registro
    public boolean add(Persona factura);
    
    //Modificar un registro
    public boolean update(Persona factura);
    
    //Eliminar un registro
    public boolean delete(Persona factura);
}
