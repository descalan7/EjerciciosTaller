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
public class Cuenta {
    private long interes_anual;
    private long numero_identificacion;
    private double saldo_actual;

    public Cuenta(long interes_anual, long numero_identificacion, double saldo_actual) {
        this. interes_anual= interes_anual;
        this.numero_identificacion = numero_identificacion;
        this.saldo_actual = saldo_actual;
    }

    public long getInteresanual() {
        return interes_anual;
    }

    public void setInteres_anual(long interes_anual) {
        this.interes_anual = interes_anual;
    }

    public long getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(long numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }
    

public void actulizarSaldo(double ian){
        double aux, aux2;
        aux = this.getSaldo_actual()*(ian/365);
        aux2 = this.getSaldo_actual() + aux;
        this.setSaldo_actual(aux2);
    }
    
   public void ingresar(double ingreso){
       double aux;
       aux=this.getSaldo_actual()+ingreso;
       this.setSaldo_actual(aux);
   }
   
   public void retirar(double egreso){
       double aux;
       if(this.getSaldo_actual()<egreso){
           Helper.mensaje(null,"el monto a retirar no puede ser mayor a el monto acumulado","error", 1);
       }else{
       aux = this.getSaldo_actual() - egreso;
       this.setSaldo_actual(aux);    
       }
       
       
   }
   
   public String mostrar(){
       String aux;
       aux = "El interés anual es: "+this.getInteresanual()+"\n"
           + "No. de Identificación: "+this.getNumero_identificacion()+"\n"
           + "Saldo Actual: "+this.getSaldo_actual();
        return aux;
              
   }
    
    
    
}
