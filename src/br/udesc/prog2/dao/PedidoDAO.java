/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.dao;

import br.udesc.prog2.models.Cliente;
import br.udesc.prog2.models.EStatus;
import br.udesc.prog2.models.Funcionario;
import br.udesc.prog2.models.Pedidos;
import br.udesc.prog2.models.Produto;
import java.util.ArrayList;

/**
 *
 * @author rfcjo
 */
public class PedidoDAO {
   private static Pedidos pedidos;
   
   public void setPedidos(Cliente cliente, ArrayList<Produto> listaProduto, EStatus estatus, Funcionario funcionario) {
       pedidos = new Pedidos(cliente, listaProduto, estatus, funcionario);
   }
   
   
   public Pedidos getPedidos() {
       return pedidos;
   }
   
}
