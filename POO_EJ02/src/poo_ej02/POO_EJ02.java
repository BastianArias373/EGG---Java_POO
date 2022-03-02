package poo_ej02;

/*
    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
    de tipo real. A continuación, se deben crear los siguientes métodos:

    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
    del objeto.
    d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
    e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/

import Formas.Circunferencia;
import Formas.Cuadrado;
import FormasServicio.CircunferenciaServicio;
import FormasServicio.CuadradoServicio;

public class POO_EJ02 {
    
    
    
    public static void main(String[] args) {
        
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia circulo = cs.crearCircunferencia();
        cs.AreaCircunferencia(circulo);
        cs.PerimetroCircunferencia(circulo);
        
        System.out.println("\n");
        
        
        CircunferenciaServicio cs2 = new CircunferenciaServicio();
        Circunferencia circulo2 = cs.crearCircunferencia();
        cs.AreaCircunferencia(circulo2);
        cs.PerimetroCircunferencia(circulo2);
        
        System.out.println("\n");
        
        CuadradoServicio cuads = new CuadradoServicio();
        Cuadrado c1 = cuads.crearCuadrado();
        cuads.AreaCuadrado(c1);
        cuads.perimetroCuadrado(c1);
        
        CuadradoServicio cuads2 = new CuadradoServicio();
        Cuadrado c2 = cuads2.crearCuadrado();
        cuads.AreaCuadrado(c2);
        cuads.perimetroCuadrado(c2);
    
    }
    
}
