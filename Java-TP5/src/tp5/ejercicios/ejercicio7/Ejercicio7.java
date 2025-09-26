
package tp5.ejercicios.ejercicio7;

import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 7
 * - Asociacion bidireccional: Vehiculo <-> Conductor.
 * - Agregacion: Vehiculo -> Motor.
 */
public class Ejercicio7 {
    
    public static void main(String[] args){
        System.out.println("---- Alta de Vehiculo ----");

        // Conductor (creado con constructor)
        System.out.println("\n---- Datos de Conductor ----");
        String nombre = Consola.leerTextoValidado(
            "Nombre: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        String licencia = Consola.leerTextoValidado(
            "Licencia (5..20 caracteres): ",
            Patrones.alfanumericoUnicode(5, 20),
            "Invalido: use 5..20 caracteres."
        );
        Conductor conductor = new Conductor(nombre, licencia, null);

        // Motor (agregacion, opcional)
        System.out.println("\n---- Motor (opcional) ----");
        boolean agregarMotor = Consola.leerSiNo("Desea agregar un motor");
        Motor motor = null;
        if(agregarMotor){
            String tipo = Consola.leerTextoValidado(
                "Tipo de motor: ",
                Patrones.alfanumericoUnicode(1, 40),
                "Invalido: use 1..40 caracteres."
            );
            String nroSerie = Consola.leerTextoValidado(
                "Numero de serie: ",
                Patrones.alfanumericoUnicode(1, 40),
                "Invalido: use 1..40 caracteres."
            );
            motor = new Motor(tipo, nroSerie);
        }

        // Vehiculo (constructor completo)
        System.out.println("\n---- Datos de Vehiculo ----");
        String patente = Consola.leerTextoValidado(
            "Patente (6..10 caracteres): ",
            Patrones.alfanumericoUnicode(6, 10),
            "Invalido: use 6..10 caracteres."
        );
        String modelo = Consola.leerTextoValidado(
            "Modelo: ",
            Patrones.alfanumericoUnicode(1, 40),
            "Invalido: use 1..40 caracteres."
        );
        Vehiculo vehiculo = new Vehiculo(patente, modelo);
        vehiculo.setMotor(motor); vehiculo.setConductor(conductor);   // un vehículo puede existir sin motor ni conductor
        
        // Cierro bidireccionalidad
        conductor.setVehiculo(vehiculo);

        System.out.println("\n---- Resultado ----");
        System.out.println(vehiculo.toString());
        System.out.println(conductor.toString());
        System.out.println(motor!=null ? motor.toString() : "Motor{tipo=null, numeroSerie=null}");
    }
}
