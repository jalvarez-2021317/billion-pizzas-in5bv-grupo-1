package com.billionpizzas.models.idao;

import com.billionpizzas.models.domain.Bebida;
import java.util.List;

/**
 *
 * @author arielosocfedeqqwwwww
 */

public interface IBebidaDao {
    
    //Listar Registros
    public List<Bebida> getAll();
    
    //Buscar o encontrar un registro en específico
    public Bebida get(Bebida bebida);
    
    //Agregar Registro
    public int add(Bebida bebida);
    
    //Modificar un Registro
    public int update(Bebida bebida);
    
    //Eliminar un Registro
    public int delete(Bebida bebida);
    
}
