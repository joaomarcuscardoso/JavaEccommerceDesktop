/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rfcjo
 */
class Funcionario extends Pessoa {
    
    private Map<String, Cargo> cargo = new HashMap<>();
    private int salario;
    // 1 = Montador, 2= Adminstrador
    private int privilegio;
    private boolean disponivel = true;
    
    
    public Funcionario(String nome, String sobrenome, String email, String telefone) {
        super(nome, sobrenome, email, telefone);
    }
    public Funcionario(String nome, String sobrenome, String email, String telefone, Map<String, Cargo> cargo, int salario, int privilegio) {
        super(nome, sobrenome, email, telefone);
        this.cargo = cargo;
        this.salario = salario;
        this.privilegio = privilegio;
    }
    
    
    public int getSalario() {
        return this.salario;
    }
    
    public int getPrivilegio() {
        return this.privilegio;
    }
    
    public boolean getDisponivel() {
         return this.disponivel;   
    }
    public void setDisponivel(boolean disponivel) {
         this.disponivel = disponivel;
    }
    
    
}
