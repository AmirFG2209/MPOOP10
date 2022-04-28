/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *
 * @author amirs
 */
public class Cilindro extends Volumen{
    
    private float radioDeLaBase;
    private float altura;

    public Cilindro(float radioDeLaBase, float altura, int dimensiones, int numCarasa) {
        super(dimensiones, numCarasa);
        this.radioDeLaBase = radioDeLaBase;
        this.altura = altura;
    }
    

    public float getRadioDeLaBase() {
        return radioDeLaBase;
    }

    public void setRadioDeLaBase(float radioDeLaBase) {
        this.radioDeLaBase = radioDeLaBase;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString()+"Cilindro{" + "radioDeLaBase=" + radioDeLaBase + ", altura=" + altura + '}';
    }

    @Override
    public float areaDeLaBase() {
        return 3.1416f*radioDeLaBase;
    }

    @Override
    public float volumenT() {
        return 3.1416f*radioDeLaBase*altura;
    }

    @Override
    public void dibujarse() {
        System.out.println("Se dibujará el plano de un cilindro"); 
    }

    @Override
    public void moverse() {
        System.out.println("Se moverá de mesa la figura geometrica llamada cilindro");
    }

    @Override
    public void borrarse() {
        System.out.println("Se ha borrado el plano del cilindro");  
    }

    @Override
    public void crearse() {
        System.out.println("El cilindro ha sido armado exitosamente");
    }
    
    
}
