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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        int descuento=15;   //descuento del 15%
        
        System.out.print("Dime el precio del artículo:");
        
        int importe=Integer.parseInt(scn.nextLine());
        
        double precioFinal=importe-(importe*descuento/100);
        
        System.out.println("El precio final ("+descuento+"% de descuento) es:"+precioFinal);
        System.out.printf("El precio final (%d%% de descuento) es:%.2f \n",descuento,precioFinal);
        
        
        
        
        
        
    }
    
}
