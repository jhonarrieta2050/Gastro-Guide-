
package Logica;
import java.util.ArrayList;
import Persistencia.BaseDatos;

public class Controlador {
    
     ArrayList<Usuario> baseDatos = new ArrayList<>();
     BaseDatos almacenar = new BaseDatos();
        
        public void guardar(String nombre , String email, String contrasena){
            
               Usuario usuario = new Usuario();
               
               usuario.setName(nombre);
               usuario.setCorreo(email);
               usuario.setContrasena(contrasena);
              
               almacenar.almacenar(usuario);
               
            
        }
        
        public boolean pass(String email, String password){
            
            ArrayList<Usuario> listaUsuarios = almacenar.obtenerBaseDatos();
            
              for (Usuario usuario : listaUsuarios) {
                  
                  
                 if (usuario.getCorreo().equals(email) && usuario.getContrasena().equals(password)) {
                    return true;
                                    }
            }
                return false;
        }
    }
     

