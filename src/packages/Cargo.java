/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

import java.util.Date;

/**
 *
 * @author rfcjo
 */
public class Cargo implements ICargo {
    private String nomeDoCargo;
    private int privilegios;
    private int salario;
    private boolean disponivel;
    private String setor;
    private Date inicioDoTurno;
    private Date fimDoTurno;
    
    public Cargo(String nomeDoCargo, int privilegios, String setor) {
        this.nomeDoCargo = nomeDoCargo;
        this.privilegios = privilegios;
        this.setor = setor;
    }
    
    @Override
    public String getNomeDoCargo() {
        return this.nomeDoCargo;
    }

    @Override
    public int getPrivilegios() {
        return this.privilegios;
    }

    @Override
    public boolean getDisponivel() {
        return this.disponivel;
    }

    @Override
    public int getSalario() {
        return this.salario;
    }
    
    @Override
    public String getSetor() {
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
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
