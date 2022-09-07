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
    
    //Agregar Registro
    public boolean add(Bebida bebida);
    
    //Modificar un Registro
    public boolean update(Bebida bebida);
    
    //Eliminar un Registro
    public boolean delete(Bebida bebida);
    
}
