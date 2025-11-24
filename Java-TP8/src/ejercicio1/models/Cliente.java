
package ejercicio1.models;

/**
 * Clase Cliente - Implementa la interfaz Notificable
 * Representa un cliente del sistema.
 * Implementa Notificable para poder recibir notificaciones de los pedidos.
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

import interfaces.Notificable;

public class Cliente implements Notificable{

    private String nombre;
    private String email;

    public Cliente(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public void notificar(String mensaje){
        // En un sistema real se enviaría un mail; aquí solo mostramos por consola.
        System.out.println("Notificación para " + nombre + " <" + email + ">: " + mensaje);
    }

    @Override
    public String toString(){
        return "Cliente{nombre='" + nombre + "', email='" + email + "'}";
    }
}
