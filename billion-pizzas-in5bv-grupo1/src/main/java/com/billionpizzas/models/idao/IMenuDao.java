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
    
    //Buscar o encontrar un registro en específico
    public Menu get(Menu menu);
    
    //Agregar Registro
    public int add(Menu menu);
    
    //Modificar un Registro
    public int update(Menu menu);
    
    //Eliminar un Registro
    public int delete(Menu menu);
    
}
