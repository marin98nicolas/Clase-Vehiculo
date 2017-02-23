/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasevehiculo;

import Programa.Vehiculo;

/**
 *
 * @author camila
 */
public class ClaseVehiculo {
    
    
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo mazda = new Vehiculo();
        mazda.setPlaca("HWU927");
        mazda.setModelo("Mazda3");
        mazda.setNumerosoat("123456mzd");
        mazda.setColor("Gris");
        
        System.out.println(" Placa: " + mazda.getPlaca() + 
                "\n Modelo:  " + mazda.getModelo() + 
                "\n Numero de Soat: " + mazda.getNumerosoat() + 
                "\n Color: " + mazda.getColor());
        
        
        // TODO code application logic here
    }
    
}
