/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author amirs
 */
public class Cuadrado extends Superficie{
    private float lado;

    public Cuadrado(float lado, int dimension, int numLados) {
        super(dimension, numLados);
        this.lado = lado;
    }
    

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return super.toString()+"Cuadrado{" + "lado=" + lado + '}';
    }

    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public float perimetro() {
        return lado*4;
    }

    @Override
    public void tipoDeFigura() {
        System.out.println("La figura es un cuadrilatero");
    }

    @Override
    public void dibujarse() {
        System.out.println("Se ha dibujado el cuadrado de lado "+ lado+" exitosamente");
    }

    @Override
    public void moverse() {
        System.out.println("Se moverá el cuadrado a otra hoja");
    }

    @Override
    public void borrarse() {
        System.out.println("Se ha borrado el cuadrado");
    }

    @Override
    public void crearse() {
        System.out.println("Se crea el cuadrado");
    }
    
    
}
