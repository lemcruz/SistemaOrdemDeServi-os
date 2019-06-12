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
public class Servico {
    
    private TipoServico tipo;
    private Status status;
    

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Servico(int codigo, String descricao, boolean ativo, Status status) {
        this.status = status;
    }   
}
