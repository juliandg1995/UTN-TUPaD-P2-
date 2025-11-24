
package ejercicio1.interfaces;

/**
 * Define un CONTRATO para cualquier cosa que pueda calcular un total en dinero.
 * - Lo implementan Producto y Pedido.
 * - Esto permite tratar a ambos polimórficamente como "Pagable",
 *   sin importar la clase concreta.
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public interface Pagable{

    /**
     * Calcula el total asociado al objeto.
     * En Producto devolverá el precio del producto.
     * En Pedido devolverá la suma de los precios de todos los productos.
     */
    double calcularTotal();
}
