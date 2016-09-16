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
public class Cafetera {
    
 private int maxima;
    private int actual;

    public Cafetera() {
        this.maxima = 1000;
        this.actual = 0;
    }

    public Cafetera(int maxima, int actual) {
        this.maxima = maxima;
        this.actual = actual;
        if (this.actual > this.maxima) {
            this.actual = this.maxima;
        }
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public void Llenar(int ing) {
        int aux;
        aux = this.getMaxima();
        this.setActual(aux);
    }

    public void Servir(int taza) {
        int aux;
        if (this.getActual() > taza) {
            aux = this.getActual() - taza;
            this.setActual(aux);
        } else {
            aux = this.getMaxima() - this.getActual();
            this.setActual(aux);
        }

    }

    public int Vaciar() {
        int aux;
        aux =actual;
        this.setActual(aux);
        return aux;
    }

    public void AgregarCafe(int ag) {
        int aux;
        aux = this.getActual() + ag;
        this.setActual(aux);

    }

}
