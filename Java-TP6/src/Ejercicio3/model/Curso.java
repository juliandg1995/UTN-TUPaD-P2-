
package Ejercicio3.model;
import Ejercicio3.model.Profesor;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Curso{

    private String codigo;
    private String nombre;
    private Profesor profesor; // profesor responsable

    public Curso(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public Profesor getProfesor(){
        return profesor;
    }

    // Mantiene la relación bidireccional sincronizada
    public void setProfesor(Profesor nuevoProfesor){
        if(this.profesor == nuevoProfesor){
            return; // nada que hacer
        }

        // Si ya tenía profesor, me saco de su lista
        if(this.profesor != null){
            this.profesor.getCursos().remove(this);
        }

        // Asigno el nuevo
        this.profesor = nuevoProfesor;

        // Agrego este curso a la lista del nuevo profesor (si no está)
        if(nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)){
            nuevoProfesor.getCursos().add(this);
        }
    }

    public void mostrarInfo(){
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "SIN PROFESOR";
        System.out.println("Curso{codigo='" + codigo + "', nombre='" + nombre +
                "', profesor='" + nombreProfesor + "'}");
    }
}

