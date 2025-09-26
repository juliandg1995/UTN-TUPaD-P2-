
package tp5.ejercicios.ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Pasaporte{
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;              // composición
    private Titular titular;        // asociación bidireccional

    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
    }

    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }

    public LocalDate getFechaEmision(){
        return fechaEmision;
    }
    public void setFechaEmision(LocalDate fechaEmision){
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto(){
        return foto;
    }
    public void setFoto(Foto foto){
        this.foto = foto;
    }

    public Titular getTitular(){
        return titular;
    }
    public void setTitular(Titular titular){
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular + '}';
    } 
    
}