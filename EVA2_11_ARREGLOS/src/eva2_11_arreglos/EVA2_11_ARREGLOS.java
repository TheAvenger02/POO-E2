/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arreglos;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_11_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Arreglos: fila o columna, almacenan datos del mismo tipo, se pueden acceder por índices, primer posición 0, última n-1
        int [] arreglo = new int[10]; // arreglo con 10 enteros
        arreglo[0] = 100;
        System.out.println("El valor de arreglo[0] = " + arreglo[0]);
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        arreglo[6] = 700;
        arreglo[7] = 800;
        arreglo[8] = 900;
        arreglo[9] = 1000; //Última posición
        //arreglo[10] = 200; //Aquí nos pasamos del arreglo
        String[] arreCade = new String[10];
        arreCade[5] = "Hola mundo";
        double[] arreDouble = new double[1000000];
        arreDouble[999999] = 0.2;
        Persona[] clasePOO = new Persona[32]; //Arreglo para 32 objetos de tipo Persona
        
    }
    
}

class Persona{
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      
}