/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

import java.util.Date;
import java.util.Set;

/**
 *
 * @author rfcjo
 */
public interface ICargo {
    
    public String getNomeDoCargo();
    public int getPrivilegios();
    public boolean getDisponivel();
    public void setDisponivel(boolean disponivel);
    public int getSalario();
    public Set<Setor> getSetor();
    public Date getInicioDeTurno();
    public Date getFimDeTurno();

    
}
