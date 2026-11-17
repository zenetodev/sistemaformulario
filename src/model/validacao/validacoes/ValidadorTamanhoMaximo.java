package model.validacao.validacoes;

import model.validacao.RegraValidacao;

public class ValidadorTamanhoMaximo extends RegraValidacao{
    private int maximoCaracteres = 100;

    public ValidadorTamanhoMaximo(String mensagemErro) {
        super(mensagemErro);
    }

    @Override 
    public Boolean validar(String valor){
        if(valor == null){
            return false;
        }

        if(valor.length() > getMaximoCaracteres()) {
            return false;
        }

        return true;
    }

    public int getMaximoCaracteres() {
        return maximoCaracteres;
    }

    
}
