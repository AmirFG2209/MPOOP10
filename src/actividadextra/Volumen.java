/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author amirs
 */
public abstract class Volumen implements FigurasGeometricas{
    
    private int dimensiones;
    private int numCarasa;

    public Volumen(int dimensiones, int numCarasa) {
        this.dimensiones = dimensiones;
        this.numCarasa = numCarasa;
    }

    
    
    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }

    public int getNumCarasa() {
        return numCarasa;
    }

    public void setNumCarasa(int numCarasa) {
        this.numCarasa = numCarasa;
    }
    
    /**
     * Metodo que calcula el area de la base de un cuerpo geometrico, 
     * utilizable para el calculo de el volumen
     * @return 
     */
    public abstract float areaDeLaBase();
    /**
     * Meetodo que calcula el volumen de un cuerpo geometrico
     * @return 
     */
    public abstract float volumenT ();

    @Override
    public String toString() {
        return "Volumen{" + "dimensiones=" + dimensiones + ", numCarasa=" + numCarasa + '}';
    }
    

    
    
    
}
