/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.main;

import br.udesc.prog2.views.accounts.LoginView;
import br.udesc.prog2.controllers.contas.LoginController;

/**
 *
 * @author rfcjo
 */
public class App {
    public static void main(String[] args){
        LoginController loginController = new LoginController(new LoginView());
        loginController.exibir();
    }
    
}
