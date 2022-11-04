package RepasoFicheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejercicio2Binarios {
    public static void main(String[] args){
        try{
            File origen = new File("forigen.dat"); //AQUI INIALIZAMOS LA VARIABLE FILE PARA EL FICHERO ORIGEN
            File destino =  new File("fdestino.dat"); //AQUI INIALIZAMOS LA VARIABLE FILE PARA EL FICHERO DESTINO
            
            InputStream in = new FileInputStream(origen); //SEÑALAMOS QUE EL FICHERO DE ENTRADA ES EL ORIGEN
            OutputStream out = new FileOutputStream(destino); //SEÑALAMOS EL FICHERO DESTINO COMO SALIDA
            
            byte size = (byte) origen.length(); //ES UNA VARIABLE BYTES ALMACENAMOS EL TAMAÑO DEL FICHERO DE ORIGEN
            
            byte[] datos = new byte[size]; //AQUI CREAMOS UNA ARRAY DE BYTES CON TAMAÑO DEL FICHERO ORIGEN
            int linea;
            
            while ((linea = in.read(datos)) > 0 ){ //AHORA HACEMOS UN BUCLE WHILE PARA RECORRER TODO EL FICHERO
                out.write(datos); //AHORA, LOS DATOS LEIDOS ANTERIORMENTE LOS METEMOS EN EL FICHERO DESTINO
            }
            in.close(); //CERRAMOS LAS VARIABLES DE ENTRADA Y SALIDA
            out.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
