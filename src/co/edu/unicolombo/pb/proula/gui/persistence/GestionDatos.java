package co.edu.unicolombo.pb.proula.gui.persistence;

import co.edu.unicolombo.pb.proula.gui.logica.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestionDatos {
    
    public static String rutaBase = System.getProperty("user.home") + File.separator + "BaseDatosSerializados";

    public static void guardar(Object datos, String nombreArchivo)   throws Exception{
        try{
            File rutaArchivo = new File(rutaBase);
                
            if(!rutaArchivo.exists()){
                rutaArchivo.mkdir();
            }
            File archivo = new File(rutaBase, nombreArchivo + ".txt");
            if(!archivo.exists()){
                archivo.createNewFile();
            }
            FileOutputStream escritorArchivo = new FileOutputStream(archivo);
            ObjectOutputStream escritorObjetos = new ObjectOutputStream(escritorArchivo);
            escritorObjetos.writeObject(datos);
            
            escritorObjetos.close();
            escritorArchivo.close();
        }
        catch(FileNotFoundException error){
            throw new Exception ("El archivo no existe");
        }
        catch(IOException error){
            throw new Exception ("Error al guardar");
        }
        catch(Exception error){
            throw new Exception ("Error desconocido al guardar");
        }
        
   }
    
    public static Object recuperar(String nombreArchivo)   throws Exception{
        try{
                File archivo = new File(rutaBase, nombreArchivo + ".txt");
            if(!archivo.exists()){
                throw new Exception ("El archivo no existe");
            }
            FileInputStream lectorArchivo = new FileInputStream(archivo);
            ObjectInputStream lectorObjetos = new ObjectInputStream(lectorArchivo);
            return lectorObjetos.readObject();
        }
        catch(FileNotFoundException error){
            throw new Exception ("El archivo no existe");
        }
        catch(IOException error){
            throw new Exception ("Error al recuperar los datos");
        }
        catch(Exception error){
            throw new Exception ("Error desconocido al recuperar los datos");
        }
    }
}