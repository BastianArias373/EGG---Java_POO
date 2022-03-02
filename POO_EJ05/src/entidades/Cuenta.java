package entidades;

public class Cuenta {
    //numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual
    private int numeroCuenta;
    private int dni;
    private float saldoActual;
    private float interes;
    private String nombre;
    private String apellido;

    public Cuenta() {
    }
    public Cuenta(int numeroCuenta, int dni, float saldoActual, float interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public float getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(float saldoActual) {
        this.saldoActual = saldoActual;
    }

    public float getInteres() {
        return interes;
    }
    public void setInteres(float interes) {
        this.interes = interes;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
}
