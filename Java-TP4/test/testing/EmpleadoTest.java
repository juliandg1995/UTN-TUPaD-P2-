package testing;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * EmpleadoTest
 * Sistema de Gestión de Empleados:
 * - Se instancian varios empleados usando ambos constructores.
 * - Se aplican los métodos sobrecargados actualizarSalario() en distintos empleados.
 * - Se imprime la información de cada empleado con toString().
 * - Se muestra el total de empleados creados con mostrarTotalEmpleados().
 */
import tp4.modelos.Empleado;

public class EmpleadoTest{

    public static void main(String[] args){
        
        // Creo empleados usando ambos constructores a modo de prueba
        Empleado e1 = new Empleado(1, "Diego Capusotto", "Talent & Culture Manager", 850000.0);
        Empleado e2 = new Empleado("Mirtha Legrand", "CEO");
        Empleado e3 = new Empleado("Tomas Rebord", "Delivery Specialist");

        // Aplico aumento por porcentaje a e1 (ej.: +12%)
        e1.actualizarSalario(12.0);

        // Aplico aumento por cantidad fija a e2 (ej.: +150000)
        e2.actualizarSalario(150000);

        // Aplico ambos en e3 para ver el comportamiento combinado
        e3.actualizarSalario(10.0);   // +10% sobre el salario por defecto (0.0 → queda 0.0)
        e3.actualizarSalario(200000); // ahora fijo +200000

        // Imprimo el estado de cada empleado
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        // Muestro el total de empleados creados (método estático)
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}

