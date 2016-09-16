/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Usuario
 */
public class Fraccionario {
   private  int numerador;
   private int denominador;
   
     public Fraccionario(int numerador, int denominador)throws DenominadorCeroException{
         this.numerador=numerador;
         this.denominador=denominador;
         if(denominador==0){
             throw new DenominadorCeroException();
         } 
         }
         public int getNumerador(){
             return numerador;
     }
         public void setNumerador(int numerador){
             this.numerador=numerador;
         }
    public int  getDenominador(){
        return denominador;
    }
    public void setDenominador(int denominador){
        this.denominador=denominador;
    }
    
    public Fraccionario suma(Fraccionario f2)throws DenominadorCeroException{
        int nume,deno;
        Fraccionario f;
        nume=this.numerador*f2.denominador+this.denominador*f2.numerador;
        deno=this.denominador*f2.denominador;
        f= new Fraccionario(nume,deno);
        return f;
    }
    public Fraccionario resta(Fraccionario f2)throws DenominadorCeroException{
        int nume,deno;
        Fraccionario f;
        nume=this.numerador*f2.denominador-this.denominador*f2.numerador;
        deno=this.denominador*f2.denominador;
        f = new Fraccionario(nume,deno);
        return f;
        
    }
    public Fraccionario multiplicacion(Fraccionario f2) throws DenominadorCeroException{
        int nume,deno;
        Fraccionario f;
        nume=this.numerador*f2.numerador;
        deno=this.denominador*this.denominador;
        f = new Fraccionario(nume,deno);
        return f;
    }
    public Fraccionario division(Fraccionario f2) throws DenominadorCeroException{
        int nume,deno;
        Fraccionario f;
        nume= this.numerador*f2.denominador;
        deno= this.denominador*f2.numerador;
        f = new Fraccionario(nume,deno);
        return f;
                
    }
}
