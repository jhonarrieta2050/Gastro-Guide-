
package co.edu.unicolombo.pb.proula.gui.logica;

import java.util.ArrayList;
import java.util.Date;


public class Recetas {
    
    private String titulo;
    private String descripcion;
    private ArrayList<String> ingredientes;
    private ArrayList<String> etiquetas;
    private ArrayList<String> pasos;
    private Date fechaCreada;
    private int id;

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

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
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
  
    public String getpasos(){
        
        String Pasos = separador(pasos);
        return Pasos;
    }
    
    public String getIngredientes(){
        
        String Ingredientes = separador(ingredientes);
        return Ingredientes;
    }
    public String getEtiquetas(){
       
        String Etiquetas = separador(etiquetas);
        
       return Etiquetas;
    }
    
    public String separador(ArrayList<String> array){
         
        StringBuilder cadenaConstructor = new StringBuilder();
        
        for (int i = 0; i < array.size(); i++) {
            String palabra = array.get(i);
            cadenaConstructor.append('-').append(palabra);
            
                if (cadenaConstructor.charAt(cadenaConstructor.length() - 1) != '.') {
                    cadenaConstructor.append(".");
                }
                cadenaConstructor.append("\n");
        }
       return cadenaConstructor.toString().trim();
    }
}
