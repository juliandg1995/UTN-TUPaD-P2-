
package ejercicio1.interfaces;

/**
 * Contrato para cualquier entidad que pueda ser NOTIFICADA.
 * - En este caso lo implementa Cliente.
 * - Pedido utilizará esta interfaz para avisar al cliente cuando cambie de estado,
 *   sin acoplarse a la clase concreta (puede ser Cliente u otra cosa que implemente Notificable).
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public interface Notificable{

    /**
     * Recibe un mensaje de notificación.
     */
    void notificar(String mensaje);
}

