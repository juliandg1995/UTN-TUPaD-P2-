package tp3.ejercicios;

import tp3.io.Consola;
import tp3.io.Patrones;
import tp3.modelos.Estudiante;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * TP3 - Ejercicio 1
 * Registro de Estudiantes:
 * - Se ingresan datos del estudiante.
 * - Se muestra su información.
 * - Se sube y baja la calificación.
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        
        // Se ingresan los datos para probar las funcionalidades 
        String nombre = Consola.leerTextoValidado(
                "Nombre: ",
                Patrones.alfanumericoUnicode(1, 40),         // Formato válido para el texto
                "Ingrese solo letras y espacios (2 a 40 caracteres)."  
        );
        String apellido = Consola.leerTextoValidado(
                "Apellido: ",
                Patrones.alfanumericoUnicode(1, 40),
                "Ingrese solo letras y espacios (2 a 40 caracteres)."
        );
        String curso = Consola.leerTextoValidado(
                "Curso (ej.: 1A, 3ro B): ",
                Patrones.alfanumericoUnicode(1, 40),
                "Formato inválido. Use letras/números/espacios/-/_/ (1-20)."
        );
        double calificacionInicial = Consola.leerDouble("Calificación inicial (0..10): ", 0, 10);

        // Se instancia el estudiante
        Estudiante est = new Estudiante(nombre, apellido, curso, calificacionInicial);

        // Se muestra primero el estado inicial del objeto
        mostrarEstado("\n== Estado inicial ==", est);

        // Se sube la calificación
        double puntosSubir = Consola.leerDouble("Puntos a subir (>=0): ", 0, 10);
        est.subirCalificacion(puntosSubir);
        mostrarEstado("\n== Luego de subir ==", est);

        // Se baja la calificación
        double puntosBajar = Consola.leerDouble("Puntos a bajar (>=0): ", 0, 10);
        est.bajarCalificacion(puntosBajar);
        mostrarEstado("\n== Luego de bajar ==", est);
    }

    // Módulo local para imprimir encabezado + info
    private static void mostrarEstado(String titulo, Estudiante e) {
        System.out.println(titulo);
        e.mostrarInfo();
    }
}
