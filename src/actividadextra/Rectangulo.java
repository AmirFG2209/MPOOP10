/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author amirs
 */
public class Rectangulo extends Superficie{
    
    private float base;
    private float altura;

    public Rectangulo(float base, float altura, int dimension, int numLados) {
        super(dimension, numLados);
        this.base = base;
        this.altura = altura;
    }

    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString()+"Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public float area() {
        return base*altura;
    }

    @Override
    public float perimetro() {
        return base*2+altura*2;
    }

    @Override
    public void tipoDeFigura() {
        System.out.println("Este rectangulo, es un cuadrilatero");
    }

    @Override
    public void dibujarse() {
        System.out.println("El rectangulo ha sido dibujado de manera exitosa");
        }

    @Override
    public void moverse() {
        System.out.println("Se moverá al rectangulo");
    }

    @Override
    public void borrarse() {
        System.out.println("El rectangulo, ha sido borrado");
    }

    @Override
    public void crearse() {
        System.out.println("El rectangulo, ha sido CREADO con exito");
    }
    
   
}
