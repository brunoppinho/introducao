package br.com.letscode.introducao.oo.banco.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Conta {

    private static int quantidadeContas = 0;

    private final int numeroConta;
    private BigDecimal saldo;

    public Conta() {
        numeroConta = ++quantidadeContas;
        saldo = BigDecimal.ZERO;
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
            System.err.printf("Não foi possível efetuar um saque no valor de %s. O Saldo de %s é insuficiente%n",
                    valor, saldo);
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
        return "Conta numero: " + numeroConta + " e saldo: R$ " + saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;
        Conta conta = (Conta) o;
        return getNumeroConta() == conta.getNumeroConta() && getSaldo().equals(conta.getSaldo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumeroConta(), getSaldo());
    }
}
