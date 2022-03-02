package poo_ej05;

import entidades.Cuenta;
import entidades.servicio.cuentaServicio;

/*
    Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
    atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
    operaciones asociadas a dicha clase son:

        •Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
        (LISTO)

        •Agregar los métodos getters y setters correspondientes.
        (LISTO)

        •Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
        (LISTO)

        •Método ingresar(double ingreso): el método recibe una cantidad de dinero a
        ingresar y se la sumara a saldo actual.
        (LISTO)

        •Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
        se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
        pondrá el saldo actual en 0. 
        (LISTO)

        •Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
        que el usuario no saque más del 20%.
        (LISTO)

        •Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
        (LISTO)

        •Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 
        (LISTO)

*/

public class POO_EJ05 {

    public static void main(String[] args) {
        cuentaServicio cs = new cuentaServicio();
        Cuenta persona = cs.crearCuenta();
        cs.ingresoDinero(persona);
        cs.mostrarDatos(persona);
        cs.ingresoDinero(persona);
        cs.mostrarSaldo(persona);
        
        cs.retiroDinero(persona);
        cs.mostrarSaldo(persona);
        cs.expresDinero(persona);
        cs.mostrarSaldo(persona);
    }
    
}
