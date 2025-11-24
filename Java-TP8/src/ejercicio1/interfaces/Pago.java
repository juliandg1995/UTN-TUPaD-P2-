
package ejercicio1.interfaces;

/**
 * Interfaz que define el comportamiento básico de un MEDIO DE PAGO.
 * - La implementan TarjetaCredito y PayPal.
 * - Permite cambiar el tipo de pago sin modificar la lógica del pedido.
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public interface Pago{

    /**
     * Procesa el pago de un monto determinado.
     * Podría lanzar excepciones en un sistema real (rechazo, error de conexión, etc.).
     */
    void procesarPago(double monto);
}

