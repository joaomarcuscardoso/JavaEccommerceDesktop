/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

import java.util.Set;

/**
 *
 * @author rfcjo
 */
public class Vendedor extends Cargo {
    private String codigo;
    
    
    public Vendedor(String nomeDoCargo, int privilegios, Set<Setor> setor) {
        super(nomeDoCargo, privilegios, setor);
    }
    public Vendedor(String nomeDoCargo, int privilegios, Set<Setor> setor, String codigo) {
        super(nomeDoCargo, privilegios, setor);
        this.codigo = codigo;
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
    
    
}
