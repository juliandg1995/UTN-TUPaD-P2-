package tp2;
import java.util.Scanner;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class CalculaPrecioProducto {

    // Método que calcula el precio final (estático para no tener que instanciar el objeto)
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicitan los datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble();

        // Cálculo del precio final usando el método #calcularPrecioFinal
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Print del resultado
        System.out.println("El precio final del producto es: " + precioFinal);

        scanner.close();
    }
}
