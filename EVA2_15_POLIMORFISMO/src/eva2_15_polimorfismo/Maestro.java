/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_polimorfismo;

/**
 *
 * @author emiliomurillo
 */
public class Maestro extends Persona{
    private String numeroRegistro;

        public Maestro() {
        }

        public Maestro(String numeroRegistro, String nombre, int edad) {
            super(nombre, edad);
            this.numeroRegistro = numeroRegistro;
        }

        public String getNumeroRegistro() {
            return numeroRegistro;
        }

        public void setNumeroRegistro(String numeroRegistro) {
            this.numeroRegistro = numeroRegistro;
        }   
}