/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author amirs
 */
public class Elipse extends Linea{
    private float radioMayor;
    private float radioMenor;

    public Elipse(float radioMayor, float radioMenor, int dimensiones, String color, float longitud) {
        super(dimensiones, color, longitud);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public float getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(float radioMayor) {
        this.radioMayor = radioMayor;
    }

    public float getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(float radioMenor) {
        this.radioMenor = radioMenor;
    }
    

    @Override
    public String funcion() {
        return "la parábola está descrita por la funcion Ax^2+Bx+C";
    }

    @Override
    public void dibujarse() {
        System.out.println("la trayectoria ha dibujado una parabola");
    }

    @Override
    public void moverse() {
        System.out.println("Se ha movido la trayectoria de la parabola");
    }

    @Override
    public void borrarse() {
        System.out.println("La parabola se borró");
    }

    @Override
    public void crearse() {
        System.out.println("La parabola ha sido descrita y por lo tanto creada");
    }
    
    
}
