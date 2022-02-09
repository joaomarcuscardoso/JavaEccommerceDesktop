/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.dao;

import br.udesc.prog2.models.positions.Cargo;
import br.udesc.prog2.models.positions.Setor;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author rfcjo
 */
public class CargoDAO {
    private ArrayList<Cargo> cargos = new ArrayList<Cargo>();
    
    public void setCargosMontador(Setor setor) {
        Cargo cargoMon = new Cargo(1, "Montador", setor);
    }
    
    public void setCargosAdminstrador(Setor setor) {
        Cargo cargoAdm = new Cargo(2, "Adminstrador", setor);

    }
    
    public ArrayList<Cargo> getCargos() {
        return cargos;
    }
    
    public Cargo getCargosMontador(Setor setor) {
       
        return  new Cargo(1, "Montador", setor);
    }
    
    public Cargo getCargosAdminstrador(Setor setor) {
       
        return new Cargo(2, "Adminstrador", setor);
    }
}
