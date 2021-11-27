/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

import java.util.Date;
import java.util.Set;

public class Montador extends Cargo {
    private String trabalhoAtual;
    private Date prazo;
    private boolean feito;
    private int qtdTrabalhoPorMes;
    
    public Montador(String nomeDoCargo, int privilegios, Set<Setor> setor) {
        super(nomeDoCargo, privilegios, setor);
    }
    
    public Montador(String nomeDoCargo, int privilegios, Set<Setor> setor, String trabalhoAtual, Date prazo, boolean feito) {
        super(nomeDoCargo, privilegios, setor);
        this.trabalhoAtual = trabalhoAtual;
        this.prazo = prazo;
        this.feito = feito;
    }
    
    public String getTrabalhoAtual() {
     return this.trabalhoAtual;   
    }
    
    public Date getPrazo() {
        return this.prazo;
    }
    
    public boolean getFeito() {
        return this.feito;
    }
    
    public void addQtdTrabalhoPorMes() {
        this.qtdTrabalhoPorMes += 1;
    }
    
    public int getQtdTrabalhoPorMes() {
        return this.qtdTrabalhoPorMes;
    }
}
