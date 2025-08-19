package tp2;

/**
 * TP2 - Ejercicio 13
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
public class RecursionDePrecios {

    // Se imprime recursivamente el array desde el índice dado
    public static void imprimirPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirPrecios(precios, indice + 1);
        }
    }

    // Se modifica el precio del producto en el índice indicado
    public static void modificarPrecio(double[] precios, int indice, double nuevoPrecio) {
        precios[indice] = nuevoPrecio;
    }

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);

        modificarPrecio(precios, 2, 129.99);

        System.out.println("Precios modificados:");
        imprimirPrecios(precios, 0);
    }

}
