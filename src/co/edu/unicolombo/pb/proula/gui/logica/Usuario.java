package co.edu.unicolombo.pb.proula.gui.logica;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    private int id;
    private String name;
    private String apellido;
    private String genero;
    private String correo;
    private String contrasena;
    private Date nacimiento;
    private ArrayList<Recetas> recetas = new ArrayList();
    
    
    public Usuario() {
        
        
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    public void setReceta(Recetas receta){
        
        recetas.add(receta);
        
    }
    
    public ArrayList<Recetas> getRecetas(){
        
        return recetas;
        
    }
    
    public void actualizarRecetas(ArrayList<Recetas> recetas){
        this.recetas = recetas;
        
    }
}
