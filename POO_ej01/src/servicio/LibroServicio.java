package servicio;

import entidades.Libro;
import java.util.Scanner;

public class LibroServicio {
    
    public Libro cargarLibro(){
            
            //instanciamos el objeto Libro1
            Libro l1 = new Libro();
            
            //metodo Scanner para no repetirlo en el main, 
            Scanner leer = new Scanner(System.in).useDelimiter("\n");  //.useDelimiter("/n")
            
            //ingreso el dato
            System.out.println("Nombre del libro: ");
            l1.setTitulo(leer.next());
            
            System.out.println("ISBN:");
            l1.setIsbn(leer.next());
            
            System.out.println("Autor: ");
            l1.setAutor(leer.next());
            
            System.out.println("Numero de paginas");
            l1.setNumPag(leer.nextInt());

            return l1;  
        }
        
        public void consultarLibro(Libro l1){
            System.out.println(l1.getTitulo());
            System.out.println(l1.getIsbn());
            System.out.println(l1.getAutor());
            System.out.println(l1.getNumPag());
        }
    
}
