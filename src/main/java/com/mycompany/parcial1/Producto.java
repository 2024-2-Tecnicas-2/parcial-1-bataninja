package com.mycompany.parcial1;

public abstract class Producto {
    private String nombre;
    private String marca;
    private String descripcion;
    private double precio;
    private int cantidad;
    
    public Producto(String nombre, String marca, String descripcion, double precio, int cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String mostrarInfo(){
        return ("Nombre: " + getNombre() + ". Marca: " + getMarca() + ". Descripción: " + getDescripcion() + ". Precio: " + getPrecio() + ". Cantidad disponible: " + getCantidad());
    }
    
}
