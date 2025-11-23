package Ejercicio1.model;

import Ejercicio1.constants.CategoriaProducto;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Producto{

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    // Constructor completo
    public Producto(String id, String nombre, double precio, int cantidad,
                    CategoriaProducto categoria){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Getters y setters básicos
    public String getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public int getCantidad(){
        return cantidad;
    }

    public CategoriaProducto getCategoria(){
        return categoria;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    // Representación en texto del objeto, útil para debug y listados
    @Override
    public String toString(){
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }

    // Método pedido en la consigna
    public void mostrarInfo(){
        System.out.println(toString());
    }
}

