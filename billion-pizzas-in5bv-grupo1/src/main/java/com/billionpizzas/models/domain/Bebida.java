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
 * @author Marcos Alcántara Hernández
 * @date 6/09/2022
 * @time 18:02:19
 */

@Entity
@Table(name = "bebidas")
@NamedQueries({
    @NamedQuery(name = "Bebida.findAll", query ="from Bebida"),
    @NamedQuery(name = "Bebida.find", query = "from Bebida WHERE id = :id")
    //from Bebida hace referencia a la clase Bebida, no ha la tabla de la base de datos, consulta entre objetos.
})

public class Bebida implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_bebidas")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_bebidas;
    
    @Column
    private String nombre_bebidas;
    @Column
    private Date fecha_caducida;
    @Column
    private int precio;
    @Column
    private int proveedor_id;
    
    //Constructor nulo
    public Bebida() {
    }
    
    //Eliminar
    public Bebida(int id_bebidas) {
        this.id_bebidas = id_bebidas;
    }
    
    //Agregar
    public Bebida(String nombre_bebidas, Date fecha_caducida, int precio, int proveedor_id) {
        this.nombre_bebidas = nombre_bebidas;
        this.fecha_caducida = fecha_caducida;
        this.precio = precio;
        this.proveedor_id = proveedor_id;
    }
    
    //Modificar
    public Bebida(int id_bebidas, String nombre_bebidas, Date fecha_caducida, int precio, int proveedor_id) {
        this.id_bebidas = id_bebidas;
        this.nombre_bebidas = nombre_bebidas;
        this.fecha_caducida = fecha_caducida;
        this.precio = precio;
        this.proveedor_id = proveedor_id;
    }
    
    
    //Metodos Getter´s and Setter´s
    public int getId_bebidas() {
        return id_bebidas;
    }

    public void setId_bebidas(int id_bebidas) {
        this.id_bebidas = id_bebidas;
    }

    public String getNombre_bebidas() {
        return nombre_bebidas;
    }

    public void setNombre_bebidas(String nombre_bebidas) {
        this.nombre_bebidas = nombre_bebidas;
    }

    public Date getFecha_caducida() {
        return fecha_caducida;
    }

    public void setFecha_caducida(Date fecha_caducida) {
        this.fecha_caducida = fecha_caducida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getProveedor_id() {
        return proveedor_id;
    }

    public void setProveedor_id(int proveedor_id) {
        this.proveedor_id = proveedor_id;
    }
    
    //To String
    @Override
    public String toString() {
        return "Bebida{" + "id_bebidas=" + id_bebidas + ", nombre_bebidas=" + nombre_bebidas + ", fecha_caducida=" + fecha_caducida + ", precio=" + precio + ", proveedor_id=" + proveedor_id + '}';
    }

}
