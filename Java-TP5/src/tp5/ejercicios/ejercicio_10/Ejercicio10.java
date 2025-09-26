
package tp5.ejercicios.ejercicio_10;

import java.time.LocalDate;
import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 10
 * - Composicion: CuentaBancaria -> ClaveSeguridad.
 * - Asociacion bidireccional: CuentaBancaria - Titular.
 */

public class Ejercicio10{
    public static void main(String[] args){
        System.out.println("---- Alta de CuentaBancaria ----");

        // Titular
        System.out.println("\n---- Datos de Titular ----");
        String nombre = Consola.leerTextoValidado(
            "Nombre: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        String dni = Consola.leerTextoValidado(
            "DNI (7 a 9 digitos): ",
            Patrones.numerico(7, 9),
            "Invalido: use 7..9 caracteres numericos."
        );
        Titular titular = new Titular(nombre, dni, null);

        // ClaveSeguridad (composicion: obligatoria)
        System.out.println("\n---- Datos de ClaveSeguridad ----");
        String codigo = Consola.leerTextoValidado(
            "Codigo de seguridad: ",
            Patrones.alfanumericoUnicode(4, 20),
            "Invalido: use 4..20 caracteres."
        );
        LocalDate fecha = Consola.leerFechaISO("Fecha de ultima modificacion");
        ClaveSeguridad clave = new ClaveSeguridad(codigo, fecha);

        // CuentaBancaria 
        System.out.println("\n---- Datos de Cuenta ----");
        String cbu = Consola.leerTextoValidado(
            "CBU (22 digitos): ",
            Patrones.numerico(22, 22),
            "Invalido: use exactamente 22 caracteres numericos."
        );
        double saldo = Consola.leerDouble("Saldo inicial: ");
        CuentaBancaria cuenta = new CuentaBancaria(cbu, saldo, clave, titular);

        // Cierro la bidireccionalidad
        titular.setCuenta(cuenta);

        System.out.println("\n---- Resultado ----");
        System.out.println(cuenta.toString());
        System.out.println(titular.toString());
        System.out.println(clave.toString());
    }
}