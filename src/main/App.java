/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import models.Cargo;
import models.Cliente;
import models.EStatus;
import models.Pedidos;
import models.Produto;
import models.Funcionario;
import models.FuncionarioComparatorNome;
import models.FuncionarioComparatorPrivilegio;
import models.Setor;

/**
 *
 * @author rfcjo
 */
public class App {


    public static void main(String[] args) {
        // Cliente
        Cliente cliente = new Cliente("João", "Marcus", "rfcjoujou1@gmail.com");
        Cliente cliente2 = new Cliente("José", "Antonio", "rfcjoujou1@gmail.com");
        
        cliente.setTelefone("(48) 99111-2601");
        //System.out.println(cliente.toString());
        //System.out.println(cliente2.toString());
        
        // Produtos
        Produto produto = new Produto("Memoria Ram", "Memoria ram boa", "Memoria", 10, 500, 12);
        Produto produto2 = new Produto("Ryzen 7 3700x", "Processador high End", "Processador", 50, 2300, 52);
        Produto produto3 = new Produto("Coller Xio", "Coller", "Coller", 20, 500, 20);
        
        ArrayList<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(produto);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
        
        
        // Setor
        Setor setor = new Setor("Produção");
        Setor setor2 = new Setor("Adminstrativo");

        // Cargo
        Cargo cargoMon = new Cargo(1, "Montador", setor);
        Cargo cargoAdm = new Cargo(2, "Adminstrador", setor2);
        
        
        
        // Funcionario
        ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
        Funcionario montador = new Funcionario("Roberto", "Machado", "machado@gmail.com", cargoMon, 0, 1);
        Funcionario adminstrador = new Funcionario("Carlos", "Silva", "silvao@gmail.com", cargoAdm, 0, 2);
        Funcionario adminstrador2 = new Funcionario("ADebora", "Souza", "souza@gmail.com", cargoAdm, 0, 2);
        Funcionario montador2 = new Funcionario("Antonio", "Silveira", "silveirinha@gmail.com", cargoMon, 0, 1);
        
        listaFuncionario.add(montador);
        listaFuncionario.add(adminstrador2);
        listaFuncionario.add(montador2);
        listaFuncionario.add(adminstrador);
        
        Collections.sort(listaFuncionario, new FuncionarioComparatorNome());
        System.out.println("Lista De Funcionario ordenada por Nome: \n"+listaFuncionario);
        
        Collections.sort(listaFuncionario, new FuncionarioComparatorPrivilegio());
        
        System.out.println("Lista De Funcionario ordenada por privilegio: \n"+listaFuncionario);
        
        // Pedido
        Pedidos pedido = new Pedidos(cliente, listaProduto, EStatus.instalado, montador);
        System.out.println("Pedidos: "+pedido.toString());
        
        System.out.println("-------------------------");
        pedido.ordenarProdutosPorNome();
        System.out.println("Ordenador por nome:\n"+pedido.toString());
        
        
        
    }
    
}
