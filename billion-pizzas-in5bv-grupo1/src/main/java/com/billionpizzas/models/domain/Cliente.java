

package com.billionpizzas.models.domain;

/**
 *
 * @author Kevin Josue Xulú Solis
 * @date 5/09/2022
 * Carne: 2021348
 * Código tecnico: IN5BV
 * Grupo: 1
 */
public class Cliente {
     private int idCliente;
     private String nit;
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
