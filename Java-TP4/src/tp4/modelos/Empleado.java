package tp4.modelos;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * TP4 - Clase entidad Empleado
 */

public class Empleado{
    
    // Atributos de instancia encapsulados
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Contador global de empleados (estático)
    public static int totalEmpleados = 0;

    // Constructor sobrecargado: recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario){
        // Uso this para distinguir parámetros de atributos
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor sobrecargado: solo nombre y puesto
    // Asigna id automático y salario por defecto (0.0)
    public Empleado(String nombre, String puesto){
        
        this.id = totalEmpleados + 1; // id autoincremental
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 0.0;           // salario por defecto
        totalEmpleados++;             // incremento de la variable estática
    }

    // Métodos sobrecargados actualizarSalario
    // a) Recibe porcentaje de aumento (ej.: 10 → +10%)
    public void actualizarSalario(double porcentaje){
        // Aplico incremento porcentual sobre el salario actual
        this.salario = this.salario + (this.salario * (porcentaje / 100.0));
    }

    // b) Recibe cantidad fija a aumentar 
    public void actualizarSalario(int cantidadFija){
        // Sumo la cantidad fija al salario actual
        this.salario = this.salario + cantidadFija;
    }

    // toString con los datos principales
    @Override
    public String toString(){
        return "Empleado{id=" + id + ", nombre='" + nombre + "', puesto='" + puesto + "', salario=" + salario + "}";
    }

    // Método estático: retorna el total de empleados creados
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

    // Getters y Setters
    public int getId(){ return id; }
    public void setId(int id){ this.id = id; }

    public String getNombre(){ return nombre; }
    public void setNombre(String nombre){ this.nombre = nombre; }

    public String getPuesto(){ return puesto; }
    public void setPuesto(String puesto){ this.puesto = puesto; }

    public double getSalario(){ return salario; }
    public void setSalario(double salario){ this.salario = salario; }
}

