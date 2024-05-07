
package Logica;
import java.util.ArrayList;
import Persistencia.BaseDatos;
import java.util.Date;
import java.util.HashSet;
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
            
            
            for(Usuario usuario : listaUsuariosCambio){
                
                 if(usuarioActual.getId() == usuario.getId()){
                     
                      System.out.println("PASO ");
                      usuario.setName(nombre);
                      usuario.setApellido(apellido);
                      usuario.setGenero(genero);
                      usuario.setCorreo(email);
                      usuario.setContrasena(contrasena);
                      
                      baseDatos.guardarBaseDatos(listaUsuariosCambio);
                      
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

    public errores validacionDatos(String nombre, String email, String contrasenaa, String genero, String apellido) {
        
        errores Error = new errores();
        
        if(nombre.isEmpty() || 3 > nombre.length()){
            
            Error.setErrorName("Se requieren minimo 3 caracteres en el nombre");
            Error.setPass(true);
            return Error;
            
    }else if(apellido.isEmpty() || 3 > apellido.length()){
        
        Error.setErrorName("Se requieren minimo 3 caracteres en el apellido");
        Error.setPass(true);
        return Error;
        
    }else if( genero.isEmpty()){
        
        Error.setErrorName("Eliga una opcion en el genero");
        Error.setPass(true);
        
    }else if(!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")){
        
        Error.setErrorName("Correo electronico incorrecto, escriba uno con patron correcto");
        Error.setPass(true);
        return Error;
        
    }else if(contrasenaa.isEmpty() || 4 > contrasenaa.length() ){
        
        Error.setErrorName("La contrasena debe contener minimo 4 caractares ");
        Error.setPass(true);
        return Error;
    }
        
        
         
         Error.setErrorName(null);
         Error.setPass(false);
         
         return Error;
         
}

    
}

        
    
     

