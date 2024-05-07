
package Logica;
import java.util.ArrayList;
import Persistencia.BaseDatos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import javax.swing.JOptionPane;
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
         
        public Usuario cambiarDatos(String nombre,String apellido,String email,String contrasena){
            
            ArrayList<Usuario> listaUsuariosCambio = baseDatos.obtenerBaseDatos();
            
            if( nombre.length() != 0 && 3 > nombre.length()){
              
                 throw new IllegalArgumentException("El nombre debe tener al menos 3 caracteres");
                        
            
            }else if(apellido.length() != 0 && 3 > apellido.length()){
       
                throw new IllegalArgumentException("El apellido debe tener al menos 3 caracteres");
                
            }else if(!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}") && email.length() != 0){
        
                 throw new IllegalArgumentException("El email no es válido");
        
        }else if(contrasena.length() != 0 && 4 > contrasena.length() ){
            
                  throw new IllegalArgumentException("La contraseña debe tener al menos 4 caracteres");
                 
        }
            if(nombre.length() == 0){
                
                nombre = usuarioActual.getName();
            }
            
            if(apellido.length() == 0){
                
                apellido = usuarioActual.getApellido();
            }
            if(email.length() == 0){
                
                email = usuarioActual.getCorreo();
            }
            if(contrasena.length() == 0){
                
                contrasena = usuarioActual.getContrasena();
            }
            
            
            for(Usuario usuario : listaUsuariosCambio){
                
                 if(usuarioActual.getId() == usuario.getId()){
                     
                     
                      usuario.setName(nombre);
                      usuario.setApellido(apellido);
                      usuario.setCorreo(email);
                      usuario.setContrasena(contrasena);
                      
                      baseDatos.guardarBaseDatos(listaUsuariosCambio);
                      
                      return usuario;
                      
                 }
         }
           
                return usuarioActual;
            
        }
         
         public void verificarContrasena(String contrasena){
             
             ArrayList<Usuario> listaUsuarios = baseDatos.obtenerBaseDatos();
             
             for(Usuario usuario : listaUsuarios){
                
                 if(usuario.getContrasena().equals(contrasena)){
                    
                    Controlador.usuarioActual = usuario; 
                 }
         }
           
}
         
          public boolean verificarContrasenaAcesso(String contrasena){
             
           return !usuarioActual.getContrasena().equals(contrasena);
           
           
}
         
         public Usuario getUsuarioActual(){
             return usuarioActual;
         }

    public errores validacionDatos(String nombre, String email, String contrasenaa, String genero, String apellido) {
    errores Error = new errores();
    ArrayList<String> ErrorList = new ArrayList<>();

    if (nombre.isEmpty() || nombre.length() < 3) {
        ErrorList.add("Se requieren mínimo 3 caracteres en el nombre");
    } else if (!nombre.matches("[a-zA-Z]+")) {
        ErrorList.add("Solo están permitidas letras en el nombre");
    }

    if (apellido.isEmpty() || apellido.length() < 3) {
        ErrorList.add("Se requieren mínimo 3 caracteres en el apellido");
    } else if (!apellido.matches("[a-zA-Z]+")) {
        ErrorList.add("Solo están permitidas letras en el apellido");
    }

    if (genero.isEmpty()) {
        ErrorList.add("Elija una opción en el género");
    }

    if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
        ErrorList.add("Correo electrónico incorrecto, escriba uno con el patrón correcto");
    }

    if (contrasenaa.isEmpty() || contrasenaa.length() < 4) {
        ErrorList.add("La contraseña debe contener mínimo 4 caracteres");
    }

    if (!ErrorList.isEmpty()) {
        Error.setPass(true);
        String[] errores = ErrorList.toArray(String[]::new);
        Error.setErrorName(errores);
    } else {
        Error.setPass(false); // No hay errores, por lo tanto, no establecemos la bandera en true
    }

    return Error;
}

    public errores validarFecha(String fechaa) {
    errores Error = new errores();
    ArrayList<String> errorList = new ArrayList<>();
    Date nacimiento = null;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    try {
        nacimiento = dateFormat.parse(fechaa);
        Error.setFecha(nacimiento);
        Error.setPass(false);
    } catch (ParseException ex) {
        if (fechaa.isEmpty()) {
            errorList.add("Escriba una fecha");
        } else {
            errorList.add("Formato de fecha incorrecto");
        }
        Error.setErrorName(errorList.toArray(String[]::new));
        Error.setPass(true);
    }

    return Error;
}
    
    
}

        
    
     

