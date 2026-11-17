package model.validacao.validacoes;

import model.validacao.RegraValidacao;

public class ValidadorObrigatorio extends RegraValidacao{

    public ValidadorObrigatorio(String mensagemErro) {
        super(mensagemErro);
    }
    
    @Override 
    public Boolean validar(String valor){
        if(valor == null) {
            return false;
        } 

        String campos = valor.trim();

        if(campos.isEmpty()){
            return false;
        }

        return true;
    }
}
