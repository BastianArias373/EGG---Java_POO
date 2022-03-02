package entidades.servicio;

import entidades.Cuenta;
import java.util.Scanner;

public class cuentaServicio {

    Scanner leerInt = new Scanner(System.in);
    Scanner leerFloat = new Scanner(System.in);
    Scanner leerString = new Scanner(System.in);
    
    // CREAR CUENTA
    public Cuenta crearCuenta(){
        Cuenta c1 = new Cuenta();
        
        System.out.println("Nombre: ");
        c1.setNombre(leerString.next());
        System.out.println("Apellido: ");
        c1.setApellido(leerString.next());
        System.out.println("DNI: ");
        c1.setDni(leerInt.nextInt());
        
        //al crear un nuevo usuario se setiea el saldo actual a 0.
        //al principio el interes es nulo
        //seteo un numero de cuenta aleatorio 
        c1.setSaldoActual(0);
        c1.setInteres(0);
        c1.setNumeroCuenta((int) ((float) Math.random()*10000));
        
        return c1;
    }
    
    // INGRESA DINERO A LA CUENTA
    public void ingresoDinero(Cuenta c1){
        float ingreso = 0;
        System.out.println("Ingrese cantidad de dinero: ");
        ingreso = leerFloat.nextFloat();
        if(c1.getSaldoActual()==0){
            c1.setSaldoActual(ingreso);
        }
        else{
            c1.setSaldoActual(c1.getSaldoActual() + ingreso);
        } 
    }
    
        // RETIRO EXPRES 20%
    public void expresDinero(Cuenta c1){
        System.out.println("Retiro rapido");
        if(c1.getSaldoActual()==0){
            c1.setSaldoActual(0);
        }
        else{
            c1.setSaldoActual(c1.getSaldoActual() - c1.getSaldoActual() * 20 / 100);
        } 
    }
    
    // RETIRAR DINERO DE LA CUENTA
    public void retiroDinero(Cuenta c1){
        float retiro = 0;
        System.out.println("Cuanto dinero quiere retirar?");
        retiro = leerFloat.nextFloat();
        if(c1.getSaldoActual()==0){
            c1.setSaldoActual(0);
        }
        else{
            c1.setSaldoActual(c1.getSaldoActual() - retiro);
        } 
    }
    
    // MUESTRA EL SALDO
    public void mostrarSaldo(Cuenta c1){
        System.out.println("Saldo Actual: $"+c1.getSaldoActual());
    }
    
    // MUESTRA LOS DATOS
    public void mostrarDatos(Cuenta c1){
        System.out.println("Nombre Completo: "+c1.getNombre()+" "+c1.getApellido());
        System.out.println("DNI: "+c1.getDni());
        System.out.println("numero de cuenta: "+c1.getNumeroCuenta());
        System.out.println("Saldo Actual: $"+c1.getSaldoActual());
    }
    
    
    
}
