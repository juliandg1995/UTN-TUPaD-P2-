
package tp5.ejercicios.ejercicio2;

import tp3.io.Consola;
import tp3.io.Patrones;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 2
 * - Agregación: Celular -> Bateria.
 * - Asociación bidireccional: Celular - Usuario (1 a 1).
 */


public class Ejercicio2{
    public static void main(String[] args){
        System.out.println("----  Alta de Celular  ----");

        // Celular
        String imei = Consola.leerTextoValidado(
            "IMEI (15 dígitos): ",
            Patrones.numerico(15, 15),
            "IMEI inválido: debe tener exactamente 15 dígitos."
        );
        String marca = Consola.leerTextoValidado(
            "Marca: ",
            Patrones.alfanumericoUnicode(1, 40),
            "Marca inválida (1..40 caracteres)."
        );
        String modelo = Consola.leerTextoValidado(
            "Modelo: ",
            Patrones.alfanumericoUnicode(1, 40),
            "Modelo inválido (1..40 caracteres)."
        );

        // Usuario
        System.out.println("\n----  Datos de Usuario  ----");
        String nombre = Consola.leerTextoValidado(
            "Nombre del usuario: ",
            Patrones.alfanumericoUnicode(1, 60),
            "Nombre inválido (1..60 caracteres)."
        );
        String dni = Consola.leerTextoValidado(
            "DNI (7 a 9 dígitos): ",
            Patrones.numerico(7, 9),
            "DNI inválido: solo dígitos, 7 a 9 caracteres."
        );

        // Batería (agregación → opcional)
        System.out.println("\n----  Batería (opcional)  ----");
        boolean tieneBateria = Consola.leerSiNo("¿Desea agregar una batería?");
        Bateria bateria = null;
        if(tieneBateria){
            String modeloBat = Consola.leerTextoValidado(
                "Modelo de batería: ",
                Patrones.alfanumericoUnicode(1, 40),
                "Modelo inválido (1..40 caracteres)."
            );
            int capacidad = Consola.leerEntero("Capacidad (mAh, ej 500..10000): ", 500, 10000);
            bateria = new Bateria(modeloBat, capacidad);
        }

        // Instancias y enlaces
        Celular celular = new Celular();
        celular.setImei(imei);
        celular.setMarca(marca);
        celular.setModelo(modelo);
        celular.setBateria(bateria);

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setDni(dni);

        // Asociación bidireccional 1↔1
        celular.setUsuario(usuario);
        usuario.setCelular(celular);

        // Resultado
        System.out.println("\n ---- Resultado ---- ");
        System.out.println(celular.toString());
        System.out.println(usuario.toString());
        System.out.println(bateria!=null ? bateria.toString() : "Bateria{modelo=null, capacidad=0}");
    }
}