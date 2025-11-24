
package ejercicio1.demo;

/**
 * Clase de prueba para la parte de interfaces del TP8.
 * Muestra cómo se conectan:
 *  - Cliente (Notificable)
 *  - Producto (Pagable)
 *  - Pedido (Pagable + usa Notificable)
 *  - Medios de pago (Pago + PagoConDescuento)
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

import ejercicio1.models.*;
import ejercicio1.interfaces.*;


public class DemoEcommerce{
    public static void main(String[] args){
        Cliente cliente = new Cliente("Julian", "julian@example.com");

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Mouse gamer", 15000));
        pedido.agregarProducto(new Producto("Teclado mecánico", 35000));
        pedido.agregarProducto(new Producto("Auriculares", 22000));

        System.out.println("Total del pedido (sin descuento): $" + pedido.calcularTotal());

        // Cambiamos estado y se notifica al cliente
        pedido.cambiarEstado(EstadoPedido.EN_PREPARACION);

        // Elegimos un medio de pago (polimorfismo con interfaces)
        PagoConDescuento medioPago = new TarjetaCredito("1234-5678-9999-0000", "Julian", 0.10);

        // Aplicamos descuento y luego procesamos el pago
        double montoOriginal = pedido.calcularTotal();
        double montoConDescuento = medioPago.aplicarDescuento(montoOriginal);
        medioPago.procesarPago(montoConDescuento);
    }
}
