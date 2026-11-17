package model.validacao;

public abstract class RegraValidacao {
    private String mensagemErro;

    public RegraValidacao(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }

    public String obterMensagemErro(){
        return "Erro: " + getMensagemErro();
    }

    public abstract Boolean validar(String valor);
    
    public String getMensagemErro() {
        return mensagemErro;
    }

    
}
