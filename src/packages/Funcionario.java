/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rfcjo
 */
class Funcionario extends Pessoa {
    
    private Map<String, Cargo> cargo = new HashMap<>();
    
    
    public Funcionario(String nome, String sobrenome, String email, String telefone) {
        super(nome, sobrenome, email, telefone);
    }
    public Funcionario(String nome, String sobrenome, String email, String telefone, Map<String, Cargo> cargo) {
        super(nome, sobrenome, email, telefone);
        this.cargo = cargo;
    }
}
