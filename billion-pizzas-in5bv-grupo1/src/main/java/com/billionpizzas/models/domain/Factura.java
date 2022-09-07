package com.billionpizzas.models.domain;

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
public class Factura {
    private int noFactura;
    private String serie;
    private Date fecha;
    private String nombre;
    private String direccion;
    private String nit;
    private double total;
    private int clienteId;
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
