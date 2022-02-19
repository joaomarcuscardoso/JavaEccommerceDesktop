/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.dao;

import br.udesc.prog2.models.Conta;
import br.udesc.prog2.models.products.EStatus;
import br.udesc.prog2.models.workers.Funcionario;
import br.udesc.prog2.models.clients.Pedidos;
import br.udesc.prog2.models.products.Produto;
import java.util.ArrayList;

/**
 *
 * @author rfcjo
 */
public class PedidoDAO {
   private static Pedidos pedidos;
   
   
   public void setPedidos(Conta conta, ArrayList<Produto> listaProduto, EStatus estatus, Funcionario funcionario) {
       pedidos = new Pedidos(conta, listaProduto, estatus, funcionario);
   }
   
   
   public Pedidos getPedidos() {
       return pedidos;
   }
   
}
