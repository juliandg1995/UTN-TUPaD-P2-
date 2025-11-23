
package ejercicio3;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 3
 * - Define la clase abstracta Empleado con calcularSueldo().
 * - Implementa EmpleadoPlanta y EmpleadoTemporal.
 * - Usa una lista de Empleado, llama calcularSueldo() polimórficamente
 *   y clasifica los empleados con instanceof.
 */

import java.util.ArrayList;
import java.util.List;


public class Ejercicio3{
    public static void main(String[] args){
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 300000, 5, 15000));
        empleados.add(new EmpleadoTemporal("Luis", 120, 2000));
        empleados.add(new EmpleadoPlanta("María", 280000, 2, 12000));
        empleados.add(new EmpleadoTemporal("Jorge", 80, 2200));

        int cantidadPlanta = 0;
        int cantidadTemporales = 0;

        System.out.println("LISTADO DE EMPLEADOS Y SUELDOS:");
        for(Empleado e : empleados){
            double sueldo = e.calcularSueldo(); // polimorfismo aplicado
            System.out.print(e.getNombre() + " -> Sueldo: " + sueldo);

            // Clasificación usando instanceof (downcasting solo si fuera necesario)
            if(e instanceof EmpleadoPlanta){
                cantidadPlanta++;
                System.out.println(" (Empleado de planta)");
            }else if(e instanceof EmpleadoTemporal){
                cantidadTemporales++;
                System.out.println(" (Empleado temporal)");
            }else{
                System.out.println(" (Tipo desconocido)");
            }
        }

        System.out.println("\nResumen:");
        System.out.println("Empleados de planta: " + cantidadPlanta);
        System.out.println("Empleados temporales: " + cantidadTemporales);
    }
}

