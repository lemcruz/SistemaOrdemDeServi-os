package sistema;

import java.util.ArrayList;

public class Profissional extends Pessoa{
    
    
    ArrayList<TipoServico> servicosPrestados;
    
    
    public Profissional(String nome, String endereco, String email, String telefone, String nomeUsuario, String senha) {
        super(nome, endereco, email, telefone, nomeUsuario, senha);
        this.servicosPrestados = new ArrayList();
    }

    public ArrayList<TipoServico> getServicosPrestados() {
        return servicosPrestados;
    }

    public void setServicosPrestados(ArrayList<TipoServico> servicosPrestados) {
        this.servicosPrestados = servicosPrestados;
    }
    
    
    
}