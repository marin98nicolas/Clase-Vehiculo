/*
 * Fecha: 23/02/2017
 * Clase Vehiculo: plantilla donde se instancia el objeto de tipo Vehiculo.
 * 
 */
//Definiendo el paquete donde esta la clase.
package Programa;


/**
 *
 * @author Nicolas Marin Correa/ 1088348100
 */

//Firma de la clase
public class Vehiculo {
    
    private String placa;
    private String modelo;
    private String numerosoat;
    private String color;

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the numerosoat
     */
    public String getNumerosoat() {
        return numerosoat;
    }

    /**
     * @param numerosoat the numerosoat to set
     */
    public void setNumerosoat(String numerosoat) {
        this.numerosoat = numerosoat;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
