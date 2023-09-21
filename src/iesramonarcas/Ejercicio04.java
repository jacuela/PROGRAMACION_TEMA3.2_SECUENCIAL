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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        
        double gradosF, gradosC;
        
        System.out.print("Dime la temperatura en grados fahrenheit:");
        
        gradosF=Double.parseDouble(entrada.nextLine());
        
        gradosC=(gradosF-32)*5/9;
        
        System.out.println(gradosF+" Fahrenheit son "+gradosC+" Celsius");
        
        //Misma salida pero formateada con 1 decimal
        System.out.printf("%.1f Fahrenheit son %.1f Celsius\n",gradosF,gradosC);
        
        
    }
    
}
