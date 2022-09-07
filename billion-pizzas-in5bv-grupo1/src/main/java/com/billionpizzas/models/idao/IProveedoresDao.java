package com.billionpizzas.models.idao;

import com.billionpizzas.models.domain.Proveedores;
import java.util.List;

/**
 *
 * @author Jeremy Joseph Cardona Orenos
 */
public interface IProveedoresDao {
    //Listar registros
    public List<Proveedores> getAll();
    
    
    // Agregar un nuevo Registro
    public boolean add(Proveedores proveedores);
    
    // Modificar un registro
    public boolean update(Proveedores proveedores);
    
    // Eliminar un registro
    
    public boolean delete(Proveedores proveedores);
}
