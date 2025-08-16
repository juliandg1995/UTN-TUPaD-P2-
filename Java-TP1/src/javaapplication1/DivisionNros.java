
package javaapplication1;
import java.util.Scanner;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class DivisionNros {

    public static void main(String[] args) {
        
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextDouble();
        
        System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
        
    }
    
}
