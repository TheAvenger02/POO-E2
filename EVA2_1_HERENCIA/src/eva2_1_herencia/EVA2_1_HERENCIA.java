/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_herencia;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_1_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Persona perso1 = new Persona();
        Estudiante estu1 = new Estudiante("Emilio", 20, "21550384");
        /* estu1.setNombre("Emilio");
        estu1.setEdad(20);
        estu1.setNumeroControl("21550384");
        estu1.mostrarNombre();*/
        //System.out.println("No. de Control: " + estu1.getNumeroControl()); 
        estu1.imprimirDatos();
        
        Maestro maestro1 = new Maestro(1, "Rubén", 30);
        maestro1.imprimirDatos();
        
    }
    
}
// extends --> is-a --> Maestro es-una Persona
class Maestro extends Persona{ //Subclase maestro
    //No. de Registro
    private int numRegistro;

    public Maestro() {
        super();
        System.out.println("Clase Maestro");
    }

    public Maestro(int numRegistro, String nombre, int edad) {
        super(nombre, edad);
        this.numRegistro = numRegistro;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }
    @Override //Ignora el método con el mismo nombre de la superclase y lo sustituye con el método de la subclase
    public void imprimirDatos(){
    super.imprimirDatos();
        System.out.println("No. de registro: " + numRegistro);
    }
}

// extends --> is-a --> Estudiante es-una Persona
class Estudiante extends Persona{ //Subclase (Hijo)
    private String numeroControl;

    //Constructor default:
    public Estudiante(){
        super(); //Llamada al constructor de la superclase
        System.out.println("Clase estudiante");
    }
    
    public Estudiante(String nombre, int edad, String numeroControl){
        super(nombre, edad); //Llamada al constructor de la superclase
        this.numeroControl = numeroControl;
    }
    
    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }
    
    /* public void mostrarNombre(){
        System.out.println("Nombre del estudiante: " + getNombre());
    } */
    @Override //Ignorar un método o absorber el método de la superclase y añadir un comportamiento adicional
    public void imprimirDatos(){
        super.imprimirDatos(); //Estoy llamando al método imprimir datos de persona (superclase)
        System.out.println("No. de control: " + numeroControl);
    }
    
}

class Persona{ //Superclase (Padre)
    private String nombre; // En el mismo paquete y por herencia
    private int edad;
    
    public Persona(){
        this.nombre = "XXXXXXX";
        this.edad = 1000;
        System.out.println("Clase persona");
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
}

/*
extends --> clases
implements --> interfaces

Herencia simple --> Cuando heredamos de una sola clase (JAVA)
Herencia múltiple --> Cuando heredamos de varias clases (Hay n superclases)

Arriba - Subclase - Padre - Mamíferos
Abajo - Subclase - Hijo - Primates, catáceos...
*/