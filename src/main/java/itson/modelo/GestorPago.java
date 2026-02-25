/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.modelo;

/**
 *
 * @author santi
 */
public class GestorPago {
    
    public GestorPago() {

    }
    
    private Boolean validarDatos(String numTarjeta){
    
        int suma = 0;
        boolean deberiaDuplicar = false;

        for (int i = numTarjeta.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(numTarjeta.substring(i, i + 1));
            if (deberiaDuplicar) {
                n *= 2;
                if (n > 9) n -= 9;
            }
            suma += n;
            deberiaDuplicar = !deberiaDuplicar;
        }
        return (suma % 10 == 0);
        
    }
    
    public String extraerDatos(String numTarjeta){
        
        String digitos = numTarjeta.replaceAll("\\D", "");

        if (!validarDatos(numTarjeta)) {
            return "INVALID";
        }

        if (digitos.startsWith("4")) {
            return "VISA";
        } else if (digitos.matches("^5[1-5][0-9]{14}$") || digitos.matches("^2(22[1-9]|2[3-9][0-9]|[3-6][0-9]{2}|7[0-1][0-9]|720)[0-9]{12}$")) {
            // Mastercard usa rangos 51-55 y también el rango 2221-2720
            return "MASTERCARD";
        } else {
            return "ERROR";
        }
    }
    
  }

