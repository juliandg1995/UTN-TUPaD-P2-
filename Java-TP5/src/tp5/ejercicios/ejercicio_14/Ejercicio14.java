
package tp5.ejercicios.ejercicio_14;

import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 14
 * - Asociacion unidireccional: Render -> Proyecto.
 * - Dependencia de creacion: EditorVideo.exportar(String, Proyecto).
 */

public class Ejercicio14{
    public static void main(String[] args){
        System.out.println("---- Alta de Proyecto y exportacion ----");

        // Proyecto (constructor)
        System.out.println("\n---- Datos de Proyecto ----");
        String nombre = Consola.leerTextoValidado(
            "Nombre: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        int duracion = Consola.leerEntero("Duracion en minutos (1..600): ", 1, 600);
        Proyecto proyecto = new Proyecto(nombre, duracion);

        // Editor de video
        EditorVideo editor = new EditorVideo();

        // Formato y exportar
        System.out.println("\n---- Exportacion ----");
        String formato = Consola.leerTextoValidado(
            "Formato (ej mp4, mov, mkv): ",
            Patrones.alfanumericoUnicode(2, 10),
            "Invalido: use 2..10 caracteres."
        );

        System.out.println("\n---- Resultado ----");
        System.out.println(proyecto);
        System.out.println(editor);

        System.out.println("\n---- Accion ----");
        editor.exportar(formato, proyecto);
    }
}