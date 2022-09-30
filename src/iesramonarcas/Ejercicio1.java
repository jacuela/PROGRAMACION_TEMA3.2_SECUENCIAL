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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        double x;
        double y,z;
        double media;
        
        
        
        System.out.print("Dime el primer valor:");
        x=entrada.nextDouble();
        
        System.out.print("Dime el segundo valor:");
        y=entrada.nextDouble();
        
        System.out.print("Dime el tercer valor:");
        z=entrada.nextDouble();
        
        
        media=(x+y+z)/3;
        
        System.out.println("La media de los tres valores es:"+media);
        
        System.out.printf("La media de los tres valores es:%.2f",media);
        System.out.println("");
        
        
    }
    
}
