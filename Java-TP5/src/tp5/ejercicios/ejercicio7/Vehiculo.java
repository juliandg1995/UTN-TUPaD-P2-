
package tp5.ejercicios.ejercicio7;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Vehiculo{

    // Atributos
    private String patente;
    private String modelo;
    private Motor motor;         // agregacion (opcional)
    private Conductor conductor; // asociacion bidireccional

    // Constructores
     public Vehiculo(String patente, String modelo){
        this.patente = patente;
        this.modelo = modelo;
    }
    
     public Vehiculo(String patente, String modelo, Conductor conductor){
        this.patente = patente;
        this.modelo = modelo;
        this.conductor = conductor;
    }
    
    public Vehiculo(String patente, String modelo, Motor motor){
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor){
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
    }

    // Getters/Setters
    public String getPatente(){
        return patente;
    }
    public void setPatente(String patente){
        this.patente = patente;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public Motor getMotor(){
        return motor;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    public Conductor getConductor(){
        return conductor;
    }
    public void setConductor(Conductor conductor){
        this.conductor = conductor;
    }

    // toString
    @Override
    public String toString(){
        return "Vehiculo{patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + ", conductor=" + conductor + "}";
    }
}