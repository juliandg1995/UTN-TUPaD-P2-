
package Ejercicio3.main;
import Ejercicio3.model.*;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */


public class MainUniversidad{
    public static void main(String[] args){

        Universidad uni = new Universidad("Universidad UTN");

        // 1) Crear al menos 3 profesores y 5 cursos
        Profesor prof1 = new Profesor("P1", "Ana López", "Matemática");
        Profesor prof2 = new Profesor("P2", "Juan Pérez", "Programación");
        Profesor prof3 = new Profesor("P3", "María García", "Bases de Datos");

        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "Programación I");
        Curso c3 = new Curso("C3", "Programación II");
        Curso c4 = new Curso("C4", "Bases de Datos I");
        Curso c5 = new Curso("C5", "Sistemas Operativos");

        // 2) Agregar profesores y cursos a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3) Asignar profesores a cursos
        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C2", "P2");
        uni.asignarProfesorACurso("C3", "P2");
        uni.asignarProfesorACurso("C4", "P3");
        uni.asignarProfesorACurso("C5", "P3");

        // 4) Listar cursos con profesor y profesores con cursos
        System.out.println("\n=== LISTA DE CURSOS ===");
        uni.listarCursos();

        System.out.println("\n=== LISTA DE PROFESORES Y SUS CURSOS ===");
        for(Profesor p : new java.util.ArrayList<>(uni.buscarProfesorPorId("P1") != null ?
                java.util.List.of(prof1, prof2, prof3) : java.util.List.<Profesor>of())){
            p.mostrarInfo();
            p.listarCursos();
        }

        // 5) Cambiar profesor de un curso
        System.out.println("\n=== CAMBIAR PROFESOR DE C3 A P3 ===");
        uni.asignarProfesorACurso("C3", "P3");
        uni.listarCursos();

        // 6) Remover un curso y verificar que ya no está en la lista del profesor
        System.out.println("\n=== ELIMINAR CURSO C2 ===");
        uni.eliminarCurso("C2");
        uni.listarCursos();
        System.out.println("\nCursos de Juan Pérez luego de eliminar C2:");
        prof2.listarCursos();

        // 7) Remover un profesor y dejar profesor = null en sus cursos
        System.out.println("\n=== ELIMINAR PROFESOR P3 ===");
        uni.eliminarProfesor("P3");
        uni.listarCursos();

        // 8) Reporte: cantidad de cursos por profesor
        System.out.println();
        uni.reporteCursosPorProfesor();
    }
}
