package br.udesc.prog2.controllers.contas;


import br.udesc.prog2.views.accounts.LoginView;

public class LoginController {
    private LoginView loginView;
    
    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        exibir();
    }
    
    public void exibir(){
        loginView.mostrarTela();
    }
    

}
