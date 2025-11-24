
package ejercicio1.models;

/**
 * Medio de pago PayPal.
 * También implementa Pago y PagoConDescuento para reutilizar el mismo contrato.
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

import interfaces.PagoConDescuento;

public class PayPal implements PagoConDescuento{

    private String emailCuenta;
    private double descuentoFijo; // monto fijo de descuento

    public PayPal(String emailCuenta, double descuentoFijo){
        this.emailCuenta = emailCuenta;
        this.descuentoFijo = descuentoFijo;
    }

    @Override
    public void procesarPago(double monto){
        System.out.println("Procesando pago con PayPal (" + emailCuenta
                + ") por $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto){
        double montoConDescuento = monto - descuentoFijo;
        if(montoConDescuento < 0){
            montoConDescuento = 0;
        }
        System.out.println("Aplicando descuento fijo de $" + descuentoFijo
                + " -> Monto final: $" + montoConDescuento);
        return montoConDescuento;
    }
}
