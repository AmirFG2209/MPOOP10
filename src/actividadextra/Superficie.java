/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author amirs
 */
public abstract class Superficie implements FigurasGeometricas {
    
    private int dimension;
    private int numLados;

    public Superficie(int dimension, int numLados) {
        this.dimension = dimension;
        this.numLados = numLados;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
    
    
    
    /**
     * Metodo que calcula el area de una superficie
     * @return 
     */
    public abstract float area();
    /**
     * Metodo que calcula el perimetro de una superficie
     * @return 
     */
    public abstract float perimetro();
    /**
     * Metodo que imprime el tipo de superficie, ya sea cuadrilatero, circulo, etc.
     */
    public abstract void tipoDeFigura();

    @Override
    public String toString() {
        return "Superficie{" + "dimension=" + dimension + ", numLados=" + numLados + '}';
    }
    
    
    
    
    
}
