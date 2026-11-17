package model.validacao.validacoes;

import model.validacao.RegraValidacao;

public class ValidadorCPF extends RegraValidacao{

    public ValidadorCPF(String mensagemErro) {
        super(mensagemErro);
    }
    
    @Override
    public Boolean validar(String valor) {
        if (valor == null) {
            return false;
        }

        String cpf = valor.trim().replace(".", "").replace("-", "");

        if (!cpf.matches("\\d{11}") || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        return calcularDigitos(cpf);
    }

    public Boolean calcularDigitos(String cpf) {
        int primeiroDigito = calcularDigito(cpf, 9);
        int segundoDigito = calcularDigito(cpf, 10);

        return primeiroDigito == Character.getNumericValue(cpf.charAt(9))
                && segundoDigito == Character.getNumericValue(cpf.charAt(10));
    }

    private int calcularDigito(String cpf, int quantidadeDigitos) {
        int soma = 0;
        int peso = quantidadeDigitos + 1;

        for (int indice = 0; indice < quantidadeDigitos; indice++) {
            soma += Character.getNumericValue(cpf.charAt(indice)) * peso;
            peso--;
        }

        int resto = soma % 11;
        return resto < 2 ? 0 : 11 - resto;
    }
}
