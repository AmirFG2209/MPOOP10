/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author amirs
 */
public abstract class Linea implements FigurasGeometricas {
   
    private int dimensiones;
    private String color;
    private float longitud;

    public Linea(int dimensiones, String color, float longitud) {
        this.dimensiones = dimensiones;
        this.color = color;
        this.longitud = longitud;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
    
    /**
     * Metodo que imprime el tipo de funcion que representa la linea dibujada
     * @return 
     */
    public abstract String funcion();

    
    
    @Override
    public String toString() {
        return "Linea{" + "dimensiones=" + dimensiones + ", color=" + color + ", longitud=" + longitud + '}';
    }

    
    
}
