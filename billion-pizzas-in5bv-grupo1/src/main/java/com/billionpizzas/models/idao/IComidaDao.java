
package com.billionpizzas.models.idao;

import com.billionpizzas.models.domain.Comida;
import java.util.List;

/**
 *
 * @author Isai Subuyuj 
 */
public interface IComidaDao {
    //Listar registros
    public List<Comida> getAll();
    //Buscar o encontrar un registro en especifico 
    public Comida get(Comida comida);
    //Agregar nuevos registros 
    public int add(Comida comida);
    //Modificar registros 
    public int update(Comida comida); 
    //Eliminar registros 
    public int delete(Comida comida);
    
}
