
package ejercicio3;

/**
 * Clase Empleado Planta (extiende de Empleado)
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class EmpleadoPlanta extends Empleado{

    private double sueldoBase;
    private int aniosAntiguedad;
    private double adicionalPorAnio;

    public EmpleadoPlanta(String nombre, double sueldoBase,
                          int aniosAntiguedad, double adicionalPorAnio){
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.aniosAntiguedad = aniosAntiguedad;
        this.adicionalPorAnio = adicionalPorAnio;
    }

    @Override
    public double calcularSueldo(){
        // Sueldo base + un adicional por cada año de antigüedad 
        return sueldoBase + aniosAntiguedad * adicionalPorAnio;
    }
}

