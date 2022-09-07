
package com.billionpizzas.models.domain;

/**
 *
 * @author Isai Subuyuj
 */
public class Comida {

    private int id_comidas;
    private String nombre_comida;
    private int precio; 
    
    public Comida(){
        
    }
    
    public Comida(int id_comidas){
        this.id_comidas = id_comidas;
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
