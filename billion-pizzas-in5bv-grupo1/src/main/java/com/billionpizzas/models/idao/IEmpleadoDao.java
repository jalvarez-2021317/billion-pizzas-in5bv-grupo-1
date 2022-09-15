package com.billionpizzas.models.idao;

import com.billionpizzas.models.domain.Empleado;
import java.util.List;

/**
 *
 * @author Joshua David Alvarez Calderon
 */
public interface IEmpleadoDao {
    //Listar registros
    public List<Empleado> getAll();
    
    public Empleado get(Empleado empleado);
    
    
    // Agregar un nuevo Registro
    public boolean add(Empleado empleado);
    
    // Modificar un registro
    public boolean update(Empleado empleado);
    
    // Eliminar un registro
    
    public int delete(Empleado empleado);
}
