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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner scn = new Scanner(System.in);
    
        System.out.println("Calculo de salario mensual");
        System.out.println("--------------------------");
        
        double sueldoBase,venta1,venta2,venta3;
        double comisionTotal;
        double salarioMes;
        
        double porcentajeComision=10;   //10% de comisión
        
        
        System.out.print("Dime el sueldo base: ");
        sueldoBase=Double.parseDouble(scn.nextLine());
        
        System.out.print("Importe de la venta1: ");
        venta1=Double.parseDouble(scn.nextLine());
        
        System.out.print("Importe de la venta2: ");
        venta2=Double.parseDouble(scn.nextLine());
        
        System.out.print("Importe de la venta3: ");
        venta3=Double.parseDouble(scn.nextLine());
        
    
        double comision1=venta1*(porcentajeComision/100);
        double comision2=venta2*(porcentajeComision/100);
        double comision3=venta3*(porcentajeComision/100);
        
        comisionTotal=comision1+comision2+comision3;
        
        salarioMes=sueldoBase+comisionTotal;
    
        System.out.println("El total de comisiones del mes es: "+comisionTotal+"€");
        System.out.println("El salario total del mes es:"+salarioMes+"€");
        
    
    
    
    }
    
}
