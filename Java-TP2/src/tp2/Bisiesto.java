package tp2;
import java.util.Scanner;

/**
 * TP2 - Ejercicio 1
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Bisiesto {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        // Se verifica si el año es bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }

        scanner.close();
    }
}
