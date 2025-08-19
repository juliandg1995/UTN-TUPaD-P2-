package tp2;
import java.util.Scanner;

/**
 * TP2 - Ejercicio 7
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class ValidarNota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        while (true) {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota guardada correctamente.");
                break;
            } else {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        }

        scanner.close();
    }
}
