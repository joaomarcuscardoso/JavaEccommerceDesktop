/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.products;

import br.udesc.prog2.models.positions.Setor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Estoque {
    private Map<String, Produto> produtos = new HashMap<String, Produto>();
    private Set<Setor> setor = new HashSet<>();

    public Estoque(HashMap<String, Produto> produtos, HashSet<Setor> setor) {
        this.produtos = produtos;
        this.setor = setor;
    }


    
}
