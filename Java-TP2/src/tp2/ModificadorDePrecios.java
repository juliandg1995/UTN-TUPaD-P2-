
package tp2;

/**
 * TP2 - Ejercicio 12
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
public class ModificadorDePrecios {

    // Se modifica el precio del producto en el índice indicado
    public static void modificarPrecio(double[] precios, int indice, double nuevoPrecio) {
        precios[indice] = nuevoPrecio;
    }

    public static void main(String[] args) {
        // Declaración e inicialización del array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // Muestra de precios originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // Modificación del tercer precio (índice 2)
        modificarPrecio(precios, 2, 129.99);

        // Muestra de precios modificados
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }    
    
}

