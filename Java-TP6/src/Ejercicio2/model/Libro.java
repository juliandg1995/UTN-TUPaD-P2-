
package Ejercicio2.model;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Libro{

    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getAnioPublicacion(){
        return anioPublicacion;
    }

    public Autor getAutor(){
        return autor;
    }

    public void mostrarInfo(){
        System.out.println("Libro{isbn='" + isbn + "', titulo='" + titulo +
                "', anioPublicacion=" + anioPublicacion +
                ", autor='" + autor.getNombre() + "'}");
    }
}

