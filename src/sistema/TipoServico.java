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
public class TipoServico {
    
    private int codigo; 
    private String descricao;
    private boolean ativo;
    private double precoCobrado;

    public double getPrecoCobrado() {
        return precoCobrado;
    }

    public void setPrecoCobrado(double precoCobrado) {
        this.precoCobrado = precoCobrado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public TipoServico(int codigo, String descricao, boolean ativo, double precoCobrado) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ativo = ativo;
        this.precoCobrado = precoCobrado;
    }
    
}
