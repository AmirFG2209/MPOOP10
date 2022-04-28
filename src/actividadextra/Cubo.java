/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author amirs
 */
public class Cubo extends Volumen {
    private int longLadoBase;

    public Cubo(int longLadoBase, int dimensiones, int numCarasa) {
        super(dimensiones, numCarasa);
        this.longLadoBase = longLadoBase;
    }
    

    @Override
    public String toString() {
        return super.toString()+"Cubo{" + "longLadoBase=" + longLadoBase + '}';
    }
    

    public int getLongLadoBase() {
        return longLadoBase;
    }

    public void setLongLadoBase(int longLadoBase) {
        this.longLadoBase = longLadoBase;
    }

    @Override
    public float areaDeLaBase() {
        return longLadoBase*longLadoBase;
    }

    @Override
    public float volumenT() {
        return longLadoBase*longLadoBase*longLadoBase;
    }

    @Override
    public void dibujarse() {
        System.out.println("Se comenzará a dibujar el plano del cubo");
    }

    @Override
    public void moverse() {
        System.out.println("Se está moviendo el cubo");
    }

    @Override
    public void borrarse() {
        System.out.println("Borraremos el plano dibujado del cubo");
    }

    @Override
    public void crearse() {
        System.out.println("Se armará en su totalidad al cubo");
        
    }
    
    
}
