/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.main;

import br.udesc.prog2.controllers.products.ListarProdutosController;
import br.udesc.prog2.dao.CargoDAO;
import br.udesc.prog2.dao.ClienteDAO;
import br.udesc.prog2.dao.FuncionarioDAO;
import br.udesc.prog2.dao.PedidoDAO;
import br.udesc.prog2.dao.ProdutoDAO;
import br.udesc.prog2.dao.SetorDAO;
import java.util.ArrayList;
import java.util.Collections;
import br.udesc.prog2.models.positions.Cargo;
import br.udesc.prog2.models.workers.Cliente;
import br.udesc.prog2.models.products.EStatus;
import br.udesc.prog2.models.clients.Pedidos;
import br.udesc.prog2.models.products.Produto;
import br.udesc.prog2.models.workers.Funcionario;
import br.udesc.prog2.models.workers.FuncionarioComparatorNome;
import br.udesc.prog2.models.workers.FuncionarioComparatorPrivilegio;
import br.udesc.prog2.models.positions.Setor;
import br.udesc.prog2.views.products.ProdutoView;
import br.udesc.prog2.models.products.table.ProdutoTableModel;
import java.util.Optional;
import java.sql.Connection;
/**
 *
 * @author rfcjo
 */
public class App {
    public static void main(String[] args){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        ArrayList<Produto> produtos = produtoDAO.getProdutos();
        ListarProdutosController controlador = new ListarProdutosController(new ProdutoView(), new ProdutoTableModel(produtos));
        controlador.exibir();
    }
    
}
