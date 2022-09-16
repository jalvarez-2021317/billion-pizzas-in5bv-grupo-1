
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

    //Buscar un registro en especifico
    public Cliente get(Cliente cliente);
    
    
    //Agregar un nuevo registro
    public int add(Cliente cliente);
    
    //Modificar un registro
    public int update(Cliente cliente);
    
    //Eliminar un registro
    public int delete(Cliente cliente);
}
