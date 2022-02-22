/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.controllers.products;

import br.udesc.prog2.views.products.CompraView;

/**
 *
 * @author joaomarcus
 */
public class CompraController {
    private CompraView compraView;
    
    public CompraController(CompraView compraView) {
        this.compraView = compraView;
        exibir();                 
    }
    
    public void exibir(){
        compraView.mostrarTela();
    }
    
}
