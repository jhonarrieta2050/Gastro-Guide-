package Persistencia;

import Logica.Usuario;
import java.util.ArrayList;

public class BaseDatos {
    private ArrayList<Usuario> baseDatos = new ArrayList<>();
    
    public void almacenar(Usuario usuario){
        
        baseDatos.add(usuario);
    }
    
    public ArrayList<Usuario> obtenerBaseDatos(){
        
        return baseDatos;
        
    }
    
    public void guardarBaseDatos(ArrayList<Usuario> basedatos){
        this.baseDatos = basedatos;
        
    }
    
    public void recorrer(){
        
        for (Usuario usuario : baseDatos) {
                  
                  
                  System.out.println("Nombre: " + usuario.getContrasena()+ ", Correo: " + usuario.getCorreo());
            }
    }
}
