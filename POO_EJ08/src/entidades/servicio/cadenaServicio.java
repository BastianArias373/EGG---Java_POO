package entidades.servicio;

import entidades.Cadena;
import java.util.Scanner;

public class cadenaServicio {
    
    Scanner leer = new Scanner(System.in);

    //CREA UNA CADENA. SETEA FRASE Y LONGITUD
    public Cadena crearCadena(){
        Cadena cad = new Cadena();                  //crear objeto
        System.out.println("Ingrese una frase");    //msje por pantalla
        leer.useDelimiter("\n");                    //usar Enter como delimiter
        cad.setFrase(leer.next());                  //lee toda la frase y setea
        cad.setLongitud(cad.getFrase().length());   //devuelve longitud y setea 
        
        //resultados por pantalla
        System.out.println("Frase: "+cad.getFrase());
        System.out.println("Longitud: "+cad.getLongitud());
        System.out.println("");
        
        return cad;
    }
    
    // CUENTA VOCALES Y DEVUELVE CANTIDAD
    public void mostrarVocales(Cadena cad){
    char k;
    int countVocales = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            k = cad.getFrase().charAt(i);       //lee el i-esimo caracter
            if ((k == 'a') || (k == 'e') || (k == 'i') || (k == 'o') || (k == 'u')) {
                countVocales += 1; 
            }
        }
        System.out.println("Vocales: "+countVocales);
        System.out.println("");
    }
    
    //INVERTIR FRASE
    public void invertirFrase(Cadena cad){
        StringBuilder sb = new StringBuilder();     //constructor de Strings
        for(int i = (cad.getFrase().length()-1); i >= 0; i--){
            sb.append((cad.getFrase()).charAt(i));  //agrega chars al objeto sb
        }
        System.out.println(sb);  //imprime el objeto de tipo String
        System.out.println("");
    }
    
    //CONTAR ALGUN CARACTER SELECCIONADO
    public void vecesRepetido(Cadena cad){
        
        //variables auxiliares
        char k;
        char j;
        int count = 0;
        
        //mensaje por pantalla
        System.out.println("Ingrese una letra: ");
        
        //lee, aply minisculas, toma el orimer caracter (type k) = (char)
        k = leer.next().toLowerCase().charAt(0);
        
        //lectura de la frase y comparacion para validacion y conteo
        for(int i = 0; i < cad.getLongitud(); i++){
            j = cad.getFrase().charAt(i);
            if(j == k){
                count += 1;
            }
        }
        
        //resultado por pantalla
        System.out.println("La letra "+k+" se repite "+count+" veces en la frase");
        System.out.println("");
    }
    
    public void compararLongitud(Cadena cad){
        
        //variables auxiliares
        int long2;
        
        
        System.out.println("Ingrese una segunda frase");    //mensaje por pantalla
        
        
        long2 = leer.useDelimiter("\n").next().length();
        
        //bloque logico
        if(long2 > cad.getLongitud()){
            System.out.println("La segunda frase es mas larga");
            System.out.println("Tiene "+(long2-cad.getLongitud())+" letras más");
            System.out.println("");
        }
        else{
            System.out.println("La primera frase es mas larga");
            System.out.println("Tiene "+(cad.getLongitud()-long2)+" letras más");
            System.out.println("");
        }
    }
    
    public void unirFrases(Cadena cad){
        System.out.println("Ingrese una frase nueva: ");
        System.out.println(cad.getFrase().concat(" "+leer.useDelimiter("\n").next())+"\n");   
    }
    
    public void remplazar(Cadena cad){
        System.out.println("Ingrese una letra para reemplazar: ");
        char remplazo = leer.next().charAt(0);      //Toma el caracter para remplazar
        StringBuilder sb = new StringBuilder();     //crea un objeto cadena
        for(int i=0; i < cad.getLongitud(); i++){   //itera en la frase
            char k = cad.getFrase().charAt(i);      //asigna el i-esimo caranter a k
            
            if(!(k == 'a')){                        //validacion si la frase lleva "a"
                sb.append(k);                       //agrega caracter al objeto sb
            }
            else{
                sb.append(remplazo);                //remplaza por la letra asignada.
            }
        }
        System.out.println(sb + "\n");

        
    }
    
    
    public void contiene(Cadena cad){                               //revisar
        System.out.println("Ingrese una letra a validar: ");
        char valor = leer.next().charAt(0);      //Toma el caracter para remplazar
        for(int i=0; i < cad.getLongitud(); i++){   //itera en la frase
            char k = cad.getFrase().charAt(i);      //asigna el i-esimo caranter a k
            
            if(k == valor){
                System.out.println("La letra si esta en la frase");
                break;
            }
            
        }
        
        System.out.println("\n");
    }

}
