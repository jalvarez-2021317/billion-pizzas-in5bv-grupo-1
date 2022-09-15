package com.billionpizzas.models.idao;

/**
 *
 * @author Carlos Emmanuel Pérez Simón
 * @date 4/09/2022
 * @time 20:55:22
 * 
 */
import com.billionpizzas.models.domain.Factura;
import java.util.List;

public interface IFacturaDao {
    // Listar todos los registros
    public List<Factura> getAll();
    
    // Buscar o encontrar un registro en específico
    public Factura get(Factura estudiante);
    
    //Agregar un nuevo registro
    public int add(Factura factura);
    
    //Modificar un registro
    public int update(Factura factura);
    
    //Eliminar un registro
    public int delete(Factura factura);
}
