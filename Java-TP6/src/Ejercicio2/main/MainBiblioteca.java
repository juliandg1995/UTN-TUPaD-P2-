
package Ejercicio2.main;
import Ejercicio2.model.*;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class MainBiblioteca{
    public static void main(String[] args){
        // 1) Crear biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca UTN");

        // 2) Crear al menos tres autores
        Autor a1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A2", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A3", "Julio Cortázar", "Argentina");

        // 3) Agregar 5 libros asociados a autores
        biblio.agregarLibro("ISBN-001", "Cien años de soledad", 1967, a1);
        biblio.agregarLibro("ISBN-002", "El amor en los tiempos del cólera", 1985, a1);
        biblio.agregarLibro("ISBN-003", "Ficciones", 1944, a2);
        biblio.agregarLibro("ISBN-004", "El Aleph", 1949, a2);
        biblio.agregarLibro("ISBN-005", "Rayuela", 1963, a3);

        // 4) Listar todos los libros
        System.out.println("=== LIBROS EN BIBLIOTECA ===");
        biblio.listarLibros();

        // 5) Buscar un libro por ISBN
        System.out.println("\n=== BUSCAR ISBN-003 ===");
        Libro l = biblio.buscarLibroPorIsbn("ISBN-003");
        if(l != null){
            l.mostrarInfo();
        }

        // 6) Filtrar por año
        System.out.println("\n=== LIBROS PUBLICADOS EN 1949 ===");
        for(Libro libroAnio : biblio.filtrarLibrosPorAnio(1949)){
            libroAnio.mostrarInfo();
        }

        // 7) Eliminar un libro y listar restantes
        System.out.println("\n=== ELIMINAR ISBN-002 Y LISTAR ===");
        biblio.eliminarLibro("ISBN-002");
        biblio.listarLibros();

        // 8) Cantidad de libros
        System.out.println("\nCantidad total de libros: " + biblio.obtenerCantidadLibros());

        // 9) Listar autores disponibles
        System.out.println("\n=== AUTORES DISPONIBLES ===");
        biblio.mostrarAutoresDisponibles();
    }
}

