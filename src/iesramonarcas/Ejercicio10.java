
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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int mon1e,mon2e,mon50c,mon20c,mon10c;
        
        int euros;
        int centimos;
        
        System.out.print("Monedas de 1€: ");
        mon1e=Integer.parseInt(teclado.nextLine());
        System.out.print("Monedas de 2€: ");
        mon2e=Integer.parseInt(teclado.nextLine());
        System.out.print("Monedas de 50centimos: ");
        mon50c=Integer.parseInt(teclado.nextLine());
        System.out.print("Monedas de 20centimos: ");
        mon20c=Integer.parseInt(teclado.nextLine());
        System.out.print("Monedas de 10centimos: ");
        mon10c=Integer.parseInt(teclado.nextLine());
        
        euros=(mon1e*1)+(mon2e*2);
        centimos=(mon50c*50)+(mon20c*20)+(mon10c*10);
        
        System.out.println("----------totales-------------");
        System.out.println("Euros: "+euros+"€");
        System.out.println("Centimos: "+centimos+"cen");
        System.out.println("------------------------------");
        
        //A los euros, le sumo los euros extra de los centimos
        int eurosExtra=centimos/100;
        int eurosTotales=euros+eurosExtra;
        
        //Calculo el resto de centimos
        int centimosResto=centimos%100;
        
        System.out.printf("Todo suma\033[35m %d euros y %d centimos\n",eurosTotales,centimosResto);
        
        
        
        
        
        
        
    }
    
}
