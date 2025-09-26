
package tp5.ejercicios.ejercicio3;

import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 3
 * - Asociacion unidireccional: Libro -> Autor.
 * - Agregacion: Libro -> Editorial.
 */

public class Ejercicio3{
    
    public static void main(String[] args){
        
        System.out.println("---- Alta de Libro ----");

        // Autor (obligatorio para la asociacion unidireccional Libro -> Autor)
        System.out.println("\n---- Datos de Autor ----");
        String nombreAutor = Consola.leerTextoValidado(
            "Nombre del autor: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        String nacionalidad = Consola.leerTextoValidado(
            "Nacionalidad: ",
            Patrones.alfanumericoUnicode(1, 40),
            "Invalido: use 1..40 caracteres."
        );
        Autor autor = new Autor(nombreAutor, nacionalidad);

        // Editorial (agregacion, opcional)
        System.out.println("\n---- Editorial (opcional) ----");
        boolean agregarEditorial = Consola.leerSiNo("Desea agregar una editorial");
        Editorial editorial = null;
        if(agregarEditorial){
            String nombreEd = Consola.leerTextoValidado(
                "Nombre de la editorial: ",
                Patrones.alfanumericoUnicode(1, 60),
                "Invalido: use 1..60 caracteres."
            );
            String direccionEd = Consola.leerTextoValidado(
                "Direccion: ",
                Patrones.alfanumericoUnicode(1, 80),
                "Invalido: use 1..80 caracteres."
            );
            editorial = new Editorial(nombreEd, direccionEd);
        }

        // Libro
        System.out.println("\n---- Datos de Libro ----");
        String titulo = Consola.leerTextoValidado(
            "Titulo: ",
            Patrones.alfanumericoUnicode(1, 80),
            "Invalido: use 1..80 caracteres."
        );
        String isbn = Consola.leerTextoValidado(
            "ISBN (10 a 17 caracteres, ej 978..., con guiones opcionales): ",
            "^[0-9-]{10,17}$",
            "Invalido: use 10..17 caracteres numericos o guiones."
        );

        Libro libro = new Libro();
        libro.setTitulo(titulo);
        libro.setIsbn(isbn);
        libro.setAutor(autor);         // asociacion unidireccional
        libro.setEditorial(editorial); // agregacion (puede quedar null)

        System.out.println("\n---- Resultado ----");
        System.out.println(libro.toString());
        System.out.println(autor.toString());
        System.out.println(editorial!=null ? editorial.toString() : "Editorial{nombre=null, direccion=null}");
        
    }
}
