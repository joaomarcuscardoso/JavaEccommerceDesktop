/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.controllers.contas;

import br.udesc.prog2.views.accounts.RegistrarView;

/**
 *
 * @author joaomarcus
 */
public class RegistrarController {
    private RegistrarView registrarView;
    
    public RegistrarController(RegistrarView registrarView) {
        this.registrarView = registrarView;
        exibir();               
    }
    
    public void exibir(){
        registrarView.mostrarTela();
    }
    
}
