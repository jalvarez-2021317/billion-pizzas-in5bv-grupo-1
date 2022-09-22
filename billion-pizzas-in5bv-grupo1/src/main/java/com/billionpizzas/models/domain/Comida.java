
package com.billionpizzas.models.domain;

/**
 *
 * @author Isai Subuyuj
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
@Table(name = "comidas")
@NamedQueries ({
    @NamedQuery(name = "Comida.findAll", query = "from Comida"),
    @NamedQuery(name = "Comida.find", query = "from Comida WHERE id_comidas = : id_comidas")
})
public class Comida implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_comidas")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_comidas;
    
    @Column
    private String nombre_comida;
    
    @Column
    private int precio; 
    
    public Comida(){
        
    }
    
    public Comida(int id_comidas){
        this.id_comidas = id_comidas;
    }

    public Comida(String nombre_comida, int precio) {
        this.nombre_comida = nombre_comida;
        this.precio = precio;
    }

    public Comida(int id_comidas, String nombre_comida, int precio) {
        this.id_comidas = id_comidas;
        this.nombre_comida = nombre_comida;
        this.precio = precio;
    }

    public int getId_comidas() {
        return id_comidas;
    }

    public void setId_comidas(int id_comidas) {
        this.id_comidas = id_comidas;
    }

    public String getNombre_comida() {
        return nombre_comida;
    }

    public void setNombre_comida(String nombre_comida) {
        this.nombre_comida = nombre_comida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
    
    
    
}
