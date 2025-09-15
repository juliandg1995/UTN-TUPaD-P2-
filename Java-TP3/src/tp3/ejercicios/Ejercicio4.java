package tp3.ejercicios;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 4
 * Gestión de Gallinas en Granja Digital:
 * - Se crean dos gallinas con validación básica de datos.
 * - Se simulan acciones de envejecer y poner huevos en cada una.
 * - Se muestra el estado final de ambas para verificación.
 */

import tp3.io.Consola;
import tp3.io.Patrones;
import tp3.modelos.Gallina;

public class Ejercicio4{
    
    // Creo una gallina leyendo y validando entradas para mantener integridad de datos
    private static Gallina crearGallinaDesdeConsola(){
        String id = Consola.leerTextoValidado(
                "ID de gallina: ",
                Patrones.alfanumericoAscii(2, 15),
                "Use letras/dígitos/espacios (2-15)."
        );
        int edad = Consola.leerEntero("Edad en semanas (0..300): ", 0, 300);
        int huevos = Consola.leerEntero("Huevos puestos (0..1000): ", 0, 1000);
        return new Gallina(id, edad, huevos);
    }    
    
    // Aplico envejecer() N veces para simular el paso del tiempo
    private static void simularEnvejecimiento(Gallina g, int semanas){
        for(int i = 0; i < semanas; i++){
            g.envejecer();
        }
    }

    // Aplico ponerHuevo() N veces para registrar producción de huevos
    private static void simularPuesta(Gallina g, int cantidad){
        for(int i = 0; i < cantidad; i++){
            g.ponerHuevo();
        }
    }

    public static void main(String[] args){
        // Se cargan los datos de la primera gallina
        System.out.println("== Alta de Gallina #1 ==");
        Gallina g1 = crearGallinaDesdeConsola();

        // Se cargan los datos de la segunda gallina
        System.out.println("\n== Alta de Gallina #2 ==");
        Gallina g2 = crearGallinaDesdeConsola();

        // Se simulan acciones para la primera gallina
        System.out.println("\n== Simulación para Gallina #1 ==");
        int semanas1 = Consola.leerEntero("Semanas a envejecer (0..200): ", 0, 200);
        int huevos1 = Consola.leerEntero("Huevos a registrar (0..200): ", 0, 200);
        simularEnvejecimiento(g1, semanas1);
        simularPuesta(g1, huevos1);

        // Se simulan acciones para la segunda gallina
        System.out.println("\n== Simulación para Gallina #2 ==");
        int semanas2 = Consola.leerEntero("Semanas a envejecer (0..200): ", 0, 200);
        int huevos2 = Consola.leerEntero("Huevos a registrar (0..200): ", 0, 200);
        simularEnvejecimiento(g2, semanas2);
        simularPuesta(g2, huevos2);

        // Se muestran los estados finales de ambas gallinas
        System.out.println("\n== Estado final de las gallinas ==");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
    
}
