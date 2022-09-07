
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
    //Agregar nuevos registros 
    public boolean add(Comida comida);
    //Modificar registros 
    public boolean update(Comida comida); 
    //Eliminar registros 
    public boolean delete(Comida comida);
    
}
