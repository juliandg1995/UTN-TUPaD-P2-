package tp1;
import  java.util.Scanner;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
public class ReadValues {

    public static void main(String[] args) {
        
        String nombre;
        int edad;
        
        Scanner scaner = new Scanner(System.in); 
        System.out.println("Ingrese su nombre: "); nombre = scaner.nextLine();
        System.out.println("Ingrese su edad: "); edad = scaner.nextInt();
        
        System.out.println("Nombre: " + nombre + '\n'
                           +"Edad: " + edad);
    }
}
