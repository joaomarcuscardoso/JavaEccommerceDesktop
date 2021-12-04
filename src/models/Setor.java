/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class Setor {
    private String nomeDoSetor;
    private int metaPorSetor;

    public Setor(String nomeDoSetor) {
        this.nomeDoSetor = nomeDoSetor;
    }

    public Setor(String nomeDoSetor, int metaPorSetor) {
        this.nomeDoSetor = nomeDoSetor;
        this.metaPorSetor = metaPorSetor;
    }

    public String getNomeDoSetor() {
        return nomeDoSetor;
    }

    public void setNomeDoSetor(String nomeDoSetor) {
        this.nomeDoSetor = nomeDoSetor;
    }

    public int getMetaPorSetor() {
        return metaPorSetor;
    }

    public void setMetaPorSetor(int metaPorSetor) {
        this.metaPorSetor = metaPorSetor;
    }
    
}
