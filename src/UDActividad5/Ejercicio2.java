/*Sergio Reina Montes*/
package UDActividad5;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        try {
            String ruta;
            File archivo = null;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Bienvenido, selecciona lo que quieres hacer.");

            System.out.println("1 - Crear un fichero.");
            System.out.println("2 - Mostrar contenido de un fichero.");
            System.out.println("3 - Escribir al final de un fichero.");
            System.out.println("4 - Salir.");
            System.out.println("Elige la opcion");
            int opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    ruta = "C:\\Users\\reina.moser\\Documents\\NetBeansProjects\\AccesoADatos\\src\\UDActividad5\\SergioReinaExtra1.txt";
                    archivo = new File(ruta);
                    
                    if (!archivo.exists()){
                        archivo.createNewFile();
                    }else{
                        System.out.println("No se puede crear porque ya existe.");
                    }
                    
                case 2:
                    

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
