package accesoadatos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Actividad4UD2 {
    public static void main(String[] args){
        if(args.length < 1){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el nombre del fichero en cuestion: ");
            String fichero = sc.nextLine();
        }
        String fichero = args[0];
        
        try(BufferedReader fbr = new BufferedReader(new FileReader(fichero))){
            int i = 0;
            String linea = fbr.readLine();
            while (linea != null){
                System.out.format("[%5d] %s", i++, linea);
                System.out.println();
                linea = fbr.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("No existe el fichero indicado" + fichero);
        }catch (IOException e){
            System.out.println("Error de fichero" + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
