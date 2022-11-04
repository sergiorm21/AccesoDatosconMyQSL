package accesoadatos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Actividad42UD2 {
    public static void main(String[] args){
        String fichero="info_dam.txt";
        File f=new File(fichero);
        if(f.exists()){
            System.out.println("Fichero" + fichero + "ya existe.");
            return;
        }
        
        try{
            BufferedWriter bfw=new BufferedWriter(new FileWriter(f));
            bfw.write("Empresas - 4 horas");
            bfw.newLine();
            bfw.write("Acceso a Datos - 6 horas");
            bfw.newLine();
            bfw.close();
            bfw=new BufferedWriter(new FileWriter(f, true));
            bfw.write("Libre configuracion - 6 horas");
            bfw.newLine();
            bfw.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
