package RepasoFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Actividad3Ud3 {
    
    public static void mostrarContenido(String fichero) throws FileNotFoundException, IOException{
        String cadena;
                FileReader f = new FileReader(fichero);
                BufferedReader b = new BufferedReader(f);
                while((cadena = b.readLine())!= null){
                    System.out.println(cadena);
                }
                b.close();
    }
    
    private void escribirEnArchivo(){
        try{
            String archivo = null;
            FileWriter escritura = new FileWriter(archivo);
            escritura.write("Saludos!!!");
            escritura.close();
            
            System.out.println("El texto se ha añadido con éxito");
        }catch(IOException e){
            e.printStackTrace(System.out);
        }
    }
    
    public static void main(String[] args){
        
        try{
        String ruta;
        File fichero = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("********************************");
        System.out.println("Bienvenido, selecciona la opción que deseas realizar: ");

        System.out.println("1 - Creación de un fichero de texto, cuyo nombre será elegido por usuario, al que se le pase un array con los 50 primeros números impares.");
        System.out.println("2 - Mostrar contenido del fichero creado.");
        System.out.println("3 - Insertar más números al final del fichero.");
        System.out.println("4 - Comprobación del fichero creado y eliminación de los números que no sean impares, dejando solo los números impares.");
        System.out.println("5 - Salir del programa.");

        System.out.println("Es hora de elegir: ");
        int opcion = Integer.parseInt(br.readLine());

        switch (opcion) {
            case 1:
                ruta = "C:\\Users\\sergi\\OneDrive\\Documentos\\NetBeansProjects\\AccesoADatos\\Prueba3Ejercicio3.txt";
                File archivo = new File(ruta);

                if (!archivo.exists()) {
                    archivo.createNewFile();
                    
                    FileWriter escritura = new FileWriter(archivo);
                    escritura.write("Saludos!!!");
                    escritura.close();
                    
                } else {
                    System.out.println("No se puede crear dicho fichero porque ya existe.");
                }
                
            case 2:
                mostrarContenido("C:\\Users\\sergi\\OneDrive\\Documentos\\NetBeansProjects\\AccesoADatos\\Prueba3Ejercicio3.txt");
                
            case 3:
            {
                String nomFich;
                archivo = new File(nomFich); // INDICAMOS FICHERO
            }

                    int num; // NUMERO

                    boolean bandera = true; // BANDERA, PARA CONTROLAR SI QUEREMOS ESCRIBIR MAS NUMEROS
            FileWriter fw = new FileWriter(archivo, true); // INDICAMOS ARCHIVO A ESCRIBIR Y QUE ESCRIBIREMOS DESDE LA ULTIMA LINEA ESCRITA, ES DECIR, NO SE SOBREESCRIBIRÁ
            PrintWriter pw = new PrintWriter(fw); // LO HAREMOS CON 'PW'

                    do {
                        System.out.print("Introduce un número para añadir al fichero: ");
                        num = Integer.parseInt(br.readLine()); // ALMACENAMOS NUMERO A AÑADIR
                        pw.println(num); // AÑADIMOS

                        System.out.println("¿Deseas introducir más números? S/n");
                        String res = br.readLine(); // ALMACENAMOS SI QUEREMOS ALMACENAR MAS NUMEROS

                        if (res.equalsIgnoreCase("n")) { // SI NO QUEREMOS INTRODUCIR MAS
                            bandera = false; // PONEMOS 'BANDERA' A 'FALSE'
                        }
                    } while (bandera != false); // BUCLE HASTA NO QUERER INTRODUCIR MAS NUMEROS
                    break; // SALIMOS
                    
            case 4:
                
            case 5:
                    break; // SALIMOS
                default:
                    break; // SALIMOS
        }
    }catch (Exception e){
        e.printStackTrace();
    }
    }

    
        
    

}
