/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.controllers.products.pedidos;

import br.udesc.prog2.views.products.CriarProdutoView;
import br.udesc.prog2.views.products.EditarPedidosView;

/**
 *
 * @author joaomarcus
 */
public class EditarPedidosController {
    private EditarPedidosView editarPedidosView;
    
    public EditarPedidosController(EditarPedidosView editarPedidosView) {
        this.editarPedidosView = editarPedidosView;
        exibir();                       
    }
    
    public void exibir(){
        editarPedidosView.mostrarTela();
    }
}
