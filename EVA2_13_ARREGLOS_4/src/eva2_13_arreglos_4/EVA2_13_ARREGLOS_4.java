/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_arreglos_4;

import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_13_ARREGLOS_4 {
    //CONSTANTE EN JAVA:
    public static final int TAMA = 100;
    //final -> Sirve para declarar constantes
    //final -> Sólo permite asignar una vez un valor
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] arregloEdad = new int [TAMA]; //Bytes que ocupa un entero --> 4 bytes
        Scanner sc = new Scanner(System.in);
        //Captura de datos
        for (int i = 0; i < arregloEdad.length; i++) {
            System.out.println("¿Cuál es tu edad?");
            arregloEdad[i] = sc.nextInt();
        }
        //Mostrar los datos
        for(int i = 0; i < arregloEdad.length; i++){
            System.out.print("[" + arregloEdad[i] + "]");
        }
    }
}