/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

import java.util.Scanner;

/**
 *
 * @author enrik
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        double parcial1;
        double parcial2;
        double parcial3;
        double examen;
        double trabajo;
        double notaFinal;
        
        int porcentParciales=55; //55% los parciales
        int porcentExamen=30;
        int porcentTrabajo=15;
        
        
        
        System.out.println("EJERCICIO 6 - NOTA FINAL ALUMNO");
        System.out.println("-------------------------------");
        
        System.out.print("Nota parcial1:");
        parcial1=Double.parseDouble(entrada.nextLine());
        
        System.out.print("Nota parcial2:");
        parcial2=Double.parseDouble(entrada.nextLine());
        
        System.out.print("Nota parcial3:");
        parcial3=Double.parseDouble(entrada.nextLine());
        
        //Calculo la media de los tres parciales
        double mediaParciales=(parcial1+parcial2+parcial3)/3;
        
        System.out.print("Calificación del examen final:");
        examen=Double.parseDouble(entrada.nextLine());
        
        System.out.print("Claficación del trabajo final:");
        trabajo=Double.parseDouble(entrada.nextLine());
             
        
        //Una vez que tengo todos los datos de entrada, calculo la
        //nota final
        notaFinal=mediaParciales*porcentParciales/100+examen*porcentExamen/100+trabajo*porcentTrabajo/100;
        System.out.println("La nota final es de " +notaFinal);
        
        
        //int notaRedondeada=(int)notaFinal;
        long notaRedondeada=Math.round(notaFinal);
        System.out.println("Nota redondeada: "+notaRedondeada);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
    }       
    
}
