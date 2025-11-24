
package ejercicio1.interfaces;

/**
 * Interfaz adicional que representa la capacidad de aplicar un DESCUENTO.
 * - No extiende de Pago a propósito, para poder mostrar herencia múltiple con interfaces:
 *   una clase puede implementar Pago y PagoConDescuento al mismo tiempo.
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public interface PagoConDescuento extends Pago{

    /**
     * Recibe un monto original y devuelve el monto con descuento aplicado.
     */
    double aplicarDescuento(double monto);
}

