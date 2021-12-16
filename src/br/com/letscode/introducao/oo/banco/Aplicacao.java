package br.com.letscode.introducao.oo.banco;

import br.com.letscode.introducao.oo.banco.model.Cliente;
import br.com.letscode.introducao.oo.banco.model.Gerente;
import br.com.letscode.introducao.oo.banco.model.Pessoa;
import br.com.letscode.introducao.oo.banco.model.TipoConta;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Tio", "Patinhas", 70);
        Pessoa potencialCliente = new Pessoa("Bruno", "Pinho", 18);
        Cliente clientePessoa = gerente.abrirConta(potencialCliente);

        clientePessoa.getConta().setTipo(TipoConta.CC);
        clientePessoa.getConta().saque(BigDecimal.TEN);
        clientePessoa.getConta().deposito(BigDecimal.TEN);
        clientePessoa.getConta().saque(BigDecimal.ONE);
        System.out.println(clientePessoa.getConta());

        System.out.println(clientePessoa);


    }
}
