package sistema;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String nomeUsuario;
    private String senha;
    private boolean autenticado;

    public Pessoa(String nome, String endereco, String email, String telefone, String nomeUsuario, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.autenticado = false;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }   
    @Override
    public String toString(){
        return "nome : " + this.nome + "\nUser : " + 
                this.nomeUsuario;
    }
    
}
