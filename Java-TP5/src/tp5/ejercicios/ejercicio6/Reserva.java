
package tp5.ejercicios.ejercicio6;

import java.time.LocalDate;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Reserva{

    // Atributos
    private LocalDate fecha;
    private String hora;
    private Cliente cliente; // asociacion unidireccional
    private Mesa mesa;       // agregacion (opcional)

    // Constructores
    public Reserva(){}
    public Reserva(LocalDate fecha, String hora, Cliente cliente, Mesa mesa){
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    // Getters/Setters
    public LocalDate getFecha(){
        return fecha;
    }
    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }
    public String getHora(){
        return hora;
    }
    public void setHora(String hora){
        this.hora = hora;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Mesa getMesa(){
        return mesa;
    }
    public void setMesa(Mesa mesa){
        this.mesa = mesa;
    }

    // toString
    @Override
    public String toString(){
        return "Reserva{fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", mesa=" + mesa + "}";
    }
}