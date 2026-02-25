/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.modelo;

import java.util.List;

/**
 *
 * @author santi
 */
public class CompraModelo {

    private Carrito carrito;
    private GestorPago gestor;
    
    public CompraModelo() {
        this.carrito = new Carrito();
        this.gestor = new GestorPago();
    }
    
    public void agregarProducto(Producto producto, int cantidad){
    
        carrito.agregar(producto, cantidad);
        
    }
    
    public String ingresarNumeroTarjeta(String numTarjeta){
    
        return gestor.extraerDatos(numTarjeta);
        
    }
    
    public double procesarPago(){
    
        return carrito.calcularTotal();
        
    }
    
    public List<Producto> regresarCarrito(){
    
        return this.carrito.getProductos();
        
    }
    
    public void reiniciarCarrito(){
    
        this.carrito.getProductos().clear();
        
    }
}
