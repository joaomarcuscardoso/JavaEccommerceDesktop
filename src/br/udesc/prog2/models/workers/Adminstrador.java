package br.udesc.prog2.models.workers;

import br.udesc.prog2.models.positions.Cargo;
import br.udesc.prog2.models.positions.Setor;
import java.util.Set;


public class Adminstrador extends Cargo {
    
    
    
    public Adminstrador(int id, String nomeDoCargo, Setor setor) {
        super(id, nomeDoCargo, setor);
    }
}
