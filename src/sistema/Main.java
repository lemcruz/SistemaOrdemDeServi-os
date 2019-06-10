package sistema;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){

        Administrador adminMaster = new Administrador("Samuel", "Rua 123", "srfreitas97@", "994790716", "sarra97", "pass");
        ArrayList<Pessoa> bancoUsuarios = new ArrayList<>();
        bancoUsuarios.add(adminMaster);
        Sistema sys = new Sistema(bancoUsuarios);
        //sys.listarUsuarios();
        sys.login("sarra97", "pass");
        sys.cadastraCliente("Lucas", "Rua 3", "zeComedia@", "987654321", "zeComedia", "lek");
        sys.listarUsuarios();
        sys.logoff("sarra97", "pass");
        sys.login("zeComedia", "lek");
        sys.cadastraAdmin("Brunao", "Rua 5", "bruno3145@", "1234567890", "burno3145", "opa");
    }
}