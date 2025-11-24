
package ejercicio1.models;

/**
 * Clase Producto - Implementa Pagable
 * Representa un producto simple del e-commerce.
 * Implementa Pagable porque un producto individual también tiene un total (su precio).
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

import interfaces.Pagable;

public class Producto implements Pagable{

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    @Override
    public double calcularTotal(){
        // Como es un producto individual, el total es simplemente su precio.
        return precio;
    }

    @Override
    public String toString(){
        return "Producto{nombre='" + nombre + "', precio=" + precio + "}";
    }
}

