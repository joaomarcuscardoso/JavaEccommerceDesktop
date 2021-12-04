/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author rfcjo
 */
public class Vendedor extends Cargo {
    private String codigo;
    
    
    public Vendedor(int id, String nomeDoCargo, Setor setor) {
        super(id, nomeDoCargo, setor);
    }
    public Vendedor(int id, String nomeDoCargo, Setor setor, String codigo) {
        super(id, nomeDoCargo, setor);
        this.codigo = codigo;
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
    
    
}
