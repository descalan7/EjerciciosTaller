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
public class DenominadorCeroException extends Exception {

    public DenominadorCeroException() {
        super("El denominador no puede ser cero");
    }
    
}
