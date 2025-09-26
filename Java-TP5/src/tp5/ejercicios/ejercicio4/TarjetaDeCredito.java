package tp5.ejercicios.ejercicio4;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
import java.time.LocalDate;

public class TarjetaDeCredito {

    // Atributos
    private String numero;
    private LocalDate fechaVencimiento;
    private Cliente cliente; // asociacion bidireccional
    private Banco banco;     // agregacion

    // Constructores
    public TarjetaDeCredito() {
    }

    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
    }
        
    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
    }

    // Getters/Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    // toString
    @Override
    public String toString() {
        return "TarjetaDeCredito{numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", cliente=" + cliente + ", banco=" + banco + "}";
    }
}
