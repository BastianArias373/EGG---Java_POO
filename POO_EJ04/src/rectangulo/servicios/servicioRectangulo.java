package rectangulo.servicios;

import java.util.Scanner;
import rectangulo.Rectangulo;

public class servicioRectangulo {
    
    public Rectangulo crearRectangulo(){
        Rectangulo rec = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la base: ");
        rec.setBase(leer.nextInt());
        System.out.println("ingrese la altura: ");
        rec.setAltura(leer.nextInt());
        return rec;
    }
    
    public void dibujarRec(Rectangulo rec){
        for(int h = 0; h < rec.getAltura(); h++){
            for(int b = 0; b < rec.getBase(); b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public void areaRec(Rectangulo rec){
        rec.setArea(rec.getBase() * rec.getAltura());
        System.out.println("Area = "+ rec.getArea());
    }
    
    public void periRec(Rectangulo rec){
        rec.setPerimetro((2 * rec.getBase()) + (2* rec.getAltura()));
        System.out.println("Perimetro = "+ rec.getPerimetro());
    }  
}
