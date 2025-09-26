
package tp5.ejercicios.ejercicio_10;

import java.time.LocalDate;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class ClaveSeguridad{

    // Atributos
    private String codigo;
    private LocalDate ultimaModificacion;

    // Constructores
    public ClaveSeguridad(){}
    public ClaveSeguridad(String codigo, LocalDate ultimaModificacion){
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    // Getters/Setters
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public LocalDate getUltimaModificacion(){
        return ultimaModificacion;
    }
    public void setUltimaModificacion(LocalDate ultimaModificacion){
        this.ultimaModificacion = ultimaModificacion;
    }

    // toString
    @Override
    public String toString(){
        return "ClaveSeguridad{codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + "}";
    }
}