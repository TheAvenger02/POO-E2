/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_herencia_e_interfaces;

/**
 *
 * @author emiliomurillo
 */
public class Estudiante extends Persona implements MuestraDatos{
    private String numeroControl;

    public Estudiante() {
        super(); //Constructor default de persona
        this.numeroControl = "";
    }

    public Estudiante(String numeroControl, String nombre, int edad) {
        super(nombre, edad); // Constructor de Persona (Superclase)
        this.numeroControl = numeroControl;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Número de contro: " + numeroControl);
    }
    
    
}
