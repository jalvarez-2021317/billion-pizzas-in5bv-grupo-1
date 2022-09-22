

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
 * @date 4/09/2022
 * Carne: 2021348
 * Código tecnico: IN5BV
 * Grupo: 1
 */
@Entity
@Table(name = "usuarios")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query ="from Usuario"),
    @NamedQuery(name = "Usuario.find", query = "from Usuario WHERE id = :user")
  
})

public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L; 

    @Id
    @Column(name = "user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String user;
    @Column
    private String password;
    @Column(name = "empleado_id");
    private int empleadoId;
    
    public Usuario(){
        
    }
    
     
    public Usuario(String user){
        this.user = user;
    }

    public Usuario(String password, int empleadoId) {
        this.password = password;
        this.empleadoId = empleadoId;
    }

    public Usuario(String user, String password, int empleadoId) {
        this.user = user;
        this.password = password;
        this.empleadoId = empleadoId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    @Override
    public String toString() {
        return "Usuario{" + "user=" + user + ", password=" + password + ", empleadoId=" + empleadoId + '}';
    }
    
    
}
