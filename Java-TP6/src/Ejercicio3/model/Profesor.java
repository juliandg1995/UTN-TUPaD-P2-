
package Ejercicio3.model;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

import java.util.ArrayList;
import java.util.List;

public class Profesor{

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad){
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public List<Curso> getCursos(){
        return cursos;
    }

    // Agrega el curso y sincroniza el lado del curso
    public void agregarCurso(Curso c){
        if(c == null){
            return;
        }
        if(!cursos.contains(c)){
            cursos.add(c);
        }
        if(c.getProfesor() != this){
            c.setProfesor(this);
        }
    }

    // Elimina el curso y sincroniza el lado del curso
    public void eliminarCurso(Curso c){
        if(c == null){
            return;
        }
        if(cursos.contains(c)){
            cursos.remove(c);
        }
        if(c.getProfesor() == this){
            c.setProfesor(null);
        }
    }

    public void listarCursos(){
        System.out.println("Cursos del profesor " + nombre + ":");
        for(Curso c : cursos){
            System.out.println("- " + c.getCodigo() + " - " + c.getNombre());
        }
    }

    public void mostrarInfo(){
        System.out.println("Profesor{id='" + id + "', nombre='" + nombre +
                "', especialidad='" + especialidad +
                "', cantidadCursos=" + cursos.size() + "}");
    }
}
