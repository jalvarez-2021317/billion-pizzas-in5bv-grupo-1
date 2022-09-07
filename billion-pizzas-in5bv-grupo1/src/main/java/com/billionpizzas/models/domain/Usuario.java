

package com.billionpizzas.models.domain;

/**
 *
 * @author Kevin Josue Xulú Solis
 * @date 4/09/2022
 * Carne: 2021348
 * Código tecnico: IN5BV
 * Grupo: 1
 */

public class Usuario {
    private String user;
    private String password;
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
