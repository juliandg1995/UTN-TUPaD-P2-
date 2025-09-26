
package tp5.ejercicios.ejercicio_11;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

import java.util.List;
import java.util.ArrayList;

public class Artista{

    // Atributos
    private String nombre;
    private String genero;
    private List<Cancion> canciones; // bidireccional

    // Constructores
    public Artista(){
        this.canciones = new ArrayList<>();
    }
    
    public Artista(String nombre, String genero, List<Cancion> canciones){
        this.nombre = nombre;
        this.genero = genero;
        this.canciones = canciones;
    }

    // Getters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public List<Cancion> getCanciones(){
        return canciones;
    }
    public void setCanciones(List<Cancion> canciones){
        this.canciones = canciones;
    }
    
    public void addCancion(Cancion unaCancion){
        canciones.add(unaCancion);
    }

    // toString
    @Override
    public String toString(){
        return "Artista{nombre=" + nombre + ", genero=" + genero + ", canciones=" + canciones + "}";
    }
}