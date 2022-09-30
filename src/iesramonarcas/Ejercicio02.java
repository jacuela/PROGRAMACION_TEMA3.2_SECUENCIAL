/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

//import java.util.Scanner;

import java.util.Scanner;


//import java.util.Scanner;


/**
 *
 * @author jacuela
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        float base, altura, perimetro, area;
        
        System.out.println("Calcular area y perimetro del rectangulo");
        System.out.println("----------------------------------------");

        System.out.print("Dime la base:");
        base=Float.parseFloat(entrada.nextLine());
        
        System.out.print("Dime la altura:");
        altura=Float.parseFloat(entrada.nextLine());
        
        perimetro=2*base + 2*altura;
        area=base*altura;
        System.out.println("El perimetro es "+perimetro+" y el area es "+area);

        
    }
    
}
