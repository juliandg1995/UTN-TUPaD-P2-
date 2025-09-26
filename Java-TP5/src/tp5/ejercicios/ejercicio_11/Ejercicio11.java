
package tp5.ejercicios.ejercicio_11;

import java.util.ArrayList;
import java.util.List;
import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 11
 * - Asociacion bidireccional N..N: Cancion - Artista.
 * - Dependencia: Reproductor.reproducir(Cancion).
 */
public class Ejercicio11{
    public static void main(String[] args){
        System.out.println("---- Creación y reproduccion de Cancion ----");

        // Cantidad de artistas a asociar
        int cant = Consola.leerEntero("Cantidad de artistas (1..5): ", 1, 5);

        // Creo la lista de artistas con constructor
        List<Artista> artistas = new ArrayList<>();
        for(int i=1;i<=cant;i++){
            System.out.println("\n---- Datos de Artista #" + i + " ----");
            String nomArt = Consola.leerTextoValidado(
                "Nombre: ",
                Patrones.alfanumericoUnicode(1, 60),
                "Invalido: use 1..60 caracteres."
            );
            String genero = Consola.leerTextoValidado(
                "Genero: ",
                Patrones.alfanumericoUnicode(1, 40),
                "Invalido: use 1..40 caracteres."
            );
            // cada artista nace con su lista de canciones vacia
            Artista artista = new Artista(nomArt, genero, new ArrayList<>());
            artistas.add(artista);
        }

        // Cancion con lista de artistas (constructor)
        System.out.println("\n---- Datos de Cancion ----");
        String titulo = Consola.leerTextoValidado(
            "Titulo: ",
            Patrones.alfanumericoUnicode(1, 80),
            "Invalido: use 1..80 caracteres."
        );
        Cancion cancion = new Cancion(titulo, artistas);

        // Completo la bidireccionalidad: agrego la cancion en cada artista
        for(Artista a : artistas){
            a.getCanciones().add(cancion);
        }

        // Reproductor (dependencia de uso)
        Reproductor reproductor = new Reproductor();

        System.out.println("\n---- Resultado ----");
        System.out.println(cancion);
        
        // imprimo artistas usando foreach
        for (Artista a : artistas){
            System.out.println(a);
        }
        System.out.println(reproductor);

        System.out.println("\n---- Accion ----");
        reproductor.reproducir(cancion);
    }
}