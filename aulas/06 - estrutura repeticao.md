# Estrutura de repetição

São estruturas de códigos responsáveis por executar um mesmo trecho de código repetidas vezes. Essas repetições podem
ser infinitas, determinadas ou indeterminadas.

## `while(condicao)`

Utilizado normalmente em um contexto aonde não se tem um número determinado de iterações

[Exemplo: While Determinado](/src/br/com/letscode/introducao/repeticao/exemplos/WhileDeterminado.java)

[Exemplo: While indeterminado](/src/br/com/letscode/introducao/repeticao/exemplos/WhileIndeterminado.java)

## `for(var;condicao;incremento)`

Utilizados normalmente em um contexto aonde se tem um número determinado de operações.

Possui

1. Declaração da variável de controle
2. Expressão com retorno boolean
3. Passo para controle do for — Altera a variável de controle

[Exemplo](/src/br/com/letscode/introducao/repeticao/exemplos/For.java)

É possível também colocar um for dentro do outro.

[Exemplo](/src/br/com/letscode/introducao/repeticao/exemplos/DualFor.java)

## `Do {} While(...)`

Executa um trecho de código e depois verifica se ele deve continuar executando aquele trecho de código. Diferentemente
do `while` ele executa antes de começar a verificar a condição. Após o primeiro ciclo ele se comporta da mesma forma
do `while`

[Exemplo](/src/br/com/letscode/introducao/repeticao/exemplos/DoWhile.java)

## Exercício

Calcule a média aritmética de n valores a serem digitados.

Seu programa deve pedir para que o usuário digite uma nota de 0 a 10.

Se o valor digitado for -1, seu programa deve efetuar o cálculo da média e imprimir na tela, com a quantidade de notas
digitadas

Se for maior que 10, deve devolver uma mensagem avisando que a nota está inválida e não adicionar na soma.

[Exercício](/src/br/com/letscode/introducao/repeticao/exercicios/Media.java)

## `break`

Interrompe o laço de repetição.

[Exemplo](/src/br/com/letscode/introducao/repeticao/exemplos/Break.java)

## `continue`

Interrompe a iteração atual.

Pode atuar em um loop mais externo caso esse esteja com um rótulo.

[Exemplo](/src/br/com/letscode/introducao/repeticao/exemplos/Continue.java)

## foreach

É um for que ocorre em uma estrutura com vários elementos. Arrays ou Collections

[foreach](07%20-%20arrays%20e%20matrizes.md#foreach)
