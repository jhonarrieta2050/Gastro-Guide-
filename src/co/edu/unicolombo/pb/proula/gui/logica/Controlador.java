
package co.edu.unicolombo.pb.proula.gui.logica;
import co.edu.unicolombo.pb.proula.gui.persistence.BaseDatos;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

    public boolean validarNombre(String nombre) {
       
        ArrayList<Usuario> listaUsuariosCambio = baseDatos.obtenerBaseDatos();
        
        for(Usuario usuario : listaUsuariosCambio){
            if(usuario.getName().equals(nombre)){       
                return false;
            }
        }
        return true;
    }

    public boolean CompararContrasena(String contrasena, String contrasenaP, String usuarioRecover) {
        
         ArrayList<Usuario> listaUsuariosCambio = baseDatos.obtenerBaseDatos();
         
         if(!contrasena.equals(contrasenaP)){
             throw new IllegalArgumentException("La contrasenas ingresadas no concuerdan, intentelo nuevamente");
             
             
         }
         
         for(Usuario usuario : listaUsuariosCambio ){
             if(usuario.getName().equals(usuarioRecover)){
             
             usuario.setContrasena(contrasena);
             
             baseDatos.guardarBaseDatos(listaUsuariosCambio);
             
             return true;
             }
         }
         
         return false;
    }
    
    public void guardarReceta(String titulo, String descripcion,String ingredientes,String etiquetas,String pasos){
        
       int cantidadRecetas = contarRecetas();
        
        
        ArrayList<Usuario> listaUsuarios = baseDatos.obtenerBaseDatos();
        Recetas receta = new Recetas();
        
        receta.setTitulo(titulo);
        receta.setDescripcion(descripcion);
        receta.setId(cantidadRecetas);
        
        receta.setIngredientes(separadorComas(ingredientes));
        receta.setEtiquetas(separadorComas(etiquetas));
        receta.setPasos(separadorPasos(pasos));
        
       
        for(Usuario usuario : listaUsuarios){
                
                 if(usuarioActual.getId() == usuario.getId()){
                     usuario.setReceta(receta);
                     baseDatos.guardarBaseDatos(listaUsuarios); 
                 }
                 
         }
        actualizarUsuarioActual();
    }
    
    public errores validarRecetas(String titulo, String descripcion,String ingredientes,String etiquetas,String pasos){
         errores Error = new errores();
        ArrayList<String> ErrorList = new ArrayList<>();
        
         if (titulo.isEmpty() || titulo.length() < 2) {
            ErrorList.add("Se requieren mínimo 2 caracteres en el titulo");
        } 

        if (descripcion.isEmpty() || descripcion.length() < 10) {
        ErrorList.add("Se requieren mínimo 10 caracteres en la descripcion");
    } 
        
    if (ingredientes.isEmpty()) {
        ErrorList.add("Debe haber minimo un ingrediente");
    }

    if (etiquetas.isEmpty()) {
        ErrorList.add("Debe haber minimo una etiqueta");
    }

    if (pasos.isEmpty() || !Pattern.matches("(?s)\\d+\\..*?(?=\\d+\\.|$)", pasos)) {
    ErrorList.add("Debe haber pasos en la receta, en el formato correcto.");
    }
        
        if (!ErrorList.isEmpty()) {
        Error.setPass(true);
        String[] errores = ErrorList.toArray(String[]::new);
        Error.setErrorName(errores);
    } else {
        Error.setPass(false); 
    }

    return Error;
    }
    
    public errores editarRecetasValidacion(String titulo, String descripcion,String ingredientes,String etiquetas,String pasos){
        errores Error = new errores();
        ArrayList<String> ErrorList = new ArrayList<>();
        
         if (!titulo.isEmpty() && titulo.length() < 2) {
            ErrorList.add("Se requieren mínimo 2 caracteres en el titulo");
        } 

        if (!descripcion.isEmpty() && descripcion.length() < 10) {
        ErrorList.add("Se requieren mínimo 10 caracteres en la descripcion");
    } 
        

    if (!pasos.isEmpty() &&   pasos.length() < 4) {
        ErrorList.add("debe haber pasos en la receta");
    }
        
        if (!ErrorList.isEmpty()) {
        Error.setPass(true);
        String[] errores = ErrorList.toArray(String[]::new);
        Error.setErrorName(errores);
    } else {
        Error.setPass(false);
    }

    return Error;
    }

    public ArrayList<String> separadorComas(String texto) {
        
        ArrayList<String> array = new ArrayList();
        
        StringBuilder palabra = new StringBuilder();
        
        for(int i = 0; i< texto.length(); i ++){
            
            char caracter = texto.charAt(i);
            
            if(caracter != ',' && caracter != '\n' ){
                palabra.append(caracter);
            }else{
                array.add(palabra.toString().trim());
                palabra = new StringBuilder();
            }
        }
            if(palabra.length() > 0){
                array.add(palabra.toString().trim());
             }
        
        return array;
        
    }
    
    public ArrayList<String> separadorPasos(String pasos){
        
          ArrayList<String> array = new ArrayList<>();
        Pattern expresionRegular = Pattern.compile("\\d+\\..*?(?=\\d+\\.|$)", Pattern.DOTALL);
        Matcher grupo = expresionRegular.matcher(pasos);

        while (grupo.find()) {
            array.add(grupo.group().trim());
        }
        
        return array;
    }
    
    public void actualizarUsuarioActual(){
        ArrayList<Usuario> listaUsuarios = baseDatos.obtenerBaseDatos();
        
        for(Usuario usuario : listaUsuarios){
                
                 if(usuarioActual.getId() == usuario.getId()){
                     
                     Controlador.usuarioActual = usuario;
                 }
         }
    }
    
    public int contarRecetas(){
        
        int i = usuarioActual.getRecetas().size() + 1;
        
        return i;
    }

    public void editarReceta(String titulo, String descripcion,String ingredientes, String etiquetas, String pasos,int Id) {
       
         ArrayList<Usuario> listaUsuarios = baseDatos.obtenerBaseDatos();
            
         ArrayList<Recetas> recetas = usuarioActual.getRecetas();
         
         for(Recetas receta : recetas){
             
                if(receta.getId() == Id){
                 
                 if(titulo.isEmpty()){
                    titulo = receta.getTitulo();
                }
                 
                 if(descripcion.isEmpty()){
                    descripcion = receta.getDescripcion();
                }
                 if(ingredientes.isEmpty()){
                    ingredientes = receta.getIngredientes();
                }
                 if(etiquetas.isEmpty()){
                    etiquetas = receta.getEtiquetas();
                }
                 if(pasos.isEmpty()){
                    pasos = receta.getpasos();
                }
                 
                receta.setTitulo(titulo);
                receta.setDescripcion(descripcion);
                receta.setIngredientes(separadorComas(ingredientes));
                receta.setEtiquetas(separadorComas(etiquetas));
                receta.setPasos(separadorPasos(pasos));
                
                usuarioActual.actualizarRecetas(recetas);
                
                 for(int i = 0; i < listaUsuarios.size(); i++) {
                     if(listaUsuarios.get(i).getId() == usuarioActual.getId()){
                         listaUsuarios.set(i, usuarioActual);
                         baseDatos.guardarBaseDatos(listaUsuarios);
                         actualizarUsuarioActual();
                         return;
                 }
                }
                
             }
         } 
    }
    
    public Recetas regresarReceta(int id){
        
        ArrayList<Recetas> recetas = usuarioActual.getRecetas();
        
        for(Recetas receta: recetas){
            
            if(receta.getId() == id){
                return receta;
            }
        }
        
         throw new IllegalArgumentException("La contrasenas ingresadas no concuerdan, intentelo nuevamente");
    }
    
}

        
    
     

