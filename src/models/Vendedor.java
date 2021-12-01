/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Set;

/**
 *
 * @author rfcjo
 */
public class Vendedor extends Cargo {
    private String codigo;
    
    
    public Vendedor(String nomeDoCargo, Set<Setor> setor) {
        super(nomeDoCargo, setor);
    }
    public Vendedor(String nomeDoCargo, Set<Setor> setor, String codigo) {
        super(nomeDoCargo, setor);
        this.codigo = codigo;
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
    
    
}
