
package co.edu.unicolombo.pb.proula.gui.logica;
    
import java.util.Date;



public class errores {
    
    private boolean pass = false;
    private String[] errorName;
    private Date fecha;

    public void setPass(boolean pass){

    this.pass = pass;
 }
    
    public void setErrorName(String[] errorName){
        
        this.errorName = errorName;
    }
    
    public boolean getPass(){
        return pass;
    }
    
    public String[] getErrorName(){
        
        return errorName;
    }
    
    public void setFecha(Date date){
        this.fecha = date;
    }
    
    public Date getFecha(){
        
        return fecha;
    }
    
}

