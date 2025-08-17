package tp2;
import java.util.Scanner;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
public class MayorDeTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicitan los tres números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        // Se determina el mayor
        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        // Mostrar el resultado
        System.out.println("El mayor es: " + mayor);

        scanner.close();
    }
}
