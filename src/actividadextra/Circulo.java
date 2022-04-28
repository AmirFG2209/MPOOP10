/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author amirs
 */
public class Circulo extends Superficie{
    private float radio;

    public Circulo(float radio, int dimension, int numLados) {
        super(dimension, numLados);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString()+"Circulo{" + "radio=" + radio + '}';
    }
    

    @Override
    public float area() {
        return (3.1416f*radio)*(3.1416f*radio);
        }

    @Override
    public float perimetro() {
        return 3.1416f*radio*2;
       }

    @Override
    public void tipoDeFigura() {
        System.out.println("Está figura es un circulo");
        }

    @Override
    public void dibujarse() {
        System.out.println("Se ha dibujado exitosamente el circulo");
       }

    @Override
    public void moverse() {
        System.out.println("Se moverá al circulo de la hoja actual");
        }

    @Override
    public void borrarse() {
        System.out.println("Se ha borrado al circulo");
       }

    @Override
    public void crearse() {
        System.out.println("Se ha creado de manera exitosa un circulo");
       }
    
    
}
