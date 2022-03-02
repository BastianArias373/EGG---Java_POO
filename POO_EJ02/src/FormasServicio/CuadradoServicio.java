package FormasServicio;

import Formas.Cuadrado;
import java.util.Scanner;

public class CuadradoServicio {
    
    public Cuadrado crearCuadrado(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        Cuadrado cuadrado1 = new Cuadrado(leer.nextInt());
        return cuadrado1;
    }
    
    //Setear Area, mostrar area:
    public void AreaCuadrado(Cuadrado cuadrado1){
        cuadrado1.setArea((float) Math.pow(cuadrado1.getLado(), 2));
        System.out.println("El area del cuadrado es "+cuadrado1.getArea()+"cm2");
    }
    
    
    //Setear perimetro, mostrar perimetro:
    public void perimetroCuadrado(Cuadrado cuadrado1){
        cuadrado1.setPerimetro(cuadrado1.getLado() * 4);
        System.out.println("El area del cuadrado es "+cuadrado1.getPerimetro()+"cm");
    }
    
}
