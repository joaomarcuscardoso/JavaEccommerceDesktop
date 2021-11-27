/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

import java.util.Set;


public class Adminstrador extends Cargo {
    
    
    
    public Adminstrador(String nomeDoCargo, int privilegios, Set<Setor> setor) {
        super(nomeDoCargo, privilegios, setor);
    }
}
