
package Ejercicio2.model;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca{

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    public void listarLibros(){
        for(Libro l : libros){
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn){
        for(Libro l : libros){
            if(l.getIsbn().equals(isbn)){
                return l;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn){
        Libro l = buscarLibroPorIsbn(isbn);
        if(l != null){
            return libros.remove(l);
        }
        return false;
    }

    public int obtenerCantidadLibros(){
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio){
        List<Libro> resultado = new ArrayList<>();
        for(Libro l : libros){
            if(l.getAnioPublicacion() == anio){
                resultado.add(l);
            }
        }
        return resultado;
    }

    public void mostrarAutoresDisponibles(){
        Set<String> nombres = new HashSet<>();
        for(Libro l : libros){
            nombres.add(l.getAutor().getNombre());
        }
        System.out.println("Autores en la biblioteca:");
        for(String nombreAutor : nombres){
            System.out.println("- " + nombreAutor);
        }
    }
}
