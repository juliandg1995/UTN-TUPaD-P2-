
package tp5.ejercicios.ejercicio8;

import java.time.LocalDate;
import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 8
 * - Composicion: Documento -> FirmaDigital.
 * - Agregacion: FirmaDigital -> Usuario.
 */
public class Ejercicio8{
    public static void main(String[] args){
        System.out.println("---- Alta de Documento ----");

        // Usuario (agregacion, opcional)
        System.out.println("\n---- Usuario (opcional) ----");
        boolean agregarUsuario = Consola.leerSiNo("Desea agregar un usuario firmante");
        Usuario usuario = null;
        if(agregarUsuario){
            String nombreU = Consola.leerTextoValidado(
                "Nombre de usuario: ",
                Patrones.alfanumericoUnicode(1, 60),
                "Invalido: use 1..60 caracteres."
            );
            String email = Consola.leerTextoValidado(
                "Email: ",
                Patrones.email(),
                "Invalido: formato de email no valido."
            );
            usuario = new Usuario(nombreU, email);
        }

        // FirmaDigital (requerida por composicion de Documento)
        System.out.println("\n---- Datos de FirmaDigital ----");
        String hash = Consola.leerTextoValidado(
            "Codigo hash (8..64 caracteres): ",
            Patrones.alfanumericoUnicode(8, 64),
            "Invalido: use 8..64 caracteres."
        );
        LocalDate fecha = Consola.leerFechaISO("Fecha");
        FirmaDigital firma = new FirmaDigital(hash, fecha, usuario);

        // Documento (constructor completo con firma obligatoria)
        System.out.println("\n---- Datos de Documento ----");
        String titulo = Consola.leerTextoValidado(
            "Titulo: ",
            Patrones.alfanumericoUnicode(1, 80),
            "Invalido: use 1..80 caracteres."
        );
        String contenido = Consola.leerTextoValidado(
            "Contenido: ",
            Patrones.alfanumericoUnicode(1, 200),
            "Invalido: use 1..200 caracteres."
        );
        Documento documento = new Documento(titulo, contenido, firma);

        System.out.println("\n---- Resultado ----");
        System.out.println(documento.toString());
        System.out.println(firma.toString());
        System.out.println(usuario!=null ? usuario.toString() : "Usuario{nombre=null, email=null}");   // Si el usuario no está instanciado, imprime null 
    }
}
