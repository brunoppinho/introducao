package br.com.letscode.introducao.oo.banco.model;

/**
 * Define todos os comportamentos comuns dos correntistas
 */
public interface Cliente {

    /**
     * Obtém a conta do cliente
     *
     * @return Conta
     */
    Conta getConta();
}
