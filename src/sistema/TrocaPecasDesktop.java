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
public class TrocaPecasDesktop extends TipoServico{
    private String memoria;
    private String processador;
    private String fonte;
    private String placaMae;

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

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public TrocaPecasDesktop(String memoria, String processador, String fonte, String placaMae, int codigo, String descricao, boolean ativo) {
        super(codigo, descricao, ativo);
        this.memoria = memoria;
        this.processador = processador;
        this.fonte = fonte;
        this.placaMae = placaMae;
    }

    
    
    
}
