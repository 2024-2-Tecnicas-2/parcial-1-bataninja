package com.mycompany.parcial1;
import java.util.ArrayList;

public class Pedido {
    
    private ArrayList<Producto> listaProductos;
    private ArrayList<Integer> listaCantidadSolicitada;

    public Pedido(Cliente cliente, ArrayList<Producto> listaProductos, ArrayList<Integer> listaCantidadSolicitada) {
        this.listaProductos = listaProductos;   
        this.listaCantidadSolicitada = listaCantidadSolicitada;
    }
    
    public void agregarProductoPedido(Producto producto, int cantidadSolicitada){
        if(producto.getCantidad() >= cantidadSolicitada){
            listaProductos.add(producto);
            listaCantidadSolicitada.add(cantidadSolicitada);
        }
    }
    
    public void eliminarProductoPedido(Producto productoEliminar){
        for(int i = 0; i < listaProductos.size(); i++){
            if(listaProductos.get(i).equals(productoEliminar)){
                listaProductos.remove(i);
                listaCantidadSolicitada.remove(i);
            }
        }
    }
    
    public void mostrarInformacionPedido(){
        double precioTotal = 0;
        System.out.println("Información pedido: \n");
        for(int i = 0; i < listaProductos.size(); i++){
            System.out.println("--------------------------");
            System.out.println("Producto 1" + i + ":");
            System.out.println(listaProductos.get(i).mostrarInfo());
            System.out.println("Cantidad solicitada: " + listaCantidadSolicitada.get(i));
            System.out.println("Precio: " + (listaProductos.get(i).getPrecio()*listaCantidadSolicitada.get(i)));
            precioTotal += listaProductos.get(i).getPrecio()*listaCantidadSolicitada.get(i);
            System.out.println("");
        } 
        System.out.println("Precio total: " + precioTotal);
    }
    
    public void procesarProductos(){
        Producto producto;
        for(int i = 0; i < listaProductos.size(); i++){
            producto = listaProductos.get(i);
            listaProductos.get(i).setCantidad(producto.getCantidad() - listaCantidadSolicitada.get(i));
        }
    }
}
