/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_arreglos_2;

import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA2_12_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloEdad = new int [32]; //Bytes que ocupa un entero --> 4 bytes
        Scanner sc = new Scanner(System.in);
        //Captura de datos
        for (int i = 0; i < 32; i++) {
            System.out.println("¿Cuál es tu edad?");
            arregloEdad[i] = sc.nextInt();
        }
        //Mostrar los datos
        for(int i = 0; i < 32; i++){
            System.out.print("[" + arregloEdad[i] + "]");
        }
    }
    
}
