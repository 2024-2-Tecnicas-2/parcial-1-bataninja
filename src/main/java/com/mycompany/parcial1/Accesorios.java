package com.mycompany.parcial1;

public class Accesorios extends Producto {
    
    private String tipoProducto;
    
    public Accesorios(String nombre, String marca, String descripcion, double precio, int cantidad, String tipoProducto) {
        super(nombre, marca, descripcion, precio, cantidad);
        this.tipoProducto = tipoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    @Override
    public String mostrarInfo(){
        return ("Nombre: " + getNombre() + ". Marca: " + getMarca() + ". Descripción: " + getDescripcion() + ". Precio: " + getPrecio() + ". Cantidad disponible: " + getCantidad() + ". Tipo de producto: " + getTipoProducto());
    }
    
}
