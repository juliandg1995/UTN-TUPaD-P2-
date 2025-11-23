
package Ejercicio3.model;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

import java.util.ArrayList;
import java.util.List;

public class Universidad{

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre){
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p){
        if(p != null && !profesores.contains(p)){
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c){
        if(c != null && !cursos.contains(c)){
            cursos.add(c);
        }
    }

    public Profesor buscarProfesorPorId(String id){
        for(Profesor p : profesores){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo){
        for(Curso c : cursos){
            if(c.getCodigo().equals(codigo)){
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if(c != null && p != null){
            c.setProfesor(p); // internamente sincroniza ambos lados
        }
    }

    public void listarProfesores(){
        System.out.println("=== PROFESORES ===");
        for(Profesor p : profesores){
            p.mostrarInfo();
        }
    }

    public void listarCursos(){
        System.out.println("=== CURSOS ===");
        for(Curso c : cursos){
            c.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo){
        Curso c = buscarCursoPorCodigo(codigo);
        if(c != null){
            // Romper relación con el profesor, si existe
            if(c.getProfesor() != null){
                c.setProfesor(null);
            }
            cursos.remove(c);
        }
    }

    public void eliminarProfesor(String id){
        Profesor p = buscarProfesorPorId(id);
        if(p != null){
            // Dejar profesor = null en todos los cursos que dictaba
            for(Curso c : new ArrayList<>(p.getCursos())){
                c.setProfesor(null);
            }
            profesores.remove(p);
        }
    }

    // Reporte: cantidad de cursos por profesor
    public void reporteCursosPorProfesor(){
        System.out.println("=== REPORTE: Cursos por profesor ===");
        for(Profesor p : profesores){
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }
}
