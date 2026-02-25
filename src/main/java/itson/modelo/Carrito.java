/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class Carrito {
    
    private List<Producto> items = new ArrayList<>();

    public Carrito() {
        
        this.items = new ArrayList<>();
        
    }
    
    public void agregar(Producto producto, int Cantidad){
    
        for(int i = 0; i<Cantidad; i++){
        
            items.add(producto);
            
        }
        
    }
    
    public double calcularTotal(){
    
        double res = 0;
        
        for(Producto prod : items){
        
            res += prod.getCosto();
            
        }
        
        return res;
    }
    
    public List<Producto> getProductos(){
    
        return items;
        
    }
}
