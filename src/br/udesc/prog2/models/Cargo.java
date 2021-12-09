/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Cargo implements ICargo {
    private int id;
    private String nomeDoCargo;
    private Set<Setor> setor = new HashSet<>();
    private Date inicioDoTurno;
    private Date fimDoTurno;
    
    public Cargo( int id, String nomeDoCargo,  Setor setor) {
        this.id= id;
        this.nomeDoCargo = nomeDoCargo;
        this.setor.add(setor);
    }
    
    
    public int getId() {
        return this.id;
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

    @Override
    public String toString() {
        return "Cargo{" + "id=" + id + ", nomeDoCargo=" + nomeDoCargo + ", setor=" + setor + ", inicioDoTurno=" + inicioDoTurno + ", fimDoTurno=" + fimDoTurno + '}';
    }
    
    

}
