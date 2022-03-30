/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_herencia_4;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_4_HERENCIA_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // String tipoMotocicletas, String transmision, String posicionConduccion, String tipoCombustible, int numeroLlantas, double capacidadMotor, int cilindrosMotor, int capacidadPasajeros, String marca, String modelo, int año
        Motocicletas moto1 = new Motocicletas("Motoccross","Por cadena","Estándar","Gasolina",2,1.800,2,2,"Italika","250Z",2022);
        moto1.imprimirDatos();
        
        //String tipoVehiculo, String transmisión, String equipamento, String tipoCombustible, int numeroLlantas, double capacidadMotor, int cilindrosMotor, int capacidadPasajeros, String marca, String modelo, int año
        Automoviles auto1 = new Automoviles("Sedán","Automática","Panel de instrumentos con pantalla, cámara de retroceso integrada con Radio Touch Screen, Bluetooth, puertos USB, y Conexión MP3 y AUX","Gasolina",4,1.4,6,4,"KIA","RIO",2022);
        auto1.imprimirDatos();
        
        //String tipoCamioneta, double capacidadCarga, String tipoTraccion, String tipoCombustible, int numeroLlantas, double capacidadMotor, int cilindrosMotor, int capacidadPasajeros, String marca, String modelo, int año
        Camionetas camioneta1 = new Camionetas("Pickup",1.3,"4x4","Diésel",4,2.3,4,5,"Ford","Ranger",2022);
        camioneta1.imprimirDatos();
    
        //String tipoCamion, double capacidadCarga, int numeroEjes, String tipoCombustible, int numeroLlantas, double capacidadMotor, int cilindrosMotor, int capacidadPasajeros, String marca, String modelo, int año
        Camiones camion1 = new  Camiones("F",6577.0,2,"Diésel",4,5193.0,4,3,"ISUZU","ELF 400",2022);
        camion1.imprimirDatos();
    }
    
}

class Camiones extends Vehiculos{
    private String tipoCamion;
    private double capacidadCarga;
    private int numeroEjes;

    public Camiones() {
        super();
        System.out.println("Clase Camiones");
        this.tipoCamion = "";
        this.capacidadCarga = 0.0;
        this.numeroEjes = 0;
    }

    public Camiones(String tipoCamion, double capacidadCarga, int numeroEjes, String tipoCombustible, int numeroLlantas, double capacidadMotor, int cilindrosMotor, int capacidadPasajeros, String marca, String modelo, int año) {
        super(tipoCombustible, numeroLlantas, capacidadMotor, cilindrosMotor, capacidadPasajeros, marca, modelo, año);
        System.out.println("Clase Camiones");
        this.tipoCamion = tipoCamion;
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }
    
    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Tipo de camión: " + tipoCamion);
        System.out.println("Capacidad de carga: " + capacidadCarga);
        System.out.println("Número de ejes: " + numeroEjes + "\n");
    } 
}

class Camionetas extends Vehiculos{
    private String tipoCamioneta;
    private double capacidadCarga;
    private String tipoTraccion;

    public Camionetas() {
        super();
        System.out.println("Clase Camionetas");
        this.tipoCamioneta = "";
        this.capacidadCarga = 0.0;
        this.tipoTraccion = "4X4";
    }

    public Camionetas(String tipoCamioneta, double capacidadCarga, String tipoTraccion, String tipoCombustible, int numeroLlantas, double capacidadMotor, int cilindrosMotor, int capacidadPasajeros, String marca, String modelo, int año) {
        super(tipoCombustible, numeroLlantas, capacidadMotor, cilindrosMotor, capacidadPasajeros, marca, modelo, año);
        System.out.println("Clase Camionetas");
        this.tipoCamioneta = tipoCamioneta;
        this.capacidadCarga = capacidadCarga;
        this.tipoTraccion = tipoTraccion;
    }
    
    public String getTipoCamioneta() {
        return tipoCamioneta;
    }

    public void setTipoCamioneta(String tipoCamioneta) {
        this.tipoCamioneta = tipoCamioneta;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Tipo de camioneta: " + tipoCamioneta);
        System.out.println("Capacidad de carga: " + capacidadCarga);
        System.out.println("Tipo de tracción: " + tipoTraccion  + "\n");
    }
}

class Automoviles extends Vehiculos{
    private String tipoVehiculo;
    private String transmisión;
    private String equipamento;

    public Automoviles() {
        super();
        System.out.println("Clase Automóviles");
        this.tipoVehiculo = "";
        this.transmisión = "";
        this.equipamento = "";
    }

    public Automoviles(String tipoVehiculo, String transmisión, String equipamento, String tipoCombustible, int numeroLlantas, double capacidadMotor, int cilindrosMotor, int capacidadPasajeros, String marca, String modelo, int año) {
        super(tipoCombustible, numeroLlantas, capacidadMotor, cilindrosMotor, capacidadPasajeros, marca, modelo, año);
        System.out.println("Clase Automóviles");
        this.tipoVehiculo = tipoVehiculo;
        this.transmisión = transmisión;
        this.equipamento = equipamento;
    }
    
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTransmisión() {
        return transmisión;
    }

    public void setTransmisión(String transmisión) {
        this.transmisión = transmisión;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Tipo de vehículo: " + tipoVehiculo);
        System.out.println("Transmisión: " + transmisión);
        System.out.println("Equipamento: " + equipamento  + "\n");
    }
}

class Motocicletas extends Vehiculos{
    private String tipoMotocicletas;
    private String transmision;
    private String posicionConduccion;

    public Motocicletas() {
        super();
        System.out.println("Clase Motocicletas");
        this.tipoMotocicletas = "";
        this.transmision = "";
        this.posicionConduccion = "";
    }

    public Motocicletas(String tipoMotocicletas, String transmision, String posicionConduccion, String tipoCombustible, int numeroLlantas, double capacidadMotor, int cilindrosMotor, int capacidadPasajeros, String marca, String modelo, int año) {
        super(tipoCombustible, numeroLlantas, capacidadMotor, cilindrosMotor, capacidadPasajeros, marca, modelo, año);
        System.out.println("Clase Motocicletas");
        this.tipoMotocicletas = tipoMotocicletas;
        this.transmision = transmision;
        this.posicionConduccion = posicionConduccion;
    }
    
    public String getTipoMotocicletas() {
        return tipoMotocicletas;
    }

    public void setTipoMotocicletas(String tipoMotocicletas) {
        this.tipoMotocicletas = tipoMotocicletas;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getPosicionConduccion() {
        return posicionConduccion;
    }

    public void setPosicionConduccion(String posicionConduccion) {
        this.posicionConduccion = posicionConduccion;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Tipo de motocicleta: " + tipoMotocicletas);
        System.out.println("Transmisión: " + transmision);
        System.out.println("Posición de conducción: " + posicionConduccion + "\n");
    }
    
}

class Vehiculos{
    private String tipoCombustible;
    private int numeroLlantas;
    private double capacidadMotor;
    private int cilindrosMotor;
    private int capacidadPasajeros;
    private String marca;
    private String modelo;
    private int año;

    public Vehiculos() {
        this.tipoCombustible = "";
        this.numeroLlantas = 2;
        this.capacidadMotor = 0.0;
        this.cilindrosMotor = 2;
        this.capacidadPasajeros = 2;
        this.marca = "";
        this.modelo = "";
        this.año = 2022;
        System.out.println("Clase Vehículos");
    }

    public Vehiculos(String tipoCombustible, int numeroLlantas, double capacidadMotor, int cilindrosMotor, int capacidadPasajeros, String marca, String modelo, int año) {
        this.tipoCombustible = tipoCombustible;
        this.numeroLlantas = numeroLlantas;
        this.capacidadMotor = capacidadMotor;
        this.cilindrosMotor = cilindrosMotor;
        this.capacidadPasajeros = capacidadPasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        System.out.println("Clase Vehículos");
    }
    
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public double getCapacidadMotor() {
        return capacidadMotor;
    }

    public void setCapacidadMotor(double capacidadMotor) {
        this.capacidadMotor = capacidadMotor;
    }

    public int getCilindrosMotor() {
        return cilindrosMotor;
    }

    public void setCilindrosMotor(int cilindrosMotor) {
        this.cilindrosMotor = cilindrosMotor;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void imprimirDatos(){
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Número de llantas: " + numeroLlantas);
        System.out.println("Capacidad del motor: " + capacidadMotor);
        System.out.println("Cilindros del motor: " + cilindrosMotor);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}