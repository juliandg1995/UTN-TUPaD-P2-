package tp2;

import java.util.Scanner;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class ContadorDeNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int n = sc.nextInt();

            if (n > 0) {
                positivos++;
            } else if (n < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        sc.close();
    }
}
