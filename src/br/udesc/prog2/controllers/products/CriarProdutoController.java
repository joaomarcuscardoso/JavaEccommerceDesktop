/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.controllers.products;

import br.udesc.prog2.views.products.CriarProdutoView;

/**
 *
 * @author joaomarcus
 */
public class CriarProdutoController {
    private CriarProdutoView criarProdutoView;
    
    public CriarProdutoController(CriarProdutoView criarProdutoView) {
        this.criarProdutoView = criarProdutoView;
        exibir();                       
    }
    
    public void exibir(){
        criarProdutoView.mostrarTela();
    }
}
