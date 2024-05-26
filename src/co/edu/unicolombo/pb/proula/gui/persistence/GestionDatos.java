package co.edu.unicolombo.pb.proula.gui.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.edu.unicolombo.pb.proula.gui.logica.Recetas;

public class GestionDatos {

    public static String rutaBase = System.getProperty("user.home") + File.separator + "BaseDatosSerializados";

    public static void guardarUsuario(Object datos, String nombreArchivo) throws Exception {
        try {
            File rutaArchivo = new File(rutaBase);

            if (!rutaArchivo.exists()) {
                rutaArchivo.mkdir();
            }
            File archivo = new File(rutaBase, nombreArchivo + ".ser");
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            FileOutputStream escritorArchivo = new FileOutputStream(archivo);
            ObjectOutputStream escritorObjetos = new ObjectOutputStream(escritorArchivo);
            escritorObjetos.writeObject(datos);

            escritorObjetos.close();
            escritorArchivo.close();
        } catch (FileNotFoundException error) {
            throw new Exception("El archivo no existe");
        } catch (IOException error) {
            throw new Exception("Error durante la operación de escritura: " + error.getMessage());
        } catch (Exception error) {
            throw new Exception("Error desconocido al guardar: " + error.getMessage());
        }

    }

    public static String rutaRecetas = System.getProperty("user.home") + File.separator + "BaseDatosSerializadosRecetas";

    public static void guardarReceta(Recetas receta, String nombreArchivo) throws Exception {
        // ... código para crear la carpeta "BaseDatosRecetas" si no existe ...
        try (FileOutputStream escritorArchivo = new FileOutputStream(rutaRecetas + receta.getId() + ".ser"); ObjectOutputStream escritorObjetos = new ObjectOutputStream(escritorArchivo)) {
            escritorObjetos.writeObject(receta);
        } catch (FileNotFoundException error) {
            throw new Exception("El archivo de recetas no existe");
        } catch (IOException error) {
            throw new Exception("Error al guardar la receta: " + error.getMessage());
        } catch (Exception error) {
            throw new Exception("Error desconocido al guardar la receta: " + error.getMessage());
        }
    }

    public static Object recuperarUsuarios(String nombreArchivo) throws Exception {
        try {
            File archivo = new File(rutaBase, nombreArchivo + ".ser");
            if (!archivo.exists()) {
                throw new Exception("El archivo no existe");
            }
            FileInputStream lectorArchivo = new FileInputStream(archivo);
            ObjectInputStream lectorObjetos = new ObjectInputStream(lectorArchivo);
            return lectorObjetos.readObject();
        } catch (FileNotFoundException error) {
            throw new Exception("El archivo no existe");
        } catch (IOException error) {
            throw new Exception("Error al recuperar los datos");
        } catch (Exception error) {
            throw new Exception("Error desconocido al recuperar los datos");
        }
    }

    public static Recetas recuperarRecetas(String idReceta) throws Exception {
        try {
            File archivo = new File(rutaRecetas + idReceta + ".ser");
            if (!archivo.exists()) {
                throw new Exception("La receta no existe");
            }
            FileInputStream lectorArchivo = new FileInputStream(archivo);
            ObjectInputStream lectorObjetos = new ObjectInputStream(lectorArchivo);
            return (Recetas) lectorObjetos.readObject();
        } catch (FileNotFoundException error) {
            throw new Exception("La receta no existe");
        } catch (IOException error) {
            throw new Exception("Error al recuperar la receta: " + error.getMessage());
        } catch (Exception error) {
            throw new Exception("Error desconocido al recuperar la receta: " + error.getMessage());
        }
    }
}
