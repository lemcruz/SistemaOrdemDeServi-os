/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author Samuel Freitas
 */
public class TrocaPecasNotebook {
    
    private String tela;
    private String teclado;
    private String memoria;
    private String processador;
    private String bateria;

    public TrocaPecasNotebook(String tela, String teclado, String memoria, String processador, String bateria) {
        this.tela = tela;
        this.teclado = teclado;
        this.memoria = memoria;
        this.processador = processador;
        this.bateria = bateria;
    }
    
    

    public String getTela() {
        return tela;
    }


    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }
    
    
}
