/*Sergio Reina Montes*/
package accesoadatos.UD2.Actividad5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejercicio1 {
    public static void main(String[] args){
        String nombreFichero = "C:\\Users\\reina.moser\\Documents\\NetBeansProjects\\AccesoaDatos\\src\\accesoadatos\\UD2\\Actividad5\\SergioReina.txt";
        //A continuación declaramos la variable FileReader
        FileReader fr = null;
        try{
            //Ahora, vamos a abrir el fichero indicado en la  variable nombreFichero
            fr = new FileReader(nombreFichero);
            //Leemos el primer carácter
            //Lo almacenamos en una variable int
            int caracter = fr.read();
            
            while(caracter != -1){
                System.out.println((char)caracter);
                caracter = fr.read();
            }
        }
        catch (FileNotFoundException e){
            //Si no encontramos el fichero, hacemos lo siguiente:
            System.out.println("Error: El fichero no se ha encontrado.");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error de lectura.");
            System.out.println(e.getMessage());
        }
    }
    
}
