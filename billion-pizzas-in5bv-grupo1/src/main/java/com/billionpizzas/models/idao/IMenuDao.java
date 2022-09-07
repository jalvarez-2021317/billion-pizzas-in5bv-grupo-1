package com.billionpizzas.models.idao;

import com.billionpizzas.models.domain.Menu;
import java.util.List;

/**
 *
 * @author Marcos Alcántara
 */

public interface IMenuDao {
    
    //Listar Registros
    public List<Menu> getAll();
    
    //Agregar Registro
    public boolean add(Menu menu);
    
    //Modificar un Registro
    public boolean update(Menu menu);
    
    //Eliminar un Registro
    public boolean delete(Menu menu);
    
}
