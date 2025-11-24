
package ejercicio1.models;

/**
 * Clase de constantes EstadoPedido
 * Enum para representar el estado de un pedido.
 * Facilita evitar errores de escritura en cadenas y da más seguridad de tipos.
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public enum EstadoPedido{
    NUEVO,
    PAGADO,
    EN_PREPARACION,
    ENVIADO,
    ENTREGADO,
    CANCELADO
}
