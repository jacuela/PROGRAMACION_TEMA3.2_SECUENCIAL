
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan.antonio
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        String nombre;
        String apellido1;
        String apellido2;
        
        System.out.println("    MOSTRAR LAS INICIALES");
        System.out.println("-----------------------------");
        
        System.out.println("Nombre: ");
        nombre=teclado.nextLine();
        
        System.out.println("Primer apellido: ");
        apellido1=teclado.nextLine();
        
        System.out.println("Segundo apellido: ");
        apellido2=teclado.nextLine();
        
//        System.out.println("Nombre: "+nombre);
//        System.out.println("Apellido1: "+apellido1);
//        System.out.println("Apellido2: "+apellido2);
        
        // *** HAGO EL EJERCICIO TRATANDOLO COMO CARACTER
        char inicialN=nombre.charAt(0); //devuelve el primer caracter
        char inicialA1=apellido1.charAt(0);
        char inicialA2=apellido2.charAt(0);
        
        System.out.println("Las iniciales del nombre son: "+inicialN+inicialA1+inicialA2);
      
        //Las mostramos en mayusculas 
        inicialN=Character.toUpperCase(inicialN);
        inicialA1=Character.toUpperCase(inicialA1);
        inicialA2=Character.toUpperCase(inicialA2);
        
        System.out.println("Las iniciales en MAYUSCULAS son: "+inicialN+inicialA1+inicialA2);
        
        
        
    }
    
}
