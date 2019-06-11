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
public class TrocaPecasCelular extends TipoServico{
    
    private String tela;
    private String camera;
    private String placa;

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TrocaPecasCelular(String tela, String camera, String placa, int codigo, String descricao, boolean ativo) {
        super(codigo, descricao, ativo);
        this.tela = tela;
        this.camera = camera;
        this.placa = placa;
    }

    
}
