package poo_ej08;

import entidades.Cadena;
import entidades.servicio.cadenaServicio;

/*
    Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
    String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
    una frase que puede ser una palabra o varias palabras separadas por un espacio en
    blanco y a través de los métodos set, se guardará la frase y la longitud de manera
    automática según la longitud de la frase ingresada. Deberá además implementar los
    siguientes métodos:

    •Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    frase ingresada. 
    (TERMINADO)

    •Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". 
    (TERMINADO)

    •Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
    y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    (TERMINADO)

    •Método compararLongitud(String frase), deberá comparar la longitud de la frase
    que compone la clase con otra nueva frase ingresada por el usuario.
    (TERMINADO)

    •Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    (TERMINADO)

    •Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y
    mostrar la frase resultante.
    (TERMINADO)

    •Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/
public class POO_EJ08 {

    public static void main(String[] args) {
        cadenaServicio sc = new cadenaServicio();
        Cadena frase = sc.crearCadena();
        
        sc.mostrarVocales(frase);
        sc.invertirFrase(frase);
        sc.vecesRepetido(frase);
        sc.compararLongitud(frase);
        sc.unirFrases(frase);
        sc.remplazar(frase);
        sc.contiene(frase);
        
    }
    
}
