
package tp5.ejercicios.ejercicio9;

import java.time.LocalDate;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class CitaMedica{

    // Atributos
    private LocalDate fecha;
    private String hora;
    private Paciente paciente;       
    private Profesional profesional; 

    // Constructores
    public CitaMedica(){}
    public CitaMedica(LocalDate fecha, String hora, Paciente paciente, Profesional profesional){
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
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
    public Paciente getPaciente(){
        return paciente;
    }
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    public Profesional getProfesional(){
        return profesional;
    }
    public void setProfesional(Profesional profesional){
        this.profesional = profesional;
    }

    // toString
    @Override
    public String toString(){
        return "CitaMedica{fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", profesional=" + profesional + "}";
    }
}