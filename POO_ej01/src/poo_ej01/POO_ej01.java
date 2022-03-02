package poo_ej01;

import entidades.Libro;
import servicio.LibroServicio;

public class POO_ej01 {
    
    /*
    Crear una clase llamada Libro que contenga los siguientes atributos: 
    ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
    atributos pasados por parámetro y un constructor vacío. 
    
    Crear un método para cargar un libro pidiendo los datos al usuario y luego 
    informar mediante otro método el número de ISBN, el título, el autor del 
    libro y el numero de páginas.
    */

    public static void main(String[] args) {
        
        //cargarLibro cl = new cargarLibro();
        LibroServicio ls = new LibroServicio();
        Libro libroNuevo = ls.cargarLibro();
        ls.consultarLibro(libroNuevo);
    }   
}
