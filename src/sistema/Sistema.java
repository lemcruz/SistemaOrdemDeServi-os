package sistema;
import java.util.ArrayList;

public class Sistema{
    
    private ArrayList<Servico> bancoDeServicos;
    private ArrayList<Pessoa> bancoDeUsuarios;
    private int indexUsuarioLogado;

    public Sistema(ArrayList<Pessoa> bancoUsuarios){
        this.bancoDeUsuarios = bancoUsuarios;
    }

    public int getIndexUsuarioLogado() {
        return indexUsuarioLogado;
    }

    public void setIndexUsuarioLogado(int indexUsuarioLogado) {
        this.indexUsuarioLogado = indexUsuarioLogado;
    }

    public void login(String nomeUsuario, String senha) {

        this.bancoDeUsuarios.forEach(usuario -> {
            if (usuario.getNomeUsuario() == nomeUsuario && usuario.getSenha() == senha) {
                usuario.setAutenticado(true);
                this.setIndexUsuarioLogado(this.bancoDeUsuarios.indexOf(usuario));
            }
        });
    }

    public void logoff(String nomeUsuario, String senha) {

        this.bancoDeUsuarios.forEach(u -> {
            if (u.getNomeUsuario().equals(nomeUsuario) && u.getSenha().equals(senha)) {
                u.setAutenticado(false);
                this.setIndexUsuarioLogado(this.bancoDeUsuarios.indexOf(u));
            }
        });

    }

    public void cadastraAdmin(String nome, String endereco, String email, String telefone, String nomeUsuario, String senha){

        if(this.bancoDeUsuarios.get(this.indexUsuarioLogado).isAutenticado()){
            if(this.bancoDeUsuarios.get(this.indexUsuarioLogado) instanceof Administrador){
                this.bancoDeUsuarios.add(new Administrador(nome, endereco, email, telefone, nomeUsuario, senha));
            }
            else{
                System.out.println("Usuario não possui as permissoes de administrador. ");
            }
        }
        else{
            System.out.println("Usuario não autenticado. ");
        }
    }

    public void cadastraProfissional(String nome, String endereco, String email, String telefone, String nomeUsuario, String senha){

        if(this.bancoDeUsuarios.get(this.indexUsuarioLogado).isAutenticado()){
                this.bancoDeUsuarios.add(new Profissional(nome, endereco, email, telefone, nomeUsuario, senha));
        }
        else{
            System.out.println("Usuario não autenticado. ");
        }

    }

    public void cadastraCliente(String nome, String endereco, String email, String telefone, String nomeUsuario, String senha){

        if(this.bancoDeUsuarios.get(this.indexUsuarioLogado).isAutenticado()){
            this.bancoDeUsuarios.add(new Cliente(nome, endereco, email, telefone, nomeUsuario, senha));
        }
        else{
            System.out.println("Usuario não autenticado. ");
        }

    }
    
    public void listarUsuarios(){

        this.bancoDeUsuarios.forEach(usuario -> {
            System.out.println("Login usuario: " + usuario.getNomeUsuario() + " Tipo usuario: " + usuario.getClass().getName());
        });

    }
    
    public void cadastrarServico(Servico s){
        if(this.bancoDeUsuarios.get(this.indexUsuarioLogado).isAutenticado()){
            this.bancoDeServicos.add(s);
        }
        else{
            System.out.println("Usuario não autenticado. ");
        }
    }
}