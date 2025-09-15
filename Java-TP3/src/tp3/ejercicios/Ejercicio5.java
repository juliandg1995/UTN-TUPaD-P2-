package tp3.ejercicios;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 5
 * Simulación de Nave Espacial:
 * - Se crea una nave con 50 unidades de combustible.
 * - Se intenta avanzar sin recargar (debe fallar si la distancia excede el combustible).
 * - Se recarga combustible respetando el tope y se avanza correctamente.
 * - Se muestra el estado final de la nave.
 */
import tp3.io.Consola;
import tp3.io.Patrones;
import tp3.modelos.NaveEspacial;

public class Ejercicio5{

    public static void main(String[] args){
        // Se ingresa el nombre de la nave 
        String nombre = Consola.leerTextoValidado(
                "Nombre de la nave: ",
                Patrones.alfanumericoAscii(2, 30),
                "Use letras/dígitos/espacios (2-30)."
        );

        // Se crea la nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial(nombre, 50);
        System.out.println("\n== Estado inicial ==");
        nave.mostrarEstado();

        // Se intenta despegar (solo informa si hay combustible)
        nave.despegar();

        // Intento 1: avanzar sin recargar más de lo que permite el combustible (caso no feliz)
        int distanciaFallida = 60; // deliberadamente mayor a 50 para forzar la validación
        System.out.println("\n== Intento de avance sin recargar ==");
        System.out.println("Intentando avanzar " + distanciaFallida + " unidades (debería fallar)...");
        nave.avanzar(distanciaFallida);
        nave.mostrarEstado();

        // Recarga controlada por el usuario, respetando el tope de capacidad
        System.out.println("\n== Recarga de combustible ==");
        int tope = NaveEspacial.capacidadMaxima();
        int cantidad = Consola.leerEntero(
                "Cantidad a recargar (1.." + tope + "): ", 1, tope
        );
        nave.recargarCombustible(cantidad);
        nave.mostrarEstado();

        // Avance correcto: ahora sí con una distancia posible con el combustible actual
        int maxPosible = nave.getCombustible(); // consumo 1:1 → esta es la cota superior segura
        if(maxPosible == 0){
            System.out.println("No hay combustible disponible para avanzar. Finalizando.");
            return;
        }
        int distanciaOk = Consola.leerEntero(
                "Distancia a avanzar ahora (1.." + maxPosible + "): ", 1, maxPosible
        );
        System.out.println("\n== Avance correcto ==");
        nave.avanzar(distanciaOk);

        // Estado final solicitado
        System.out.println("\n== Estado final ==");
        nave.mostrarEstado();
    }
}
