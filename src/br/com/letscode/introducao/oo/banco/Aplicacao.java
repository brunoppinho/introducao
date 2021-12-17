package br.com.letscode.introducao.oo.banco;

import br.com.letscode.introducao.oo.banco.model.Cliente;
import br.com.letscode.introducao.oo.banco.model.Empresa;
import br.com.letscode.introducao.oo.banco.model.Gerente;
import br.com.letscode.introducao.oo.banco.model.Pessoa;
import br.com.letscode.introducao.oo.banco.model.TipoConta;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Tio", "Patinhas", 70);
        Pessoa potencialClientePessoa = new Pessoa("Bruno", "Pinho", 18);
        Empresa potencialClienteEmpresa = new Empresa("Tabajara", "1231231123123123");

        Cliente clientePessoa = gerente.abrirConta(potencialClientePessoa);
        Cliente clienteEmpresa = gerente.abrirConta(potencialClienteEmpresa);

        efetuaOperacoes(clientePessoa);
        efetuaOperacoes(clienteEmpresa);

    }

    private static void efetuaOperacoes(Cliente cliente) {
        cliente.getConta().setTipo(TipoConta.CC);
        cliente.getConta().saque(BigDecimal.TEN);
        cliente.getConta().deposito(BigDecimal.TEN);
        cliente.getConta().saque(BigDecimal.ONE);
        System.out.println(cliente.getConta());
        System.out.println(cliente);
    }
}
