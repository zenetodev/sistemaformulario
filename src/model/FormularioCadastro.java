package model;

import model.validacao.ResultadoValidacao;

public class FormularioCadastro {
    private int id;
    private String mensagemSucesso;
    private Boolean concluido;
    
    public FormularioCadastro(int id, String mensagemSucesso, Boolean concluido) {
        this.id = id;
        this.mensagemSucesso = mensagemSucesso;
        this.concluido = concluido;
    }

    public void adicionarCampo(CampoFormulario campoFormulario){

    }

    public ResultadoValidacao(){
        return 
    }

    public String finalizarCadastro(){
        return "";
    }

    public int getId() {
        return id;
    }

    public String getMensagemSucesso() {
        return mensagemSucesso;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    
}
