
package tp2;
import java.util.Scanner;

/**
 * TP2 - EJercicio 10
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
public class ActualizaciónStock {

  // Se calcula el nuevo stock del producto
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Stock Actual
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();

        // Cantidad vendida
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();

        // Cantidad recibida
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();

        // Se calcula y muestra el nuevo stock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        scanner.close();
    }    
    
}
