package tp3.ejercicios;

import tp3.io.Consola;
import tp3.io.Patrones;
import tp3.modelos.Mascota;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejeercicio 2
 * Registro de Mascotas:
 * - Se ingresan datos de la mascota (validación alfanumérica simple).
 * - Se muestra su información.
 * - Se simula el paso del tiempo con cumplirAnios() y se verifican los cambios.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        // Se ingresan los datos
        String nombre = Consola.leerTextoValidado(
                "Nombre de la mascota: ",
                Patrones.alfanumericoAscii(2, 30),
                "Use letras/dígitos/espacios (2-30)."
        );
        String especie = Consola.leerTextoValidado(
                "Especie: ",
                Patrones.alfanumericoAscii(3, 30),
                "Use letras/dígitos/espacios (3-30)."
        );
        int edad = Consola.leerEntero("Edad inicial (años, 0..60): ", 0, 60);

        // Se crea la instancia
        Mascota m = new Mascota(nombre, especie, edad);

        // Estado inicial
        mostrarEstado("\n== Estado inicial ==", m);

        // Se simula el paso del tiempo
        int anios = Consola.leerEntero("¿Cuántos años desea simular? (0..50): ", 0, 50);
        avanzarTiempo(m, anios);

        // Estado final
        mostrarEstado("\n== Luego de simular el paso del tiempo ==", m);

        // Opción de continuar simulando
        while (Consola.leerSiNo("\n¿Desea simular más años?")) {
            int extra = Consola.leerEntero("Años adicionales (0..50): ", 0, 50);
            avanzarTiempo(m, extra);
            mostrarEstado("\n== Estado actualizado ==", m);
        }
    }

    // Se realizan N incrementos controlados de edad
    private static void avanzarTiempo(Mascota m, int anios) {
        for (int i = 0; i < anios; i++) {
            m.cumplirAnios();
        }
    }

    // Encabezado + info actual de la mascota
    private static void mostrarEstado(String titulo, Mascota m) {
        System.out.println(titulo);
        m.mostrarInfo();
    }
}

