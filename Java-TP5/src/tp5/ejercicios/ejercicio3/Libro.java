
package tp5.ejercicios.ejercicio3;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Libro{

    // Atributos
    private String titulo;
    private String isbn;
    private Autor autor;        // asociacion unidireccional
    private Editorial editorial; // agregacion (opcional: puede ser null)

    // Constructores
    public Libro(){}
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial){
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    // Getters/Setters
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public Autor getAutor(){
        return autor;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    public Editorial getEditorial(){
        return editorial;
    }
    public void setEditorial(Editorial editorial){
        this.editorial = editorial;
    }

    // toString
    @Override
    public String toString(){
        return "Libro{titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + "}";
    }

}