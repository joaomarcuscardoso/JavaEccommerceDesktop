/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.errors;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author rfcjo
 */
public class ExceptionEmailExiste extends Exception {

    public ExceptionEmailExiste(String msg) {
        super(msg);
        JOptionPane.showMessageDialog(null, msg);

    }
    
}
