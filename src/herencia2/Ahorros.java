package herencia2;

public class Ahorros extends Persona {

    public Ahorros(int numerodecuenta, String nombre, String apellido, Double saldo) {
        super(numerodecuenta, nombre, apellido, saldo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta de ahorros banco feliz");
        sb.append("\n Cuenta: " + getNumerodecuenta());
        sb.append("\n Nombre: " + getNombre());
        sb.append("\n Apellido: " + getApellido());
        sb.append("\n saldo: " + getSaldo());

        return sb.toString();
    }
}
