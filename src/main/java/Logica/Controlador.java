
package Logica;
import java.util.ArrayList;
import Persistencia.BaseDatos;
import java.util.Date;
import javax.swing.JTextField;
public class Controlador {
    
    
     BaseDatos baseDatos = new BaseDatos();
     
     private static Usuario usuarioActual;
     
        
        public void guardar(int id,String nombre ,String apellido,String genero,Date nacimiento, String email, String contrasena){
            
            
            
            
               Usuario usuario = new Usuario();
               
               usuario.setId(id);
               usuario.setName(nombre);
               usuario.setApellido(apellido);
               usuario.setGenero(genero);
               usuario.setNacimiento(nacimiento);
               usuario.setCorreo(email);
               usuario.setContrasena(contrasena);
              
               baseDatos.almacenar(usuario);
               
            
        }
        
        public boolean pass(String email, String password){
            
            ArrayList<Usuario> listaUsuarios = baseDatos.obtenerBaseDatos();
            
              for (Usuario usuario : listaUsuarios) {
                  
                  
                 if (usuario.getCorreo().equals(email) && usuario.getContrasena().equals(password)) {
                    return true;
                                    }
            }
                return false;
        }

        
         public boolean estanVacio(String... campos){
                 
             for(String campo: campos){
                 
                 if(campo.equals("")){
                     return true;
                 }
                 
             }
             
             return false;
                 
             }
         
        public Usuario cambiarDatos(String nombre,String apellido,String genero,String email,String contrasena){
            
            ArrayList<Usuario> listaUsuariosCambio = baseDatos.obtenerBaseDatos();
            
            if (listaUsuariosCambio.isEmpty()) {
    System.out.println("La lista de usuarios está vacía");
} else {
    // Itera sobre la lista de usuarios
    for (Usuario usuario : listaUsuariosCambio) {
        // Realiza las operaciones que necesites con cada usuario
        System.out.println("Nombre: " + usuario.getName());
        System.out.println("Apellido: " + usuario.getApellido());
    }
}
            
            
            for(Usuario usuario : listaUsuariosCambio){
                 
                System.out.println(usuario.getName() + "nombre---");
                System.out.println(usuario.getContrasena() + " contrasena");
                
                 if(usuarioActual.getContrasena().equals(usuario.getContrasena())){
                     
                      System.out.println("PASO ");
                      usuario.setName(nombre);
                      usuario.setApellido(apellido);
                      usuario.setGenero(genero);
                      usuario.setCorreo(email);
                      usuario.setContrasena(contrasena);
                      
                      return usuario;
                      
                 }
         }
            System.out.println("no paso");
                return usuarioActual;
            
        }
         
         public void verificarContrasena(String contrasena){
             
             ArrayList<Usuario> listaUsuarios = baseDatos.obtenerBaseDatos();
             
             for(Usuario usuario : listaUsuarios){
                
                 if(usuario.getContrasena().equals(contrasena)){
                     System.out.println("FUNCIONO");
                    Controlador.usuarioActual = usuario; 
                 }
         }
           
}
         
         public Usuario getUsuarioActual(){
             return usuarioActual;
         }
         
         
         
}

        
    
     

