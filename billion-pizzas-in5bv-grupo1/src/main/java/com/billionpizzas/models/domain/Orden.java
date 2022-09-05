package com.billionpizzas.models.domain;

import java.sql.Time;

/**
 *
 * @author Joshua David Alvarez Calderon
 * @date 4 sep. 2022
 * @time 15:53:33
 */
public class Orden {

    private int id_orden;
    private Time hora_entrega;
    private int cliente_id;
    private int menu_id;
    
    // contructor Nulo
    public Orden() {

    }
    
    // constructores 

    public Orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public Orden(int id_orden, Time hora_entrega, int cliente_id, int menu_id) {
        this.id_orden = id_orden;
        this.hora_entrega = hora_entrega;
        this.cliente_id = cliente_id;
        this.menu_id = menu_id;
    }

    public Orden(Time hora_entrega, int cliente_id, int menu_id) {
        this.hora_entrega = hora_entrega;
        this.cliente_id = cliente_id;
        this.menu_id = menu_id;
    }

   //Geters And Seters

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public Time getHora_entrega() {
        return hora_entrega;
    }

    public void setHora_entrega(Time hora_entrega) {
        this.hora_entrega = hora_entrega;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }
    
    // TO String

    @Override
    public String toString() {
        return "Orden{" + "id_orden=" + id_orden + ", hora_entrega=" + hora_entrega + ", cliente_id=" + cliente_id + ", menu_id=" + menu_id + '}';
    }
    
    
    
}
