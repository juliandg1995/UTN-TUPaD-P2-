
package tp5.ejercicios.ejercicio_11;

import java.util.List;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Cancion{

    // Atributos
    private String titulo;
    private List<Artista> artistas; // N..N bidireccional -> 1 o más artistas pueden tener 1 o más canciones y vicebersa

    // Constructores
    public Cancion(){}
    
    public Cancion(String titulo, List<Artista> artistas){
        this.titulo = titulo;
        this.artistas = artistas;
    }

    // Getters/Setters
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public List<Artista> getArtistas(){
        return artistas;
    }
    public void setArtistas(List<Artista> artistas){
        this.artistas = artistas;
    }
    
    

    // toString
    @Override
    public String toString(){
        return "Cancion{titulo=" + titulo + ", artistas=" + artistas + "}";
    }
}