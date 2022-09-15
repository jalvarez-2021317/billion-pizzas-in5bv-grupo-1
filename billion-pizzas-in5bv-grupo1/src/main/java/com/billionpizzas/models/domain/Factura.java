package com.billionpizzas.models.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Carlos Emmanuel Pérez Simón
 * @date 4/09/2022
 * @time 20:55:50
 *
 * Codigo Tecnico: IN5BV
 *
 */

@Entity
@Table(name = "factura")
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query ="from Factura"),
    @NamedQuery(name = "Factura.find", query ="from Factura WHERE id = :noFactura")
})
public class Factura {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "no_factura")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int noFactura;
    @Column
    private String serie;
    @Column
    private Date fecha;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String nit;
    @Column
    private double total;
    @Column(name = "cliente_id")
    private int clienteId;
    @Column(name = "orden_id")
    private int ordenId;
    
    public Factura(){
        
    }
    
    public Factura(int noFactura){
        this.noFactura = noFactura;
    }

    public Factura(String serie, Date fecha, String nombre, String direccion, String nit, double total, int clienteId, int ordenId) {
        this.serie = serie;
        this.fecha = fecha;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.total = total;
        this.clienteId = clienteId;
        this.ordenId = ordenId;
    }
    
    

    public Factura(int noFactura, String serie, Date fecha, String nombre, String direccion, String nit, double total, int clienteId, int ordenId) {
        this.noFactura = noFactura;
        this.serie = serie;
        this.fecha = fecha;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.total = total;
        this.clienteId = clienteId;
        this.ordenId = ordenId;
    }

    public int getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(int noFactura) {
        this.noFactura = noFactura;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getOrdenId() {
        return ordenId;
    }

    public void setOrdenId(int ordenId) {
        this.ordenId = ordenId;
    }

    @Override
    public String toString() {
        return "Factura{" + "noFactura=" + noFactura + ", serie=" + serie + ", fecha=" + fecha + ", nombre=" + nombre + ", direccion=" + direccion + ", nit=" + nit + ", total=" + total + ", clienteId=" + clienteId + ", ordenId=" + ordenId + '}';
    }
    
}
