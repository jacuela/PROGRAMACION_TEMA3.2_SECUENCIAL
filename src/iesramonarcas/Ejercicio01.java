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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        double x;
        double y,z;
        double media;
        
        System.out.println("=====================");
        System.out.println("Ejercicio 01");
        System.out.println("=====================");
        
        
        System.out.print("Dime el primer valor:");
        x=Double.parseDouble(teclado.nextLine());
        
        System.out.print("Dime el segundo valor:");
        y=Double.parseDouble(teclado.nextLine());
        
        System.out.print("Dime el tercer valor:");
        z=Double.parseDouble(teclado.nextLine());
        
        
        media=(x+y+z)/3;
        
        System.out.println("La media es:"+media);
        
        System.out.printf("La media es:%.2f",media);
        System.out.println("");
        
        
    }
    
}
