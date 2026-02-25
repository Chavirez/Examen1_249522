/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import itson.control.CompraControl;
import itson.modelo.CompraModelo;
import itson.vista.CompraVista;

/**
 *
 * @author santi
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CompraVista vista = new CompraVista();
        CompraModelo modelo = new CompraModelo();
        CompraControl control = new CompraControl(modelo, vista);
        
        control.iniciarPrograma();
    }
    
}
