
package tp5.ejercicios.ejercicio6;

import java.time.LocalDate;
import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 6
 * - Asociacion unidireccional: Reserva -> Cliente.
 * - Agregacion: Reserva -> Mesa.
 */

public class Ejercicio6{
    public static void main(String[] args){
        System.out.println("---- Alta de Reserva ----");

        // Cliente (obligatorio para la asociacion)
        System.out.println("\n---- Datos de Cliente ----");
        String nombre = Consola.leerTextoValidado(
            "Nombre: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        String telefono = Consola.leerTextoValidado(
            "Telefono: ",
            Patrones.alfanumericoUnicode(1, 30),
            "Invalido: use 1..30 caracteres."
        );
        Cliente cliente = new Cliente(nombre, telefono); // constructor

        // Mesa (agregacion, opcional)
        System.out.println("\n---- Mesa (opcional) ----");
        boolean agregarMesa = Consola.leerSiNo("Desea agregar una mesa");
        Mesa mesa = null;
        if(agregarMesa){
            int numero = Consola.leerEntero("Numero de mesa (1..200): ", 1, 200);
            int capacidad = Consola.leerEntero("Capacidad (1..20): ", 1, 20);
            mesa = new Mesa(numero, capacidad); // constructor
        }

        // Reserva (usar constructor completo)
        System.out.println("\n---- Datos de Reserva ----");
        LocalDate fecha = Consola.leerFechaISO("Fecha");
        String hora = Consola.leerTextoValidado(
            "Hora (HH:mm): ",
            "^\\d{2}:\\d{2}$",
            "Invalido: use formato HH:mm"
        );
        Reserva reserva = new Reserva(fecha, hora, cliente, mesa); // constructor completo

        System.out.println("\n---- Resultado ----");
        System.out.println(reserva.toString());
        System.out.println(cliente.toString());
        System.out.println(mesa!=null ? mesa.toString() : "Mesa{numero=0, capacidad=0}");
    }
}