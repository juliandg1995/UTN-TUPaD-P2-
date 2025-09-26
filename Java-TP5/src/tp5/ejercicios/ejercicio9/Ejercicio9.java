
package tp5.ejercicios.ejercicio9;

import java.time.LocalDate;
import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 9
 * - Asociacion unidireccional: CitaMedica -> Paciente.
 * - Asociacion unidireccional: CitaMedica -> Profesional.
 */

public class Ejercicio9{
    public static void main(String[] args){
        System.out.println("---- Alta de CitaMedica ----");

        // Paciente
        System.out.println("\n---- Datos de Paciente ----");
        String nomPac = Consola.leerTextoValidado(
            "Nombre: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        String obra = Consola.leerTextoValidado(
            "Obra social: ",
            Patrones.alfanumericoUnicode(1, 40),
            "Invalido: use 1..40 caracteres."
        );
        Paciente paciente = new Paciente(nomPac, obra);

        // Profesional
        System.out.println("\n---- Datos de Profesional ----");
        String nomProf = Consola.leerTextoValidado(
            "Nombre: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        String esp = Consola.leerTextoValidado(
            "Especialidad: ",
            Patrones.alfanumericoUnicode(1, 40),
            "Invalido: use 1..40 caracteres."
        );
        Profesional profesional = new Profesional(nomProf, esp);

        // CitaMedica (constructor completo)
        System.out.println("\n---- Datos de Cita ----");
        LocalDate fecha = Consola.leerFechaISO("Fecha");
        String hora = Consola.leerTextoValidado(
            "Hora (HH:mm): ",
            Patrones.horaHHmm24(),              // regex para el formato válido de la hora 
            "Invalido: use formato HH:mm"
        );
        CitaMedica cita = new CitaMedica(fecha, hora, paciente, profesional);

        System.out.println("\n---- Resultado ----");
        System.out.println(cita.toString());
        System.out.println(paciente.toString());
        System.out.println(profesional.toString());
    }
}