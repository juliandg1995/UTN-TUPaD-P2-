
package tp5.ejercicios.ejercicio_13;

import tp3.io.Consola;
import tp3.io.Patrones;
import tp5.ejercicios.ejercicio8.Usuario;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 13
 * - Asociacion unidireccional: CodigoQR -> Usuario.
 * - Dependencia de creacion: GeneradorQR.generar(String, Usuario).
 */

public class Ejercicio13{
    public static void main(String[] args){
        System.out.println("---- Generacion de CodigoQR ----");

        System.out.println("\n---- Datos de Usuario ----");
        String nombre = Consola.leerTextoValidado(
            "Nombre: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        String email = Consola.leerTextoValidado(
            "Email: ",
            Patrones.email(),
            "Invalido: formato de email no valido."
        );
        Usuario usuario = new Usuario(nombre, email);

        System.out.println("\n---- Datos del Codigo ----");
        String valor = Consola.leerTextoValidado(
            "Valor del QR: ",
            Patrones.alfanumericoUnicode(1, 80),
            "Invalido: use 1..80 caracteres."
        );

        GeneradorQR generador = new GeneradorQR();

        System.out.println("\n---- Resultado ----");
        System.out.println(usuario);
        System.out.println(generador);

        System.out.println("\n---- Accion ----");
        generador.generar(valor, usuario);
    }
}
