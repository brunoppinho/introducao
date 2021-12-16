# Introdução

Os códigos já estão começando a ficar muito grande para uma classe só. E também tivemos alguns casos de repetição de
código. Até o momento o principal poder da linguagem Java, a orientação a objetos ainda não está sendo utilizada. A
partir de agora iremos separar os pedaços de códigos que possuem relação entre si nas classes.

# Classes

Classe é um conjunto de regras que contém todas as definições necessárias para a criação de objetos. Ela contém todos os
atributos e métodos que um objeto deve ter. Ela pode ser comparada como a planta de uma casa, necessária para a execução
da obra, que seria a criação de uma casa.

# Objetos

Objeto é a instância da classe. É quando uma classe foi criada e se tornou um objeto na memória contendo as definições
da classe e o seu atual estado. Cada objeto se diferencia dos demais objetos da mesma classe pela sua posição aonde o
mesmo está sendo armazenado e também pelos seus valores de variáveis.

# Métodos

É aonde ocorre a manipulação dos dados e execução de comandos.

Uma classe pode possuir diversos métodos para executar lógicas complexas ou para simplesmente ler/alterar valor de suas
variáveis.

## Construtor

Uma classe pode ter vários construtores com atributos diferentes. Significando que para criar um objeto daquela classe
pode ser possível passar valores/atributos diferentes.

**O caso de vários métodos com diferentes argumentos chama-se sobrecarga de métodos.**

Por padrão toda classe quando criada possui como construtor padrão um que não recebe nenhum argumento. Caso seja criado
algum outro construtor, esse construtor padrão deixa de existir, sendo necessário cria-lo caso haja necessidade.

No caso de herança pode-se chamar o construtor da classe pai por meio do método `super`

Toda classe do Java deriva-se da classe `Object`. Assunto que será abordado novamente na parte de herança.

[Para aprofundar](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)

## `toString`

Método herdado da classe `Object` responsável pela transformação do objeto em uma `String`

[Para aprofundar](https://www.devmedia.com.br/como-criar-sobreposicoes-usando-o-metodo-tostring-em-java/29042)

## `equals` e `hashCode`

Métodos herdados do `Object` para fazer a comparação entre dois objetos.

[Para aprofundar](https://www.baeldung.com/java-equals-hashcode-contracts)

# Atributos

São as variáveis e constantes armazenadas no objeto.

No caso de um atributo com o modificador `static` ele será compartilhado por todos os objetos da classe, sendo assim se
um deles alterar seu valor ele será alterado para todos. O acesso a esse atributo pode acontecer por meio da definição
da classe ao invés de utilizar o objeto instanciado.

# Exercícios

Criar dois métodos, um para saque e outro de depósito, aonde o saque vai subtrair o valor do saldo e devolver o valor do
saldo resultante. O método de depósito vai adicionar valor ao saldo e devolver o valor resultante. Imprimam alguma frase
indicando que o saque e o depósito foram feitos.