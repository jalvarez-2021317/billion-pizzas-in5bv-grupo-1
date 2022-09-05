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
    private Time hora_de_entrega;
    private int id_cliente;
    private int menu_id;
    
    // contructor Nulo
    public Orden() {

    }
    
    // constructores 

    public Orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public Orden(int id_orden, Time hora_de_entrega, int id_cliente, int menu_id) {
        this.id_orden = id_orden;
        this.hora_de_entrega = hora_de_entrega;
        this.id_cliente = id_cliente;
        this.menu_id = menu_id;
    }

    public Orden(Time hora_de_entrega, int id_cliente, int menu_id) {
        this.hora_de_entrega = hora_de_entrega;
        this.id_cliente = id_cliente;
        this.menu_id = menu_id;
    }

    

    
    
    // geters And Seters

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public Time getHora_de_entrega() {
        return hora_de_entrega;
    }

    public void setHora_de_entrega(Time hora_de_entrega) {
        this.hora_de_entrega = hora_de_entrega;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }
    
    // To String

    @Override
    public String toString() {
        return "Orden{" + "id_orden=" + id_orden + ", hora_de_entrega=" + hora_de_entrega + ", id_cliente=" + id_cliente + ", menu_id=" + menu_id + '}';
    }
    
    
    
}
