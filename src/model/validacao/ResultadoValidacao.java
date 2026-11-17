package model.validacao;

import java.util.List;

public class ResultadoValidacao {
    private Boolean valido;
    private String mensagemRetorno;
    private List<ErroValidacao> listaErroValidacao;
    
    public ResultadoValidacao(Boolean valido, String mensagemRetorno, List<ErroValidacao> listaErroValidacao) {
        this.valido = valido;
        this.mensagemRetorno = mensagemRetorno;
        this.listaErroValidacao = listaErroValidacao;
    }

    public Boolean estaValido(){
        return getValido();
    }

    public void adicionarErro(ErroValidacao erroValidacao){
        listaErroValidacao.add(erroValidacao);
    }

    public List<ErroValidacao> obterErros(){
        return listaErroValidacao;
    }


    public Boolean getValido() {
        return valido;
    }

    public String getMensagemRetorno() {
        return mensagemRetorno;
    }

    public List<ErroValidacao> getListaErroValidacao() {
        return listaErroValidacao;
    }

    
}
