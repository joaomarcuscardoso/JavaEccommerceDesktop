/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.dao;

import br.udesc.prog2.models.positions.Setor;
import java.util.ArrayList;

/**
 *
 * @author rfcjo
 */
public class SetorDAO {
    private static ArrayList<Setor> setores = new ArrayList<Setor>();
    
    public void setSetor() {
        setores.add(new Setor("Produção"));
        setores.add(new Setor("Adminstrativo"));
    }
    
    public ArrayList<Setor> getSetores() {
        return setores;
    }
    
}


