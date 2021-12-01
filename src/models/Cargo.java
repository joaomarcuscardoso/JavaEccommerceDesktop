/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rfcjo
 */
public class Cargo implements ICargo {
    private String nomeDoCargo;
    private Set<Setor> setor = new HashSet<>();
    private Date inicioDoTurno;
    private Date fimDoTurno;
    
    public Cargo(String nomeDoCargo,  Set<Setor> setor) {
        this.nomeDoCargo = nomeDoCargo;
        this.setor = setor;
    }
    
    @Override
    public String getNomeDoCargo() {
        return this.nomeDoCargo;
    }

    @Override
    public Set<Setor> getSetor() {
        return this.setor;
    }

    @Override
    public Date getInicioDeTurno() {
        return this.inicioDoTurno;
    }

    @Override
    public Date getFimDeTurno() {
        return this.fimDoTurno;
    }

}
