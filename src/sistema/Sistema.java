package sistema;
import java.util.ArrayList;

public class Sistema{

    private ArrayList<Pessoa> bancoDeUsuarios;
    private Pessoa usuario;
    private int indexUsuarioLogado;

    public Sistema(ArrayList<Pessoa> bancoUsuarios){
        this.bancoDeUsuarios = bancoUsuarios;
    }

    public Pessoa getUsuario() {
        return usuario;
    }

    public int getIndexUsuarioLogado() {
        return indexUsuarioLogado;
    }

    public void setIndexUsuarioLogado(int indexUsuarioLogado) {
        this.indexUsuarioLogado = indexUsuarioLogado;
    }

    public void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
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

        this.bancoDeUsuarios.forEach(usuario -> {
            if (usuario.getNomeUsuario() == nomeUsuario && usuario.getSenha() == senha) {
                usuario.setAutenticado(false);
                this.setIndexUsuarioLogado(this.bancoDeUsuarios.indexOf(usuario));
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
}