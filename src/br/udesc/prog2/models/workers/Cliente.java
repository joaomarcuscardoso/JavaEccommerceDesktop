/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.workers;

import br.udesc.prog2.models.Pessoa;
import br.udesc.prog2.exceptions.TelefoneInvalidError;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cliente extends Pessoa {
    private Date dataNascimento;
    private String cpf;
    private String rua;
    private int cep;
    private String complemento;
    private String estado;
    private String cidade;
    private int numero;
    
    public Cliente(String nome, String sobrenome, String email, String senha) {
        super(nome, sobrenome, email, senha);
    }
    
    public Cliente(String nome, String sobrenome, String email, String senha, Date dataNascimento, String rua, int cep, String complemento, String estado, String cidade, int numero, String cpf) {
        super(nome, sobrenome, email, senha);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.rua = rua;
        this.cep = cep;
        this.complemento = complemento;
        this.estado = estado;
        this.cidade = cidade;
        this.numero = numero;

    }

   

    public Date getDataNascimento() {
        return dataNascimento;
    }
    
     
    public String getCpf() {
        return this.cpf;
    }
    
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void setTelefone(String telefone) {
        String pattern = "^\\([1-9]{2}\\)(?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$";    
        try {
            
            if (telefone.matches(pattern)) {
                System.out.println("telefone invalido!");
                telefone = telefone;
                System.out.println("telefone: "+telefone);
             } else {
                   System.out.println("telefone valido!");
                   throw new TelefoneInvalidError("O número de telefone não condiz com o padrão (dd)xxxxx-xxxx");
            }
        } catch(TelefoneInvalidError e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
