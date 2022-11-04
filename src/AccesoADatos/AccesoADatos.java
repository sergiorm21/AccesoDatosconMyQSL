/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AccesoADatos;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AccesoADatos {

    public static void main(String[] args) {
        String ruta = "C:\\Users\\reina.moser\\Desktop\\DAM\\ACCESO DATOS\\UD2\\RUTAprueba.txt";
        if (args.length >= 1) {
            ruta = args[0];
        }
        
        File fich = new File(ruta);
        if (!fich.exists()) {
            System.out.println("No existe el fichero o directorio (" + ruta + ").");
        } else {
            if (fich.isFile()) {
                System.out.println(ruta + " es un fichero.");
                
                //A continuación, vamos a sacar los permisos que posee nuestro fichero
                if(fich.canRead() && !fich.canWrite() && !fich.canExecute()){
                    System.err.println("r--");
                }else if(fich.canRead() && fich.canWrite() && !fich.canExecute()){
                    System.err.println("rw-");
                }else if(fich.canRead() && fich.canWrite() && fich.canExecute()){
                    System.err.println("rwx");
                }else if(!fich.canRead() && fich.canWrite() && !fich.canExecute()){
                    System.err.println("-w-");
                }else if(!fich.canRead() && !fich.canWrite() && fich.canExecute()){
                    System.err.println("--x");
                }else if(!fich.canRead() && fich.canWrite() && fich.canExecute()){
                    System.err.println("-wx");
                }else if(fich.canRead() && !fich.canWrite() && fich.canExecute()){
                    System.err.println("r-x");
                }
                
                //A continuación sacaremos la fecha de la última modificación del fichero
                long fecha = fich.lastModified();
                SimpleDateFormat date = new SimpleDateFormat ("dd/MM/yy hh:mm aa");
                System.err.println("La fecha de modificación: " + date.format(fecha));
            } else {
                System.out.println(ruta + " es un directorio. Contenidos: ");
                File[] ficheros = fich.listFiles();
                for (File f : ficheros) {
                    String textoDescr = f.isDirectory() ? "/"
                            : f.isFile() ? "_" : "?";
                    System.out.println("(" + textoDescr + ") " + f.getName());
                }
            }
        }

    }

}
