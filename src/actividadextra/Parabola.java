/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author amirs
 */
public class Parabola extends Linea{
    private float directriz;

    public Parabola(float directriz, int dimensiones, String color, float longitud) {
        super(dimensiones, color, longitud);
        this.directriz = directriz;
    }

    public float getDirectriz() {
        return directriz;
    }

    public void setDirectriz(float directriz) {
        this.directriz = directriz;
    }

    @Override
    public String toString() {
        return super.toString()+"Parabola{" + "directriz=" + directriz + '}';
    }

    @Override
    public String funcion() {
        return "La parabola tiene una funcion de la forma x^2 + constante";
        }

    @Override
    public void dibujarse() {
        System.out.println("Se dibujará una parabola de directriz "+ directriz);
    }

    @Override
    public void moverse() {
        System.out.println("Se moverá de hoja a la parabola");
      }

    @Override
    public void borrarse() {
        System.out.println("Se borrará a la parabola");
      }

    @Override
    public void crearse() {
        System.out.println("Se creará una parabola");
       }
    
    
    
    
}
