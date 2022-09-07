package com.billionpizzas.models.idao;

import com.billionpizzas.models.domain.Tipo_empleado;
import java.util.List;
/**
 *
 * @author Isai Subuyuj 
 */
public interface ITipo_empleadoDao {
    //Listar registros
    public List<Tipo_empleado> getAll();
    //Agregar nuevos registros 
    public boolean add(Tipo_empleado tipo_empleado);
    //Modificar registros 
    public boolean update(Tipo_empleado tipo_empleado); 
    //Eliminar registros 
    public boolean delete(Tipo_empleado tipo_empleado);
    
}
