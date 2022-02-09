/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.exceptions;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author rfcjo
 */
public class ExceptionPrecoMenorZero extends Exception {
    public ExceptionPrecoMenorZero(Component view, String msg) {
        super(msg);
        JOptionPane.showMessageDialog(view, msg);   
    }
}
