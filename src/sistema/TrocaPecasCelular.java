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

    public TrocaPecasCelular(String tela, String camera, String placa, int codigo, String descricao, boolean ativo) {
        super(codigo, descricao, ativo);
        this.tela = tela;
        this.camera = camera;
        this.placa = placa;
    }

    
}
