
package tp5.ejercicios.ejercicio_10;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class CuentaBancaria{

    // Atributos
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // composicion (obligatoria)
    private Titular titular;      // asociacion bidireccional

    // Constructores
    public CuentaBancaria(){}
    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular){
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
    }

    // Getters/Setters
    public String getCbu(){
        return cbu;
    }
    public void setCbu(String cbu){
        this.cbu = cbu;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public ClaveSeguridad getClave(){
        return clave;
    }
    public void setClave(ClaveSeguridad clave){
        this.clave = clave;
    }
    public Titular getTitular(){
        return titular;
    }
    public void setTitular(Titular titular){
        this.titular = titular;
    }

    // toString
    @Override
    public String toString(){
        return "CuentaBancaria{cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave + ", titular=" + titular + "}";
    }
}
