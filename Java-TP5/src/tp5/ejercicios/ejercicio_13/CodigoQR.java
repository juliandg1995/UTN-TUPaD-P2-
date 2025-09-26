
package tp5.ejercicios.ejercicio_13;

import tp5.ejercicios.ejercicio8.Usuario; // Reutilizo Usuario del ejercicio 8

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class CodigoQR{

    // Atributos
    private String valor;
    private Usuario usuario; // asociacion unidireccional

    // Constructores
    public CodigoQR(){}
    public CodigoQR(String valor, Usuario usuario){
        this.valor = valor;
        this.usuario = usuario;
    }

    // Getters/Setters
    public String getValor(){
        return valor;
    }
    public void setValor(String valor){
        this.valor = valor;
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
        return "CodigoQR{valor=" + valor + ", usuario=" + usuario + "}";
    }
}