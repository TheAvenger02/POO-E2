package eva2_2_herencia_2;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_2_HERENCIA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion dire = new Direccion("5ta", 100, "x", "0011", "Chihuahua", "Chihuahua", "6141234567");
        Estudiante estu1 = new Estudiante("21550384", "Emilio", 20, dire);
        estu1.imprimirDatos();
    }
}

class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;
    private String telefono;

    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.cp = "";
        this.ciudad = "";
        this.estado = "";
        this.telefono = "";
    }

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
         this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
        
    public void imprimirDireccion(){
        System.out.println("Calle " + calle + "#" + numero + ", col." + colonia + ", CP: " + cp + 
                "\n" + ", en " + ciudad +  ", " + estado);
    }
        
}

    //Relación is a -> Estudiante es una Persona
class Estudiante extends Persona{
        private String numeroControl; 
        //Esto es un objeto, pero sin instanciar, lo vamos a instanciar en el constructor
        private Direccion direccion; // Has a --> Estudiante tiene una dirección

        public Estudiante() {
            super();
            this.numeroControl = "";
            //Instanciar dirección
            direccion = new Direccion();
        }

public Estudiante(String numeroControl, String nombre, int edad, Direccion direccion) {
            super(nombre, edad);
            this.numeroControl = numeroControl;
            this.direccion = direccion;
        }

        public String getNumeroControl() {
            return numeroControl;
        }

        public void setNumeroControl(String numeroControl) {
            this.numeroControl = numeroControl;
        }
        
        @Override
        public void imprimirDatos(){
        System.out.println("Número de control: " + numeroControl);
        super.imprimirDatos();    
        direccion.imprimirDireccion();
        }
}

class Persona{
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
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