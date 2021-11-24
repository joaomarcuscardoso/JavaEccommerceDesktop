package packages;

import java.util.Date;

public class informacaoAdicionais extends Cliente {

    private String rua;
    private int cep;
    private String complemento;
    private String estado;
    private String cidade;
    private int numero;
    
    public informacaoAdicionais(String nome, String sobrenome, String email, String telefone, Date dataNascimento, String cpf) {
        super(nome, sobrenome, email, telefone, dataNascimento, cpf);
    }

    public informacaoAdicionais(String nome, String sobrenome, String email, String telefone, Date dataNascimento, String cpf, String rua, int cep, String complemento, String estado, String cidade, int numero) {
        super(nome, sobrenome, email, telefone, dataNascimento, cpf);
        this.rua = rua;
        this.cep = cep;
        this.complemento = complemento;
        this.estado = estado;
        this.cidade = cidade;
        this.numero = numero;
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

}
