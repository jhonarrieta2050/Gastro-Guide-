
package co.edu.unicolombo.pb.proula.gui.logica;

import java.util.ArrayList;
import java.util.Date;


public class Recetas {
    
    public  String titulo;
    public  String descripcion;
    public  ArrayList<String> ingredientes;
    public  ArrayList<String> etiquetas;
    public  ArrayList<String> pasos;
    public  Date fechaCreada;
    public  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    public Date getFechaCreada() {
        return fechaCreada;
    }

    public void setFechaCreada(Date fechaCreada) {
        this.fechaCreada = fechaCreada;
    }
    
    
    public String pasos(){
        
        StringBuilder cadenaConstructor = new StringBuilder();
        
         for (int i = 0; i < pasos.size(); i++) {
            cadenaConstructor.append(pasos.get(i));
            if (i < pasos.size() - 1) { 
            cadenaConstructor.append("--------------");
        }
    }
        
        return cadenaConstructor.toString();
    }
    public String ingredientes(){
        
        StringBuilder cadenaConstructor = new StringBuilder();
        
         for (int i = 0; i < ingredientes.size(); i++) {
            cadenaConstructor.append(ingredientes.get(i));
            if (i < pasos.size() - 1) { 
            cadenaConstructor.append(",");
        }
    }
        
        return cadenaConstructor.toString();
    }
    public String etiquetas(){
        
        StringBuilder cadenaConstructor = new StringBuilder();
        
         for (int i = 0; i < etiquetas.size(); i++) {
            cadenaConstructor.append(etiquetas.get(i));
            if (i < pasos.size() - 1) { 
            cadenaConstructor.append(",");
        }
    }
        
        return cadenaConstructor.toString();
    }
    
}
