package tp2;
import java.util.Scanner;
/**
 * TP2 - Ejercicio 9
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
public class CompraEnLinea {
    
    // Método que calcula el costo de envío según zona y peso
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona inválida. Se considerará envío Nacional por defecto.");
            return peso * 5;
        }
    }

    // Método que calcula el total de la compra sumando precio del producto y costo de envío
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        // Solicitar peso del paquete
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        // Solicitar zona de envío
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine();

        // Calcular costo de envío
        double costoEnvio = calcularCostoEnvio(peso, zona);

        // Calcular total a pagar
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        // Mostrar resultados
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        scanner.close();
    }
}
