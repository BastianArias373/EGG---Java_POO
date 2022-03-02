
package operacion.servicios;

//  d)  Método para crearOperacion(): 
//      que le pide al usuario los dos números y 
//      los guarda en los atributos del objeto.

import java.util.Scanner;
import operacion.Operacion;

public class OpServicio {
    
    public Operacion crearOperacion(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int n1 = leer.nextInt();
        
        System.out.println("Ingrese el primer numero: ");
        int n2 = leer.nextInt();
        
        Operacion op = new Operacion(n1,n2);
        
        return op;
    }
    
//  e)  Método sumar(): calcular la suma de los números y 
//      devolver el resultado al main.   
    public void sumar(Operacion op){
        op.setSuma(op.getNumero1()+op.getNumero2());
        System.out.println(op.getNumero1()+" + "+op.getNumero2()+" = "+op.getSuma());
    }
    
//  f)  Método restar(): calcular la resta de los números y 
//      devolver el resultado al main
    public void restar(Operacion op){
        op.setResta(op.getNumero1()-op.getNumero2());
        System.out.println(op.getNumero1()+" - "+op.getNumero2()+" = "+op.getResta());   
    }
    
//  g)  Método multiplicar(): primero valida que no se haga una multiplicación por cero,
//      si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
//      error. Si no, se hace la multiplicación y se devuelve el resultado al main
    public void multip(Operacion op){
        if(op.getNumero1() != 0 || op.getNumero2() != 0){
           op.setMulti(op.getNumero1()*op.getNumero2()); 
           System.out.println(op.getNumero1()+" x "+op.getNumero2()+" = "+op.getMulti());
        }
        else{
            System.out.println("Error");
            System.out.println("0");
        }       
    }
    
//  h)  Método dividir(): primero valida que no se haga una división por cero, si fuera a
//      pasar una división por cero, el método devuelve 0 y se le informa al usuario el
//      error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
//      al main.
    public void division(Operacion op){
        
        if(op.getNumero2() != 0){
            op.setDiv(op.getNumero1()/op.getNumero2());
            System.out.println(op.getNumero1()+" / "+op.getNumero2()+" = "+op.getDiv());
        }
        else{
            System.out.println("Error");
            System.out.println("0");            
        }
    }
    
    
}
