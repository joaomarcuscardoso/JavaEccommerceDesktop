/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.ResponseCache;
import java.util.ArrayList;
import java.util.Collections;
import models.Cargo;
import models.Cliente;
import models.EStatus;
import models.Pedidos;
import models.Produto;
import models.Funcionario;
import models.Setor;

/**
 *
 * @author rfcjo
 */
public class App {


    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "Marcus", "rfcjoujou1@gmail.com");
        
        Cliente cliente2 = new Cliente("José", "Antonio", "rfcjoujou1@gmail.com");
        
        cliente.setTelefone("(48) 99111-2601");
        System.out.println(cliente.toString());
        System.out.println(cliente2.toString());
        Produto produto = new Produto("Memoria Ram", "Memoria ram boa", "Memoria", 10, 500, 12);
        Produto produto2 = new Produto("Ryzen 7 3700x", "Processador high End", "Processador", 50, 2300, 52);
        Produto produto3 = new Produto("Coller Xio", "Coller", "Coller", 20, 500, 20);
        ArrayList<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(produto);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
        
        Setor setor = new Setor("Produção");
        
        Cargo cargo = new Cargo(1, "Montador", setor);
        
        Funcionario responsavel = new Funcionario("Roberto", "Machado", "machado@gmail.com", cargo, 0, 0);
        
        Pedidos pedido = new Pedidos(cliente, listaProduto, EStatus.instalado, responsavel);
        System.out.println(pedido.toString());
        
        System.out.println("-------------------------");
        pedido.ordenarProdutosPorNome();
        System.out.println(pedido.toString());
        
        
        
    }
    
}
