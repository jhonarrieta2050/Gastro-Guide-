
package Logica;
import java.util.ArrayList;
import Persistencia.BaseDatos;
import java.util.Date;
import javax.swing.JTextField;
public class Controlador {
    
     ArrayList<Usuario> baseDatos = new ArrayList<>();
     BaseDatos almacenar = new BaseDatos();
     private String contrasenaTemporal;
     private Usuario usuarioPrueba;
        
        public void guardar(String nombre ,String apellido,String genero,Date nacimiento, String email, String contrasena){
            
            
            
            
               Usuario usuario = new Usuario();
               
               usuario.setName(nombre);
               usuario.setApellido(apellido);
               usuario.setGenero(genero);
               usuario.setNacimiento(nacimiento);
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
        
        public void recorrer(){
            
            ArrayList<Usuario> listaUsuarios = almacenar.obtenerBaseDatos();
             for (Usuario usuario : listaUsuarios){
                 
                 System.out.println(usuario.getCorreo());
                 System.out.println(usuario.getGenero());
                 System.out.println(usuario.getNacimiento());
                
             }
             
             
            
        }
        
         public boolean estanVacio(String... campos){
                 
             for(String campo: campos){
                 
                 if(campo.equals("")){
                     return true;
                 }
                 
             }
             
             return false;
                 
             }
         
        
         
         public void verificarContrasena(String contrasena){
             
              
             
             ArrayList<Usuario> listaUsuarios = almacenar.obtenerBaseDatos();
             
             for(Usuario usuario : listaUsuarios){
                 
                 if(usuario.getContrasena().equals(contrasena)){
                     
                      this.usuarioPrueba = usuario;
                     
                 }
         }
           
}
         
         public Usuario getUsuarioPrueba(){
             return usuarioPrueba;
         }
         
         public void setContrasena(String contrasena){
             
             this.contrasenaTemporal = contrasena;
         }
         
         public String getContrasena(){
             
             return contrasenaTemporal;
         }
         
         
         
}

        
    
     

