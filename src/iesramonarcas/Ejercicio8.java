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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("        INVERTIR NUMERO DE DOS CIFRAS");
        System.out.println("--------------------------------------------");
        System.out.print("Introduce un numero entero:");
        
        int numero=Integer.parseInt(entrada.nextLine());
        
        int unidades=numero%10;    //cálculo el módulo
        int decenas=numero/10;
        
        System.out.println("(opcion inicial) El numero invertido es:"+unidades+decenas);
        
        
        
        //Obtener realmente el numero invertido en una variable
        
        //OPCION_A
        int numeroInvertido=unidades*10;
        numeroInvertido=numeroInvertido+decenas;
        System.out.println("(opcion A) EL numero invertido es :"+numeroInvertido);
        
        //OPCIONB
        String cadenaInvertida=""+unidades+decenas;
        int numeroInvertido2=Integer.parseInt(cadenaInvertida);
        System.out.println("(opcion B) EL numero invertido es :"+numeroInvertido2);
        
        
    }
    
}
