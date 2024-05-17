package co.edu.unicolombo.pb.proula.gui.persistence;

import co.edu.unicolombo.pb.proula.gui.logica.Usuario;
import java.io.Serializable;
import java.util.ArrayList;

public class BaseDatos implements Serializable{
    public ArrayList<Usuario> baseDatos = new ArrayList<>();
    
    public void almacenar(Usuario usuario){
        
        baseDatos.add(usuario);
        System.out.println(baseDatos.get(0).getCorreo());
        
        try {
            GestionDatos.guardar(baseDatos, "datos");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public ArrayList<Usuario> obtenerBaseDatos(){
        try {
            baseDatos = (ArrayList<Usuario>) GestionDatos.recuperar("datos");
        } catch (Exception e) {
            System.out.println(e);
        }
        return baseDatos;
        
    }
    
    public void guardarBaseDatos(ArrayList<Usuario> basedatos){
        this.baseDatos = basedatos;
        
        try {
            GestionDatos.guardar(baseDatos, "datos");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void recorrer(){
        try {
            baseDatos = (ArrayList<Usuario>) GestionDatos.recuperar("datos");
        } catch (Exception e) {
            System.out.println(e);
        }
        for (Usuario usuario : baseDatos) {                  
                  System.out.println("Nombre: " + usuario.getContrasena()+ ", Correo: " + usuario.getCorreo());
            }
    }
}
