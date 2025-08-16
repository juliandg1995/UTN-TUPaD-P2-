package javaapplication1;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
import java.util.Scanner;

public class ErrorEjemplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
//        String nombre = scanner.nextInt(); //ERROR --> el método nextInt() devuelve lee y devuelve enteros
        String nombre = scanner.nextLine(); // Corrección  --> nextLine() lee y devuelve una cadena (String)
        System.out.println("Hola, " + nombre);
    }
}
