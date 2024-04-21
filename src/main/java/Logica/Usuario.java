
package Logica;

public class Usuario {
    
    private String name;
    private String correo;
    private String contrasena;

    public Usuario() {
    }
    
    

    public Usuario(String name, String correo, String contrasena) {
        this.name = name;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}
