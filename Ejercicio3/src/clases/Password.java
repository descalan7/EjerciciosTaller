/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Password {
    private int longitud;
    private String contraseña;
    
    public Password(int longitud,String contraseña){
        this.longitud=longitud;
        this.contraseña=contraseña;
        
        
    }public int getLongitud(){
        return longitud;
    }public void setLongitud(int longitud){
        this.longitud=longitud;
    }public String getContraseña(){
        return contraseña;
    }public void setContraseña(String contraseña){
        this.contraseña=contraseña;
    }public Password fuerte(){
        int lon; String cont;
        String msj;
        Password f;
        
        cont=this.contraseña;
        lon=this.longitud;
        if(lon>=6){
          f=new Password(lon,"si");
            
        }else{
            f=new Password(lon,"no");
            
        }
       return f;
       
    }public  String mostrar(){
        String res;
        Password p1;
        p1 =new Password(this.getLongitud(),this.getContraseña());
      res=("Su contraseña  es: "+this.getContraseña()+ "\n la longitud de la contraseña es: " +this.getLongitud()+ "\n la contraseña " + p1.fuerte().contraseña + " es fuerte");
      return res;
    }public void  Cambiar(String nueva_contra){
       
        this.contraseña=nueva_contra;
       
    }
    
    
}
