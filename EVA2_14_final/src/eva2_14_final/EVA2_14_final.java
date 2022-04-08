/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_final;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_14_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
class EstudiantePosgrado{
    
}
    
final class Estudiante extends Persona{
    private String numeroControl;

        public Estudiante() {
        }

        public Estudiante(String numeroControl) {
            this.numeroControl = numeroControl;
        }

        public String getNumeroControl() {
            return numeroControl;
        }

        public void setNumeroControl(String numeroControl) {
            this.numeroControl = numeroControl;
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
//final: detener la herencia
//abstract: impide la creación de objetos de la clase (instanciación)
//polimorfismo --> herencia: cuando objetos de una clase se comportan como objetos de otra clase