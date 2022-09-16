package com.billionpizzas.models.domain;

/*
 * @author Jeremy Josep Cardona Orenos
 * @date 5/09/2022
 * @time 19:57:09
 * 
 */
public class Proveedores {
    private int id;
    private String nombre_empresa;
    private String telefono;
    private String correo;
    
    // Contructor nulo
    public Proveedores(){
        
    }
    
    // Contructores 
    public Proveedores(int id) {
        this.id = id;
    }
    
     public Proveedores(String nombre_empresa, String telefono, String correo){
        this.nombre_empresa = nombre_empresa;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public Proveedores(int id, String nombre_empresa, String telefono, String correo){
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public String toString(){
        return "´Proveedores{" + "id=" + id + ", nombre_empresa=" + nombre_empresa + ", telefono=" + telefono + ", correo" + correo + '}'; 
    }
}
