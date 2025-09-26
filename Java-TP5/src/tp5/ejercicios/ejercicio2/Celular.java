package tp5.ejercicios.ejercicio2;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Celular{
    
    // Atributos
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;   // agregación
    private Usuario usuario;   // asociación bidireccional

    // Constructores
    public Celular(){}

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario){
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
    }
    
    // Getters/Setters
    public String getImei(){
        return imei;
    }
    public void setImei(String imei){
        this.imei = imei;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Bateria getBateria(){
        return bateria;
    }
    public void setBateria(Bateria bateria){
        this.bateria = bateria;
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
        return "Celular{imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + "}";
    }
    
}