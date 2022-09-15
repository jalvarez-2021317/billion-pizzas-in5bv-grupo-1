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
    //Buscar o encontrar un registro en especifico 
    public Tipo_empleado get(Tipo_empleado tipo_empleado);
    //Agregar nuevos registros 
    public int add(Tipo_empleado tipo_empleado);
    //Modificar registros 
    public int update(Tipo_empleado tipo_empleado); 
    //Eliminar registros 
    public int delete(Tipo_empleado tipo_empleado);
    
}
