/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Helper {
     public static int mensaje(Component ventana,String info,String titulo,int tipo){
        int retorno = -1;
        switch (tipo){
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo,JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo,JOptionPane.ERROR_MESSAGE);
                break;
            case  3:
                JOptionPane.showInputDialog(ventana, info, titulo, JOptionPane.YES_OPTION);
                break;
                
    }
        return retorno;
    }
}
