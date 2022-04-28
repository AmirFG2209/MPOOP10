/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author amirs
 */
public class Icosaedro extends Volumen{
    private float longitudArista;

    public Icosaedro(float longitudArista, int dimensiones, int numCarasa) {
        super(dimensiones, numCarasa);
        this.longitudArista = longitudArista;
    }

    public float getLongitudArista() {
        return longitudArista;
    }

    public void setLongitudArista(float longitudArista) {
        this.longitudArista = longitudArista;
    }
    
    
    
    
    /**
     * Metodo que regresa la altura de una cara del icosaedro
     * @return 
     */
    public float alturaDeLaBase(){
      return  (float) ((longitudArista*sqrt(3))/2);
    }

    @Override
    public String toString() {
        return "Icosaedro{" + "longitudArista=" + longitudArista + '}';
    }

    @Override
    public float areaDeLaBase() {
        return (float) pow(((longitudArista*sqrt(3))/2),2);
       
    }

    @Override
    public float volumenT() {
        return (float) (pow(longitudArista,3)*5/12*(3+sqrt(5)));
        }

    @Override
    public void dibujarse() {
        System.out.println("Se dibujará el plano del icosaedro");
      }

    @Override
    public void moverse() {
        System.out.println("Se moverá de lugar al icosaedro");
       }

    @Override
    public void borrarse() {
        System.out.println("Se borarrá el plano del icosaedro");
      }

    @Override
    public void crearse() {
        System.out.println("Se armará al icosaedro");
       
    }
    
    
}
