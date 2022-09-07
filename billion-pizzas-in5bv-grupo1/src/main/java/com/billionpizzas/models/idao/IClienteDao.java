
package com.billionpizzas.models.idao;

/**
 *
 * @author Kevin Josue Xulú Solis
 */

import com.billionpizzas.models.domain.Cliente;
import java.util.List;

public interface IClienteDao {
     // Listar todos los registros
    public List<Cliente> getAll();
    
    //Agregar un nuevo registro
    public boolean add(Cliente cliente);
    
    //Modificar un registro
    public boolean update(Cliente cliente);
    
    //Eliminar un registro
    public boolean delete(Cliente cliente);
}
