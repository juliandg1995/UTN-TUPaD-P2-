package tp5.ejercicios.ejercicio1;

import java.time.LocalDate;
import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 1
 * - Pasaporte (compone) -> Foto.
 * - Pasaporte - Titular (asociación 1 a 1 bidireccional).
 */

public class Ejercicio1{
    public static void main(String[] args){
        System.out.println("----  Alta de Pasaporte  ----");

        String numero = Consola.leerTextoValidado(
            "Número de pasaporte: ",
            Patrones.alfanumericoUnicode(3, 30),
            "Formato inválido. Use 3..30 caracteres alfanuméricos."
        );

        LocalDate fechaEmision = Consola.leerFechaISO("Fecha de emisión");

        String nombre = Consola.leerTextoValidado(
            "Nombre del titular: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Nombre inválido (1..60 caracteres)."
        );

        String dni = Consola.leerTextoValidado(
            "DNI (7 a 9 dígitos): ",
            Patrones.numerico(7, 9),
            "DNI inválido: sólo dígitos, 7 a 9 caracteres."
        );

        String imagen = Consola.leerLineaNoVacia("Ruta/ID de imagen: ");
        String formato = Consola.leerTextoValidado(
            "Formato (JPG/PNG): ",
            Patrones.formatoImagenBasico(),
            "Formato inválido. Ingrese JPG o PNG."
        ).toUpperCase();

        Foto foto = new Foto();
        foto.setImagen(imagen);
        foto.setFormato(formato);

        Titular titular = new Titular();
        titular.setNombre(nombre);
        titular.setDni(dni);

        Pasaporte p = new Pasaporte(numero,fechaEmision,foto,titular); // Como es relación de composición, fuerzo la dependencia de Pasaporte con Foto
        titular.setPasaporte(p); // enlace bidireccional entre ambas clases

        System.out.println("\n ---- Resultado ---- ");
        System.out.println(p.toString());
        System.out.println(titular.toString());
        System.out.println(foto.toString());
    }
}