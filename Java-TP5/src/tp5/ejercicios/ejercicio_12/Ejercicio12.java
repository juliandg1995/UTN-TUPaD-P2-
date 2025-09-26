
package tp5.ejercicios.ejercicio_12;

import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 12
 * - Asociacion unidireccional: Impuesto -> Contribuyente.
 * - Dependencia: Calculadora.calcular(Impuesto).
 */
public class Ejercicio12{
    public static void main(String[] args){
        System.out.println("---- Alta de Impuesto ----");

        // Contribuyente
        System.out.println("\n---- Datos de Contribuyente ----");
        String nombre = Consola.leerTextoValidado(
            "Nombre: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        String cuil = Consola.leerTextoValidado(
            "CUIL (11 digitos): ",
            Patrones.numerico(11, 11),
            "Invalido: use 11 caracteres numericos."
        );
        Contribuyente contribuyente = new Contribuyente(nombre, cuil);

        // Impuesto
        System.out.println("\n---- Datos de Impuesto ----");
        double monto = Consola.leerDouble("Monto: ");
        Impuesto impuesto = new Impuesto(monto, contribuyente);

        // Calculadora (dependencia)
        Calculadora calc = new Calculadora();

        System.out.println("\n---- Resultado ----");
        System.out.println(impuesto);
        System.out.println(contribuyente);
        System.out.println(calc);

        System.out.println("\n---- Accion ----");
        calc.calcular(impuesto);
    }
}
