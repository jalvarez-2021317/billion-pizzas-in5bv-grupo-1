

package com.billionpizzas.models.domain;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.sql.Date;
import java.io.Serializable;

/**
 *
 * @author Kevin Josue Xulú Solis
 * @date 5/09/2022
 * Carne: 2021348
 * Código tecnico: IN5BV
 * Grupo: 1
 */

    @Entity
    @Table(name = "clientes")
    @NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query ="from Cliente"),
    @NamedQuery(name = "Cliente.find", query = "from Cliente WHERE id = :id")
    
})



public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_clientes")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_clientes;

     @Column
     private int idCliente;
     @Column
     private String nit;
     @Column
     private int personaId;
      
      


     public Cliente(){
        
    }
     
    public Cliente(int idCliente){
        this.idCliente = idCliente;
    }
      
    
    public Cliente(String nit, int personaId){
        this.nit = nit;
        this.personaId = personaId;
    }

    public Cliente(int idCliente, String nit, int personaId) {
        this.idCliente = idCliente;
        this.nit = nit;
        this.personaId = personaId;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nit=" + nit + ", personaId=" + personaId + '}';
    }
    
    
}
