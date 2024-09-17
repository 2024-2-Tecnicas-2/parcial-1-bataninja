package com.mycompany.parcial1;

public class Laptop extends Producto {
    
    private double cantidadRam;
    private double cantidadVideo;
    
    public Laptop(String nombre, String marca, String descripcion, double precio, int cantidad, double cantidadRam, double cantidadVideo) {
        super(nombre, marca, descripcion, precio, cantidad);
        this.cantidadRam = cantidadRam;
        this.cantidadVideo = cantidadVideo;
                
    }

    public double getCantidadRam() {
        return cantidadRam;
    }

    public void setCantidadRam(double cantidadRam) {
        this.cantidadRam = cantidadRam;
    }

    public double getCantidadVideo() {
        return cantidadVideo;
    }

    public void setCantidadVideo(double cantidadVideo) {
        this.cantidadVideo = cantidadVideo;
    }
    
    @Override
    public String mostrarInfo(){
        return ("Nombre: " + getNombre() + ". Marca: " + getMarca() + ". Descripción: " + getDescripcion() + ". Precio: " + getPrecio() + ". Cantidad disponible: " + getCantidad() + ". Cantidad Ram: " + getCantidadRam() + ". Cantidad Video: " + getCantidadVideo());
    }
}
