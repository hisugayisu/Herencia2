
package herencia2;
public class Persona {
    private int numerodecuenta;
    private String nombre;
    private String apellido;
    private Double saldo;

    public Persona(int numerodecuenta, String nombre, String apellido, Double saldo) {
        this.numerodecuenta = numerodecuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
    }

    public int getNumerodecuenta() {
        return numerodecuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    
    
    
}
