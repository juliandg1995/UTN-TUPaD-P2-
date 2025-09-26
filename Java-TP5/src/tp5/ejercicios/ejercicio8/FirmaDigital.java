
package tp5.ejercicios.ejercicio8;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

import java.time.LocalDate;

public class FirmaDigital{

    // Atributos
    private String codigoHash;
    private LocalDate fecha;
    private Usuario usuario; // agregacion (opcional)

    // Constructores
    public FirmaDigital(){}
    public FirmaDigital(String codigoHash, LocalDate fecha, Usuario usuario){
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    // Getters/Setters
    public String getCodigoHash(){
        return codigoHash;
    }
    public void setCodigoHash(String codigoHash){
        this.codigoHash = codigoHash;
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    // toString
    @Override
    public String toString(){
        return "FirmaDigital{codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + "}";
    }
}
