package br.udesc.prog2.controllers.contas;


import br.udesc.prog2.controllers.products.ListarProdutosController;
import br.udesc.prog2.controllers.products.pedidos.ControladorListarPedidos;
import br.udesc.prog2.dao.Conta.ContaDAO;
import br.udesc.prog2.dao.Produto.PedidosDAO;
import br.udesc.prog2.dao.Produto.ProdutoDAO;
import br.udesc.prog2.exceptions.ExceptionDadosIncompletos;
import br.udesc.prog2.exceptions.ExceptionUsuarioInvalido;
import br.udesc.prog2.models.Conta;
import br.udesc.prog2.models.products.pedidos.table.PedidoTableModel;
import br.udesc.prog2.models.products.table.ProdutoTableModel;
import br.udesc.prog2.utils.Instance;
import br.udesc.prog2.utils.PegarTodosProdutoParaTableModels;
import br.udesc.prog2.views.accounts.LoginView;
import br.udesc.prog2.views.products.PedidosView;
import br.udesc.prog2.views.products.ProdutoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
