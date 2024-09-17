
package com.mycompany.parcial1;

public class Telefono extends Producto {
    
    private double pulgadas;
    private double resolucionCamara;
    
    public Telefono(String nombre, String marca, String descripcion, double precio, int cantidad, double pulgadas, double resolucionCamara) {
        super(nombre, marca, descripcion, precio, cantidad);
        this.pulgadas = pulgadas;
        this.resolucionCamara = resolucionCamara;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public double getResolucionCamara() {
        return resolucionCamara;
    }

    public void setResolucionCamara(double resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
    }
    
    @Override
    public String mostrarInfo(){
        return ("Nombre: " + getNombre() + ". Marca: " + getMarca() + ". Descripción: " + getDescripcion() + ". Precio: " + getPrecio() + ". Cantidad disponible: " + getCantidad() + ". Pulgadas: " + getPulgadas() + ". Resolución camara: " + getResolucionCamara());
    }
}
