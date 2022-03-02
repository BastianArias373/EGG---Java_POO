package poo_ej04;

import rectangulo.Rectangulo;
import rectangulo.servicios.servicioRectangulo;

/*
    Crear una clase Rectángulo que modele rectángulos por medio de un atributo
    privado base y un atributo privado altura. 

    La clase incluirá un método para crear el
    rectángulo con los datos del Rectángulo dados por el usuario. 

    También incluirá un método para calcular la superficie del rectángulo y un 
    método para calcular el perímetro del rectángulo. 

    Por último, tendremos un método que dibujará el rectángulo mediante 
    asteriscos usando la base y la altura. Se deberán además definir
    los métodos getters, setters y constructores correspondientes.
*/


public class POO_EJ04 {

    public static void main(String[] args) {
        servicioRectangulo servirec1 = new servicioRectangulo();
        Rectangulo rec1 = servirec1.crearRectangulo();
        servirec1.dibujarRec(rec1);
        servirec1.areaRec(rec1);
        servirec1.periRec(rec1);
    }
    
    
    
}
