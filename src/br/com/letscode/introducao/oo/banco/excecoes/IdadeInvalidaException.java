package br.com.letscode.introducao.oo.banco.excecoes;

public class IdadeInvalidaException extends RuntimeException {

    public IdadeInvalidaException(String errorMessage) {
        super(errorMessage);
    }
}
