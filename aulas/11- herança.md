# Herança

O princípio da Herança no paradigma da POO, permite criar classes com base em outras já existentes e, assim, reutilizar
características e comportamentos entre classes. À classe original chamamos classe-pai (ou superclasse) e, à nova classe,
chamamos classe-filha (ou subclasse).

Toda classe em java herda direta ou indiretamente da classe `Object`.

Em java toda classe só pode ter uma superclasse.

Os atributos e métodos `private` não podem ser acessados por uma classe filha, porém a partir do nível `protected` eles
podem ser acessados.

É possível sobrescrever os métodos da classe pai.

## Regra do "é um"

Herança não é apenas um recurso para "enxugar" nosso código e evitar repetições. Sempre que definimos uma relação de
herança estamos afirmando que um objeto da subclasse também é um objeto da superclasse. De acordo com nosso exemplo
entre Gerente e Empregado, podemos afirmar com certeza que "todo Gerente é um Empregado", porém, sabemos que "um
Empregado não é, necessariamente, um Gerente".

## Exercício

1. Criar uma classe chamada `ClientePessoa` que vai ser uma especialização de `Pessoa` com a adição de um
   atributo `Conta` e os métodos getters e setters.
2. Criar uma classe abstrata chamada `Funcionário` que vai ser uma especialização de `Pessoa`. Ela deve possuir dois
   métodos, um para bater ponto, que deve ser implementado e o outro para trabalhar, que não deve ser implementado.
   Ambos com retorno void.
3. Criar uma classe chamada `Gerente` que vai ser uma especialização de `Funcionário`. Ela deve implementar o método
   trabalhar e também deve possuir um método que vai receber uma pessoa e realizar a abertura da conta para essa pessoa
   devolvendo um `ClientePessoa`.
4. Criar uma classe chamada `FuncionarioRH` que vai ser uma especialização de `Funcionario`. Ela deve implementar o
   método trabalhar e ela vai ter dois métodos com mesmo nome `darAumento` que vai receber em um deles um `Gerente` e no
   outro um
   `FuncionarioRH`. Ele deve imprimir uma mensagem avisando que o funcionário recebeu um aumento.