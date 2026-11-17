package model;

import java.util.List;

import model.validacao.ErroValidacao;
import model.validacao.RegraValidacao;

public class CampoFormulario {
    private String nome;
    private String rotulo;
    private String valor;
    
    public CampoFormulario(String nome, String rotulo, String valor) {
        this.nome = nome;
        this.rotulo = rotulo;
        this.valor = valor;
    }

    public void definirValor(String novoValor){
        valor = novoValor;
    }

    public String obterValor(){
        return "Valor: " + getValor();
    }

    public void adicionarRegra(RegraValidacao regra){

    }

    public List<ErroValidacao> validarCampo(){
        return 
    }

    public String getNome() {
        return nome;
    }

    public String getRotulo() {
        return rotulo;
    }

    public String getValor() {
        return valor;
    }

    
}
