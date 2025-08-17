package tp2;
import java.util.Scanner;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
public class CalculaDescuentoProducto {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precio
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();

        // Categoria
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);

        double descuento = 0;

        // Se determina el porcentaje de descuento
        switch (categoria) {
            case 'A':
                descuento = 0.10;
                break;
            case 'B':
                descuento = 0.15;
                break;
            case 'C':
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoría no válida.");
                scanner.close();
                return;
        }

        // Cálculo del precio final
        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;

        // Display del resultado
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);

        scanner.close();
    }
}
