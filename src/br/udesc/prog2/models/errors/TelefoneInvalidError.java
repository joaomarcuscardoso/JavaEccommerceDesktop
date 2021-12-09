/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.errors;

/**
 *
 * @author rfcjo
 */
public class TelefoneInvalidError extends Exception {
    public TelefoneInvalidError(String msg) {
        super(msg);
    }
    
}
