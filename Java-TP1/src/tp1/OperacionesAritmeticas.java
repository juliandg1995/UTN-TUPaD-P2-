
package tp1;

import java.util.Scanner;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
public class OperacionesAritmeticas {
    
     public static void main(String[] args) {
        
        double num1;
        double num2;
        
        Scanner scaner = new Scanner(System.in); 
        
        System.out.println("Ingrese el Nro. 1: "); num1 = scaner.nextDouble();
        System.out.println("Ingrese el Nro. 2: "); num2 = scaner.nextDouble();
        
        System.out.println("Operaciones Aritméticas básicas: " + '\n' 
                           + num1 + " + " + num2 + " = " + (num1 + num2) + '\n'
                           + num1 + " - " + num2 + " = " + (num1 - num2) + '\n'
                           + num1 + " x " + num2 + " = " + (num1 * num2) + '\n'
                           + num1 + " / " + num2 + " = " + (num1 / num2));
    }

}
