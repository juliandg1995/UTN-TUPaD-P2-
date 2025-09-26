package tp5.ejercicios.ejercicio4;

import java.time.LocalDate;
import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 4
 * - Asociacion bidireccional: TarjetaDeCredito <-> Cliente.
 * - Agregacion: TarjetaDeCredito -> Banco.
 */

public class Ejercicio4{
    public static void main(String[] args){
        System.out.println("---- Alta de TarjetaDeCredito ----");

        // Banco (agregacion: puede existir por fuera)
        System.out.println("\n---- Datos de Banco ----");
        String nombreBanco = Consola.leerTextoValidado(
            "Nombre del banco: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        String cuit = Consola.leerTextoValidado(
            "CUIT (11 digitos): ",
            Patrones.numerico(11, 11),
            "Invalido: use 11 caracteres numericos."
        );
        Banco banco = new Banco( nombreBanco, cuit );

        // Cliente
        System.out.println("\n---- Datos de Cliente ----");
        String nombreCliente = Consola.leerTextoValidado(
            "Nombre del cliente: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Invalido: use 1..60 caracteres."
        );
        String dni = Consola.leerTextoValidado(
            "DNI (7 a 9 digitos): ",
            Patrones.numerico(7, 9),
            "Invalido: use 7..9 caracteres numericos."
        );
        Cliente cliente = new Cliente(nombreCliente, dni);

        // Tarjeta
        System.out.println("\n---- Datos de Tarjeta ----");
        String numero = Consola.leerTextoValidado(
            "Numero de tarjeta (16 digitos): ",
            Patrones.numerico(16, 16),
            "Invalido: use 16 caracteres numericos."
        );
        LocalDate fechaVto = Consola.leerFechaISO("Fecha de vencimiento");

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(numero, fechaVto, cliente);  // El banco puede o no ser agregado a Tarjeta (agregación)
        tarjeta.setBanco(banco);

        // Enlace bidireccional
        cliente.setTarjeta(tarjeta);

        System.out.println("\n---- Resultado ----");
        System.out.println(tarjeta.toString());
        System.out.println(cliente.toString());
        System.out.println(banco.toString());
    }
}