/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

import java.util.Scanner;

/**
 *
 * @author jacuela
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int a,b,aux;
        
        System.out.println("Intercambio de valores");
        System.out.println("----------------------------------------");

        System.out.print("valor de a:");
        a=entrada.nextInt();
        
        System.out.print("valor de b:");
        b=entrada.nextInt();
        
        aux=a;
        a=b;
        b=aux;
        
        System.out.println("El nuevo valor de a es: "+a);
        System.out.println("El nuevo valor de b es: "+b);

        
        
    }
    
}
