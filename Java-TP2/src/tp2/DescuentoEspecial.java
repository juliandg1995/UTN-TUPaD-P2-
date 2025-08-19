
package tp2;
import java.util.Scanner;

/**
 * TP2 - Ejercicio 11
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
public class DescuentoEspecial {
    
// Se declara la variable global con el valor del descuento
    static double DESCUENTO = 0.10;

    // Se calcula y retorna el precio final con descuento
    public static double calcularDescuentoEspecial(double precio) {
        
        // Se calcula el descuento sobre el precio original
        double descuentoAplicado = precio * DESCUENTO;

        // Se calcula el precio final
        double precioFinal = precio - descuentoAplicado;

        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicita el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        // Se calcula el descuento
        double descuentoAplicado = precio * DESCUENTO;

        // Se llama al método para obtener el precio final
        double precioFinal = calcularDescuentoEspecial(precio);

        // Print con los resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);

        scanner.close();
    }
}
