
package tp5.ejercicios.ejercicio5;

import java.time.LocalDate; // no se usa directamente, pero lo dejo si luego queres extender
import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 5
 * - Composicion: Computadora -> PlacaMadre.
 * - Asociacion bidireccional: Computadora - Propietario.
 */
public class Ejercicio5{
    public static void main(String[] args){
        System.out.println("---- Alta de Computadora ----");

        // PlacaMadre (composicion: requerida por Computadora)
        System.out.println("\n---- Datos de PlacaMadre ----");
        String modeloPM = Consola.leerTextoValidado(
            "Modelo: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        String chipset = Consola.leerTextoValidado(
            "Chipset: ",
            Patrones.alfanumericoUnicode(1, 40),
            "Invalido: use 1..40 caracteres."
        );
        PlacaMadre placa = new PlacaMadre(modeloPM, chipset);

        // Propietario (se instancia con constructor - todavía sin ref a Computadora)
        System.out.println("\n---- Datos de Propietario ----");
        String nombreProp = Consola.leerTextoValidado(
            "Nombre: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        String dni = Consola.leerTextoValidado(
            "DNI (7 a 9 digitos): ",
            Patrones.numerico(7, 9),
            "Invalido: use 7..9 caracteres numericos."
        );
        Propietario propietario = new Propietario(nombreProp, dni, null);

        // Computadora (constructor completo: incluye PlacaMadre y Propietario)
        System.out.println("\n---- Datos de Computadora ----");
        String marca = Consola.leerTextoValidado(
            "Marca: ",
            Patrones.alfanumericoUnicode(1, 40),
            "Invalido: use 1..40 caracteres."
        );
        String numeroSerie = Consola.leerTextoValidado(
            "Numero de serie: ",
            Patrones.alfanumericoUnicode(1, 40),
            "Invalido: use 1..40 caracteres."
        );
        Computadora compu = new Computadora(marca, numeroSerie, placa, propietario);

        // Cierro la bidireccionalidad
        propietario.setComputadora(compu);

        System.out.println("\n---- Resultado ----");
        System.out.println(compu.toString());
        System.out.println(propietario.toString());
        System.out.println(placa.toString());
    }
}
