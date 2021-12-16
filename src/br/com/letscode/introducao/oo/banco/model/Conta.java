package br.com.letscode.introducao.oo.banco.model;

import java.math.BigDecimal;

/*
Criar dois métodos, um para saque e outro de depósito, aonde o saque vai subtrair o valor do saldo e devolver o valor do saldo resultante.
O método de depósito vai adicionar valor ao saldo e devolver o valor resultante.
Imprimam alguma frase indicando que o saque e o depósito foram feitos.
 */
public class Conta {

    private static int quantidadeContas = 0;

    private final int numeroConta;
    private BigDecimal saldo;
    private TipoConta tipo;

    public Conta() {
        numeroConta = ++quantidadeContas;
        saldo = BigDecimal.ZERO;
        tipo = TipoConta.CP;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * Obtem o número da conta do cliente
     *
     * @return número da conta
     */
    public int getNumeroConta() {
        return this.numeroConta;
    }

    /**
     * Efetua um saque de dinheiro
     *
     * @param valor valor a ser sacado
     * @return Saldo final da conta
     */
    public BigDecimal saque(BigDecimal valor) {
        if (valor.compareTo(saldo) > 0) {
            if (tipo == TipoConta.CC) {
                saldo = saldo.subtract(valor);
                System.out.printf("Foi efetuado um saque no valor de %s. Você está usando %s do cheque especial%n",
                        valor, saldo);

            } else {
                System.err.printf("Não foi possível efetuar um saque no valor de %s. O Saldo de %s é insuficiente%n",
                        valor, saldo);

            }
        } else {
            saldo = saldo.subtract(valor);
            System.out.printf("Foi efetuado um saque no valor de %s. O Saldo resultante é %s%n", valor, saldo);
        }
        return saldo;
    }

    /**
     * Efetua um deposito de dinheiro
     *
     * @param valor valor a ser depositado
     * @return Saldo final da conta
     */
    public BigDecimal deposito(BigDecimal valor) {
        saldo = saldo.add(valor);
        System.out.printf("Foi efetuado um depósito no valor de %s. O Saldo resultante é %s%n", valor, saldo);
        return saldo;
    }

    @Override
    public String toString() {
        return tipo + " numero: " + numeroConta + " e saldo: R$ " + saldo;
    }

}
