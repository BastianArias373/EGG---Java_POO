package FormasServicio;

import Formas.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicio {
    
    //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    public Circunferencia crearCircunferencia(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el radio de la circunferencia");
        Circunferencia circulo1 = new Circunferencia(leer.nextInt());
        
        return circulo1;
    }
    
    //d) Método area(): para calcular el área de la circunferencia (Area = π * radio ).
    public void AreaCircunferencia(Circunferencia circulo1){
        circulo1.setArea((float) (Math.pow(circulo1.getRadio(),2) * Math.PI));
        System.out.println("El area del circulo es "+circulo1.getArea()+"cm2");
    }
    
    //e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    public void PerimetroCircunferencia(Circunferencia circulo1){
        circulo1.setPerimetro((float) (circulo1.getRadio()*2*Math.PI));
        System.out.println("El perimetro del circulo es"+circulo1.getPerimetro()+"cm");
    }
    
    
}
