package com.mycompany.parcial1;
import java.util.ArrayList;

public class Cliente {
    
    private String nombre;
    private String telefono;
    private String direccion;
    private ArrayList<Pedido> listaPedidos;

    public Cliente(String nombre, String telefono, String direccion, ArrayList<Pedido> listaPedidos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.listaPedidos = listaPedidos;
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

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
    
    public void procesarPedido(Pedido pedido){
        for (int i = 0; i < listaPedidos.size(); i++){
            if(listaPedidos.get(i).equals(pedido)){
                System.out.println("Pedido procesado.");
                listaPedidos.get(i).mostrarInformacionPedido();
                listaPedidos.get(i).procesarProductos();
            }     
        }
    }

   
    
    
}
