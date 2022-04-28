/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author amirs
 */
public class Recta extends Linea{
    
    
    private String orientacion;

    public Recta(String orientacion, int dimensiones, String color, float longitud) {
        super(dimensiones, color, longitud);
        this.orientacion = orientacion;
    }

    
    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    @Override
    public String toString() {
        return "Recta{" + "orientacion=" + orientacion + '}';
    }

    

    @Override
    public String funcion() {
        if(orientacion.equals("vertical")){
            return "La recta tiene una funcion de la forma x=constante";
        }else if (orientacion.equals("horizontal")) {
            return "La recta es de la forma y=constante";
        }
        return "La recta es de la forma x=y";
    }

    @Override
    public void dibujarse() {
        System.out.println("se dibujará una recta "+orientacion);
    }
    

    @Override
    public void moverse() {
        System.out.println("Moveremos la recta de hoja");
    }

    @Override
    public void borrarse() {
        System.out.println("Borraremos la recta");
    }

    @Override
    public void crearse() {
        System.out.println("Se creó una recta con orientacion" + orientacion);
    }

    
    
    
    
}
