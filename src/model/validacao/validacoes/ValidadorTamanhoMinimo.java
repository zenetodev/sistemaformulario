package model.validacao.validacoes;

import model.validacao.RegraValidacao;

public class ValidadorTamanhoMinimo extends RegraValidacao{
    private int minimoCaracteres = 8;

    public ValidadorTamanhoMinimo(String mensagemErro) {
        super(mensagemErro);
    }
    
    @Override 
    public Boolean validar(String valor){
        if(valor == null){
            return false;
        }

        String campo = valor.trim();

        if(campo.isEmpty()){
            return false;
        }

        if(campo.length() < getMinimoCaracteres()) {
            return false;
        }

        return true;
    }

    public int getMinimoCaracteres() {
        return minimoCaracteres;
    }
}
