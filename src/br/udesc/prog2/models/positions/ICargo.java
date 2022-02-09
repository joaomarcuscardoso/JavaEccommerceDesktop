/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.positions;

import java.util.Date;
import java.util.Set;


public interface ICargo {
    public String getNomeDoCargo();
    public Set<Setor> getSetor();
    public Date getInicioDeTurno();
    public Date getFimDeTurno();
}
