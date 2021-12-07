/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.errors;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author rfcjo
 */
public class ExceptionEmailExiste extends Exception {

    public ExceptionEmailExiste(Component view, String msg) {
        super(msg);
        JOptionPane.showMessageDialog(view, msg);

    }
    
}
