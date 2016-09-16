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
public class Complejo {
    
private double Real;
    private double I;

    public Complejo(double numeroReal, double numeroI) {
        this.Real = numeroReal;
       
        this.I = numeroI;
       
    }

    public double getNumeroReal() {
        return Real;
    }

    public void setNumeroReal(double numeroReal) {
        this.Real = numeroReal;
    }

    public double getNumeroI() {
        return I;
    }

    public void setNumeroI(double numeroI) {
        this.I = numeroI;
    }
    
    public Complejo Suma(Complejo com2){
        double real, imaginario;
        Complejo c;
        real=this.Real + com2.Real;
        imaginario=this.I + com2.I;
        c= new Complejo (real, imaginario);
        return c;
    }
    public Complejo Resta(Complejo com2){
        double real, imaginario;
        Complejo c;
        real=this.Real - com2.Real;
        imaginario=this.I - com2.I;
        c= new Complejo (real, imaginario);
        return c;
    }
    public Complejo Multiplicacion(Complejo com2){
        double real, imaginario;
        Complejo c;
        real=(this.Real * com2.Real)-(this.I * com2.I);
        imaginario=(this.Real * com2.I) + (this.I * com2.Real);
        c= new Complejo (real, imaginario);
        return c;
    }
    public Complejo Division(Complejo com2){
        double real, imaginario, denominador;
        Complejo c;
        denominador=(com2.Real * com2.Real) + (com2.I * com2.I);
        real=((this.Real * com2.Real)/denominador);
        imaginario=(((this.I * com2.I) + (this.I * com2.Real) - (this.Real * com2.I))/denominador);
        c= new Complejo (real, imaginario);
        return c;
    }

    
}
