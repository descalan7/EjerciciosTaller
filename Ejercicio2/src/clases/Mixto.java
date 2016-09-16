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
public class Mixto {
    int numerador;
    int denominador;
    int mixto;
    public Mixto(int numerador, int denominador,int mixto) throws DenominadorCeroException{
        this.numerador=numerador;
        this.denominador=denominador;
        this.mixto=mixto;
        if(this.denominador==0){
            throw  new DenominadorCeroException();
        }
    }
    public int getNumerador(){
        return numerador;
    }public void setNumerador(int numerador){
        this.numerador=numerador;
        
    }public int getDenominador(){
        return denominador;
    }public void setDenominador(int denominador){
        this.denominador=denominador;
    }public int getMixto(){
        return mixto;
    }public void setMixto(int mixto){
        this.mixto=mixto;
    }public Mixto Suma(Mixto m2)throws DenominadorCeroException{
        int num,den,mix;
        Mixto m;
        num=this.numerador*m2.denominador+this.denominador*m2.numerador;
        den=this.denominador*m2.denominador;
        mix=this.mixto+m2.mixto;
        m= new Mixto(num,den,mix);
            return m;
        
    }public Mixto Resta(Mixto m2)throws DenominadorCeroException{
        int num1,num2,num3,den3,num,den,den2,mix;
        Mixto m;
        num1=(this.mixto*this.denominador)+this.numerador;
       num2=(m2.mixto*m2.denominador)+m2.numerador;
      
       num3=num1*m2.denominador-num2*this.denominador;
       den3=m2.denominador*this.denominador;
       num=num3%den3;
       den=den3;
       mixto=num3/den;
       m=new Mixto(num,den,mixto);
       return m;
       
      }public Mixto Multiplicacion(Mixto m2)throws DenominadorCeroException{
       int num1,num2,num3,den3,num,den,mix;
       Mixto m;
       num1=(this.mixto*this.denominador)+this.numerador;
       num2=(m2.mixto*m2.denominador)+m2.numerador;
       num3=num1*num2;
       den3=this.denominador*m2.denominador;
       num=num3%den3;
       den=den3;
       mixto=num3/den;
       m=new Mixto(num,den,mixto);
       return m;
      }public Mixto Divicion(Mixto m2)throws DenominadorCeroException{
            int num1,num2,num3,den3,num,den,mix;
        Mixto m;
        num1=(this.mixto*this.denominador)+this.numerador;
       num2=(m2.mixto*m2.denominador)+m2.numerador;
       num3=num1*m2.denominador;
       den3=num2*this.denominador;
       num=num3%den3;
       den=den3;
       mixto=num3/den;
       m=new Mixto(num,den,mixto);
       return m;
      } 
          
      
}
