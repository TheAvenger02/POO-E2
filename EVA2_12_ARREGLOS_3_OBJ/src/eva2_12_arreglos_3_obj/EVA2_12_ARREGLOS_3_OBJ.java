/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_arreglos_3_obj;

import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_12_ARREGLOS_3_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] arregloPer = new Persona[32];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 32; i++) {
            //Crear el objeto
            arregloPer[i] = new Persona();
            System.out.println("¿Cuál es tu nombre?");
            arregloPer[i].setNombre(sc.nextLine());
        }
        //Mostrar los datos
        for (int i = 0; i < 32; i++) {
            System.out.println("Nombre: " + arregloPer[i].getNombre());
        }
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
