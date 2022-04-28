/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop10;

import actividadextra.Cilindro;
import actividadextra.Circulo;
import actividadextra.Cuadrado;
import actividadextra.Cubo;
import actividadextra.Elipse;
import actividadextra.Recta;
import actividadextra.Icosaedro;
import actividadextra.Parabola;
import actividadextra.Rectangulo;
/**
 *
 * @author alumno
 */
public class MPOOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flauta flauta =new Flauta ();
        System.out.println(flauta.tipoDeInstrumento());
        
        InstrumentoMusical instrumento = flauta;
        instrumento.tocar();
        instrumento.afinar();
        
        double pi =Math.PI;
        double e =Math.E;
        System.out.println(pi);
        System.out.println(e);
        System.out.println(Math.abs(-100));
        System.out.println("El mes "+Meses.NUEVE+" corresponde a:");
        System.out.println(Meses.NOMBRE_MESES[Meses.NUEVE]);
        
        Recta recta1= new Recta("vertical",20, "azul", 1);
        System.out.println(recta1.funcion());
        System.out.println(recta1);
        
        Icosaedro icosaedrin= new Icosaedro(4, 3, 20);
        System.out.println(icosaedrin.alturaDeLaBase());
        System.out.println(icosaedrin.volumenT());
        
        Cilindro cilindro1 =new Cilindro(4, 11, 3, 3);
        
        Cubo cubin =new Cubo(9, 3, 6);
        
        Elipse elipse= new Elipse(14, 8, 1, "verde", 50);
        
        Parabola parabola1= new Parabola(14, 1, "rojo", 14);
        
        Cuadrado cuadro1= new Cuadrado(8, 2, 4);
        
        Circulo circ1= new Circulo(6, 2, 0);
        
        Rectangulo rectangulo= new Rectangulo(4f, 2f, 2, 4);
        
        recta1.dibujarse();
        icosaedrin.dibujarse();
        cilindro1.dibujarse();
        cubin.dibujarse();
        elipse.dibujarse();
        parabola1.dibujarse();
        cuadro1.dibujarse();
        circ1.dibujarse();
        rectangulo.dibujarse();
    }
    
}
