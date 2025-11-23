
package ejercicio3;

/**
 * Clase EmpleadoTemporal (extiende de Empleado)
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class EmpleadoTemporal extends Empleado{

    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double valorHora){
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo(){
        return horasTrabajadas * valorHora;
    }
}
