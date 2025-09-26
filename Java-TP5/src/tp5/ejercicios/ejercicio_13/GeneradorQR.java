
package tp5.ejercicios.ejercicio_13;

import tp5.ejercicios.ejercicio8.Usuario;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class GeneradorQR{

    // Constructores
    public GeneradorQR(){}

    // toString
    @Override
    public String toString(){
        return "GeneradorQR{}";
    }

    // Dependencia de creacion: crea un CodigoQR y no lo conserva
    public void generar(String valor, Usuario usuario){
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("Generado: " + qr);
    }
}