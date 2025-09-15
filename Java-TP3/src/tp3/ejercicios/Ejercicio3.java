package tp3.ejercicios;

import tp3.io.Consola;
import tp3.io.Patrones;
import tp3.modelos.Libro;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 3
 * Encapsulamiento con Clase Libro:
 * - Se leen datos del libro con validación.
 * - Se intenta modificar el año con un valor inválido y luego con uno válido.
 * - Se muestra la información final.
 */
public class Ejercicio3 {

    public static void main(String[] args){
        // Se ingresan datos básicos con validación de texto simple
        String titulo = Consola.leerTextoValidado(
                "Título: ",
                Patrones.alfanumericoAscii(2, 60),
                "Use letras/dígitos/espacios (2-60)."
        );
        String autor = Consola.leerTextoValidado(
                "Autor: ",
                Patrones.alfanumericoAscii(2, 40),
                "Use letras/dígitos/espacios (2-40)."
        );

        // Año inicial (válido)
        int min = Libro.MIN_ANIO;
        int max = Libro.maxAnioAdmitido();
        int anio = Consola.leerEntero("Año de publicación (" + min + ".." + max + "): ", min, max);

        // Se crea la instancia
        Libro libro = new Libro(titulo, autor, anio);

        // Estado inicial
        System.out.println("\n== Estado inicial ==");
        libro.mostrarInfo();

        // Intento inválido (forzando un año fuera de rango para demostrar la validación)
        int anioInvalido = max + 5; // año inválido
        System.out.println("\nIntentando setear año inválido: " + anioInvalido);
        libro.setAnioPublicacion(anioInvalido);

        // Intento válido (solicitado al usuario)
        int anioValido = Consola.leerEntero(
                "Ingrese un año válido para actualizar (" + min + ".." + max + "): ",
                min, max
        );
        libro.setAnioPublicacion(anioValido);

        // Estado final
        System.out.println("\n== Estado final ==");
        libro.mostrarInfo();
    }
}
