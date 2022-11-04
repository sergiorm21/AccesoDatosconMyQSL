package RepasoFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Actividad1Ud3 {
    public static void main (String[] args){
        
        StringBuffer sb = null;
        String nombreFichero="C:\\Users\\sergi\\OneDrive\\Documentos\\NetBeansProjects\\AccesoADatos\\FOrigen.txt";
        
        try{
            File file = new File(nombreFichero);
            String linea = null;
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            sb = new StringBuffer();
            
            while ((linea = br.readLine()) != null){
                sb.append(linea);
            }
            
            System.out.println("Contenido del fichero " +nombreFichero+ ":" + sb.toString());
            br.close();
        }catch (IOException e){
            System.out.println("No se encontró el fichero en la ruta: " +nombreFichero + "Es necesario crear un fichero.");
        }
        
        try{
            FileWriter fw = new FileWriter(nombreFichero, false);
            String contenido = sb.toString();
            
            String contenidoEnMayusculas = sb.toString().toUpperCase();
            
            fw.write(contenidoEnMayusculas);
            fw.close();
        }catch (IOException ioe){
            
        }
        try{
            String nombreFicheroOrigen = "C:\\Users\\sergi\\OneDrive\\Documentos\\NetBeansProjects\\AccesoADatos\\FOrigen.txt";
            
            FileReader fr = new FileReader(nombreFicheroOrigen);
            BufferedReader br = new BufferedReader (fr);
            String nombreFIcheroDestino = "C:\\Users\\sergi\\OneDrive\\Documentos\\NetBeansProjects\\AccesoADatos\\FDestino.txt";
            FileWriter fw = new FileWriter(nombreFIcheroDestino);
            PrintWriter pw = new PrintWriter (fw);
            
            String lineaFichero;
            while ((lineaFichero = br.readLine()) != null){
                pw.println(lineaFichero);
            }
            br.close();
            pw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
    
            

