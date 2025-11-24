
package ejercicio2;

/**
 * Excepción personalizada CHECKED (extiende Exception).
 * Se usa para validar reglas de negocio relacionadas con la edad.
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
public class EdadInvalidaException extends Exception{

    public EdadInvalidaException(String mensaje){
        super(mensaje);
    }
}
