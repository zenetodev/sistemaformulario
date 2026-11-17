package model.validacao;

public class ErroValidacao {
    private String nomeCampo;
    private String mensagem;
    
    public ErroValidacao(String nomeCampo, String mensagem) {
        this.nomeCampo = nomeCampo;
        this.mensagem = mensagem;
    }

    public String obterDetalhes(){
        return "Nome do Campo: " + getNomeCampo() +
                "\n Mensagem: " + getMensagem(); 
    }

    public String getNomeCampo() {
        return nomeCampo;
    }

    public String getMensagem() {
        return mensagem;
    }

    
}
