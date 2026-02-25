/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.control;

import itson.modelo.CompraModelo;
import itson.modelo.Producto;
import itson.vista.CompraVista;
import java.util.List;

/**
 *
 * @author santi
 */
public class CompraControl {
    
    private CompraModelo modelo;
    private CompraVista vista;

    public CompraControl(CompraModelo modelo, CompraVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void iniciarPrograma(){
    
        vista.setControl(this);
        vista.setVisible(true);
        
    }
    
    public void seleccionarProducto(Producto producto, int cantidad){
    
        modelo.agregarProducto(producto, cantidad);
        
    }
    
    public String ingresarNumeroTarjeta(String numeroTarjeta){
    
        return modelo.ingresarNumeroTarjeta(numeroTarjeta);
        
    }
    
    public double procesarPago(){
        
        return modelo.procesarPago();
        
    }
    
    public List<Producto> regresarCarrito(){
    
        return modelo.regresarCarrito();
        
    }
}
