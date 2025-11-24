
package ejercicio1.models;

/**
 * Medio de pago con tarjeta de crédito.
 * Implementa DOS interfaces: Pago y PagoConDescuento (herencia múltiple de comportamiento).
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

import ejercicio1.interfaces.PagoConDescuento;

public class TarjetaCredito implements PagoConDescuento{

    private String numero;
    private String titular;
    private double porcentajeDescuento; // ej. 0.10 = 10%

    public TarjetaCredito(String numero, String titular, double porcentajeDescuento){
        this.numero = numero;
        this.titular = titular;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void procesarPago(double monto){
        // En un sistema real se conectaría con una pasarela de pago.
        System.out.println("Procesando pago con TARJETA de " + titular
                + " por $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto){
        // Aplico un porcentaje de descuento al monto original
        double montoConDescuento = monto * (1 - porcentajeDescuento);
        System.out.println("Aplicando descuento de " + (porcentajeDescuento * 100)
                + "% -> Monto final: $" + montoConDescuento);
        return montoConDescuento;
    }
}
