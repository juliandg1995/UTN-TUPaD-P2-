
package ejercicio1.models;

/**
 * Representa un pedido compuesto por varios productos.
 * - Implementa Pagable: puede calcular el total del pedido.
 * - Colabora con Cliente a través de la interfaz Notificable.
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
import java.util.ArrayList;
import java.util.List;
import interfaces.Pagable;
import interfaces.Notificable;

public class Pedido implements Pagable{

    private List<Producto> productos;
    private Notificable cliente; // uso la interfaz para desacoplarme de la clase concreta
    private EstadoPedido estado;

    public Pedido(Notificable cliente){
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = EstadoPedido.NUEVO;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public List<Producto> getProductos(){
        return productos;
    }

    public EstadoPedido getEstado(){
        return estado;
    }

    /**
     * Cambia el estado del pedido y NOTIFICA al cliente.
     * Uso la interfaz Notificable para no depender de una implementación específica.
     */
    public void cambiarEstado(EstadoPedido nuevoEstado){
        this.estado = nuevoEstado;
        if(cliente != null){
            cliente.notificar("El pedido ha cambiado de estado a: " + nuevoEstado);
        }
    }

    @Override
    public double calcularTotal(){
        double total = 0.0;
        for(Producto p : productos){
            // Polimorfismo: trato a cada producto como Pagable.
            total += p.calcularTotal();
        }
        return total;
    }

    @Override
    public String toString(){
        return "Pedido{estado=" + estado + ", total=" + calcularTotal() + "}";
    }
}

