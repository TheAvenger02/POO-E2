/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_figuras;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_16_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo triangulo = new Triangulo(3.0, 5.0);
        Circulo circulo = new Circulo(2.5);
        Rectangulo rectangulo = new Rectangulo(4.5, 7.5);
        //System.out.println("Área = " + triangulo.calcularArea());
        //Verificar polimorfismo: IS-A, Figura prueba = triangulo; //IS-A
        imprimirArea(triangulo);
        imprimirArea(circulo);
        imprimirArea(rectangulo);

        //claseObject(triangulo);
    }
    
    public static void imprimirArea(Figura f){
        System.out.println("Área = " + f.calcularArea());
        //Restaurar el objeto: Convertir un tipo de dato en otro --> Casting
         
        if(f instanceof Triangulo){
            System.out.println(f.getClass());
            Triangulo triangulo = (Triangulo)f; //Convirtiendo una figura en un triángulo
        }
    }
    
    public static void claseObject(Object o){
        System.out.println(o.getClass());
        
    }
    
}