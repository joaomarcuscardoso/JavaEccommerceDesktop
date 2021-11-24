/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

/**
 *
 * @author rfcjo
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;

    public Pessoa(String nome, String sobrenome, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }


    public String getSobrenome() {
        return sobrenome;
    }


    public String getEmail() {
        return email;
    }


    public String getTelefone() {
        return telefone;
    }


    
    
}
