
package Logica;
    


public class errores {
    
    private boolean pass;
    private String errorName;

    public void setPass(boolean pass){

    this.pass = pass;
 }
    
    public void setErrorName(String errorName){
        
        this.errorName = errorName;
    }
    
    public boolean getPass(){
        return pass;
    }
    
    public String getErrorName(){
        
        return errorName;
    }
    
}

