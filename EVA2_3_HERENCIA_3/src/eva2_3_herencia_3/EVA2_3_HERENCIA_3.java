/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_herencia_3;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_3_HERENCIA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal animal = new Animal();
        //animal.mover();
        //Vertebrado verte = new Vertebrado();
        //verte.tenerEsqueleto();
        //Mamifero mamifero = new Mamifero();
        //mamifero.tenerPelo();
        //Primates primate = new Primates();
        //primate.agarrarObjetos();
        Humano humano = new Humano();
        humano.pensar();
    }
    
}

class Humano extends Primates{
    public Humano(){
        System.out.println("Humano");
    }
    public void pensar(){
        System.out.println("Pensar");
    }
}

class Primates extends Mamifero{
    public Primates(){
        System.out.println("Primates");
    }
    public void agarrarObjetos(){
        System.out.println("Sujetar objetos");
    }

}

class Mamifero extends Vertebrado{
    public Mamifero(){
        super();
        System.out.println("Mamífero");
    }
    public void tenerPelo(){
        System.out.println("Tener pelo");
    }
}

class Vertebrado extends Animal{
    public Vertebrado(){
        super();
        System.out.println("Vertebrado");
    }
    public void tenerEsqueleto(){
        System.out.println("Vertebrado: tiene esqueleto");
    }
    
}

class Animal{
    public Animal(){
        System.out.println("Animal");
    }
    public void mover(){
        System.out.println("Animal: movimiento");
    }
}