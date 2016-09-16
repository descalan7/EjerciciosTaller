/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Usuario
 */
public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }public Hora(){
        this.hora=00;
        this.minutos=00;
        this.segundos=00;
    
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }public  String Comprobar(){
        String aux;
        Hora h2 ;
        h2=new Hora(10,30,11);
        
      
        if(this.hora>=0 && this.hora<=23 && this.minutos>=0 && this.minutos<=59 && this.segundos>=0 && this.segundos<=59 ){
            aux="la hora es correcta";
            return aux;
        }else{
            aux="la hora no es correcta";
            return aux;
        }
        
    }public String Indicar(){
        Hora h2;
        String aux;
        h2=new Hora(10,30,11);
       
        if(h2.hora<this.hora){
            aux="La hora es anterior a la proporcionada ";
            return aux;
        }else if(h2.hora==this.hora && h2.minutos<this.minutos){
            aux="La hora es anterior a la proporcionada ";
            return aux;
        }else if(this.hora==h2.hora && this.minutos==h2.minutos){
            aux="la hora es la misma que la que se proporcina";
            return aux;
        }else{
            aux= "la hora es posterior a la que se proporciona";
            return aux;
        }
        
    }
    
    
    
    public String Mostrar(){
        
        String aux2;
        aux2="La hora es digitada es: "+this.getHora()+":"+this.getMinutos()+":"+this.getSegundos()+"\n"
           + "La hora por defecto es: "+10+":"+30+":"+11;
             return aux2;
    }
    
}
