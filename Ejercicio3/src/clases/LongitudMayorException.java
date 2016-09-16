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
public class LongitudMayorException extends Exception {
    public LongitudMayorException(){
        super("La longitud no puede ser mayor a 8 caracteres");
    }
}
