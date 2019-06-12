package GUI;

import sistema.Sistema;

public class GerenciandorTelas {
    private final static GerenciandorTelas gerenciadorTelas = new GerenciandorTelas();
    private final static Sistema sys = new Sistema();
    javax.swing.JFrame telaAtual, telaPrev;
    
    private GerenciandorTelas(){
        
    }
    public static GerenciandorTelas getInstanceOfGerenciadorTealas(){
        return gerenciadorTelas;
    }
    public static Sistema getInstanceOfSistema(){
        return sys;
    }
    public void abrirTelaCadastro(){
        TelaCadastro cad = new TelaCadastro();
        cad.setVisible(true);
        telaPrev = telaAtual;
        telaAtual = cad;
        
    }
    
    public static void main(String[] args) {
        TelaEntrada telaEntrada = new TelaEntrada();
        telaEntrada.setVisible(true);
    }
    
}
