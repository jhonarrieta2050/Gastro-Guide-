/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proula.gui;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Usuario
 */
public class prueba {
    
    public  String prueba = "1.hola 2.adios 3.paso";
    
    public static void main(String[] args) {
        
        prueba Prueba = new prueba();
        
        Prueba.separadorPasos();
    }
    
    public void separadorPasos(){
        boolean pass = false;
        int i = 0;
        ArrayList<String> array = new ArrayList<>();
     
        Pattern expresionRegular = Pattern.compile("\\d+\\..*?(?=\\d+\\.|$)");
        Matcher grupo = expresionRegular.matcher(prueba);
        do{
            
        if(grupo.find(i)){
            array.add(grupo.group());
            i = grupo.group().length() + 2;
        }else{
            pass=true;
        }
        
        
        }while(pass);
        System.out.println(array);
       
    }
}
