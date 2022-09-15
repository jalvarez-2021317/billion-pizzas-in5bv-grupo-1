package com.billionpizzas.models.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.sql.Time;
import java.io.Serializable;

/**
 *
 * @author Marcos Alcántara Hernández
 * @date 6/09/2022
 * @time 17:40:12
 */

@Entity
@Table(name = "menu")
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query ="from Menu"),    
    @NamedQuery(name = "Menu.find", query = "from Menu WHERE id = :id")
    //from menu hace referencia a la clase Menu, no ha la tabla de la base de datos, consulta entre objetos.
})

public class Menu implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_menu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_menu;
    
    @Column
    private Time horario_comida;
    @Column
    private Time horario_apertura;
    @Column
    private Time horario_cierre;
    @Column
    private int comidas_id;
    @Column
    private int bebidas_id;   
    
    //Constructor nulo
    public Menu(){   
    }
    
    //Eliminar
    public Menu(int id_menu) {
        this.id_menu = id_menu;
    }

    //Agregar
    public Menu(Time horario_comida, Time horario_apertura, Time horario_cierre, int comidas_id, int bebidas_id) {
        this.horario_comida = horario_comida;
        this.horario_apertura = horario_apertura;
        this.horario_cierre = horario_cierre;
        this.comidas_id = comidas_id;
        this.bebidas_id = bebidas_id;
    }
    
    //Modificar
    public Menu(int id_menu, Time horario_comida, Time horario_apertura, Time horario_cierre, int comidas_id, int bebidas_id) {
        this.id_menu = id_menu;
        this.horario_comida = horario_comida;
        this.horario_apertura = horario_apertura;
        this.horario_cierre = horario_cierre;
        this.comidas_id = comidas_id;
        this.bebidas_id = bebidas_id;
    }
    
    
    //Metodos Getter´s and Setter´s
    
    public int getId_menu() {
        return id_menu;
    }
    
    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public Time getHorario_comida() {
        return horario_comida;
    }

    public void setHorario_comida(Time horario_comida) {
        this.horario_comida = horario_comida;
    }

    public Time getHorario_apertura() {
        return horario_apertura;
    }

    public void setHorario_apertura(Time horario_apertura) {
        this.horario_apertura = horario_apertura;
    }

    public Time getHorario_cierre() {
        return horario_cierre;
    }

    public void setHorario_cierre(Time horario_cierre) {
        this.horario_cierre = horario_cierre;
    }

    public int getComidas_id() {
        return comidas_id;
    }

    public void setComidas_id(int comidas_id) {
        this.comidas_id = comidas_id;
    }

    public int getBebidas_id() {
        return bebidas_id;
    }

    public void setBebidas_id(int bebidas_id) {
        this.bebidas_id = bebidas_id;
    }
    
    
    //To String

    @Override
    public String toString() {
        return "Menu{" + "id_menu=" + id_menu + ", horario_comida=" + horario_comida + ", horario_apertura=" + horario_apertura + ", horario_cierre=" + horario_cierre + ", comidas_id=" + comidas_id + ", bebidas_id=" + bebidas_id + '}';
    }
   
}
