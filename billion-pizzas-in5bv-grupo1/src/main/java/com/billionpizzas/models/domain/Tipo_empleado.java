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
@Table(name = "tipos_empleados")
@NamedQueries ({
    @NamedQuery(name = "Tipo_empleado.findAll", query = "from Tipo_empleado"),
    @NamedQuery(name = "Tipo_empleado.find", query = "from Tipo_empleado WHERE id = :id")
})
public class Tipo_empleado implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
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

    public Tipo_empleado(String puesto) {
        this.puesto = puesto;
    }

    
    
    
    
    
    
    
}
