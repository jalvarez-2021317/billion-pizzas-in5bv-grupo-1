package com.billionpizzas.models.domain;

/**
 *
 * @author Isai Subuyuj
 */
public class Tipo_empleado {

    private int id;
    private String puesto;
    
    public Tipo_empleado(){
        
    }
    
    public Tipo_empleado(int id){
        this.id = id; 
    }

    public Tipo_empleado(int id, String puesto) {
        this.id = id;
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
    
    
    
    
    
}
