package tp2;
import java.util.Scanner;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class SumarPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int sumaPares = 0;
        
        // Ingreso de valores
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }

        } while (numero != 0);

        // Print del resultado
        System.out.println("La suma de los números pares es: " + sumaPares);

        scanner.close();
    }
}
