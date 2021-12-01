/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author rfcjo
 */
public class Cliente extends Pessoa {
    private Date dataNascimento;
    private String cpf;
    
    public Cliente(String nome, String sobrenome, String email, String telefone) {
        super(nome, sobrenome, email, telefone);
    }
    
    public Cliente(String nome, String sobrenome, String email, String telefone, Date dataNascimento, String cpf) {
        super(nome, sobrenome, email, telefone);
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

   

    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    
    public String getCpf() {
        return this.cpf;
    }
    
}
