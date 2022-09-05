package com.billionpizzas.models.domain;

/**
 *
 * @author Joshua David Alvarez Calderon
 * @date 4 sep. 2022
 * @time 15:53:25
 */
public class Empleado {

    private int id_empleado;
    private int persona_id;
    private int tipo_empleado_id;
    
    // Contructor nulo
    public Empleado() {

    }
    // Contructores 
    public Empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Empleado(int persona_id, int tipo_empleado_id) {
        this.persona_id = persona_id;
        this.tipo_empleado_id = tipo_empleado_id;
    }
    

    public Empleado(int id_empleado, int persona_id, int tipo_empleado_id) {
        this.id_empleado = id_empleado;
        this.persona_id = persona_id;
        this.tipo_empleado_id = tipo_empleado_id;
    }
    
    // Geters and seters
    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }

    public int getTipo_empleado_id() {
        return tipo_empleado_id;
    }

    public void setTipo_empleado_id(int tipo_empleado_id) {
        this.tipo_empleado_id = tipo_empleado_id;
    }
    
    // To string
    @Override
    public String toString() {
        return "Empleado{" + "id_empleado=" + id_empleado + ", persona_id=" + persona_id + ", tipo_empleado_id=" + tipo_empleado_id + '}';
    }
    
    

}
