# Exceções

O termo em Java é Exception, isto é, um pseudônimo para "exceptional event (fluxo de exceção). São objetos que contém
informações acerca do tipo e do estado do sistema quando um erro ocorre. Quando uma instância desse tipo de objeto é
criada, chamamos "throwing an exception" (lançar uma exceção).

Quando uma exceção é lançada, o ambiente de execução procura por um bloco de código específico que consiga lidar com a
exceção. A partir do ponto onde ocorreu o erro, o sistema retroage até o ponto mais inicial da aplicação buscando por
este código de tratamento. A este encadeamento, chamamos stack e o tal bloco de exception handler, demarcado com o uso
da palavra-chave `catch`.

Tanto as exceções quanto os erros são especializações de `Throwable`

**Evitem utilizar a programação orientada a exceção**

## Tipos

### Checked

As exceções do tipo checked forçam o usuário a realizar algum tratamento os trechos aonde ela pode ser enviada. Com isso
o desenvolvedor não consegue ignorar a não ser que ele reenvie para que o próximo método faça o tratamento.

Normalmente checked exceptions são utilizadas para erros recuperáveis.

### Unchecked

Essas exceções não obrigam o desenvolvedor a trata-las.

### Error

`Error` é uma subclasse de `Throwable` que indica problemas mais sérios que a aplicação não consegue tratar.

[FONTE](https://docs.oracle.com/javase/7/docs/api/java/lang/Error.html)

## Tratamento

Há algumas duas formas de lidar com uma exceção.

* Tratar
* Reenviar

[Exemplo](/src/br/com/letscode/introducao/base/exceptions/exemplos/ExemploExcecao.java)

### Tratamento

```java
public class Exemplo {

    public static void main(String[] args) {
        try {
            // Código que pode gerar a exceção
        } catch (Exception e) {
            // Tratamento da exceção
        } finally {
            // Código que SEMPRE executa
        }
    }
}
```

#### `try`

Bloco que protege o código, aonde que toda a exceção gerada nesse trecho pode ser tratada caso tenha um catch associado
a ela.

#### `catch`

Trecho aonde é possível capturar uma determinada exceção e dar um tratamento adequado.

#### `finally`

Trecho de código que será sempre executado no final, independente se a exceção for ou não gerada.

**Exercício**: Criar um programa que vai receber um inteiro e falar se ele é par ou ímpar, e depois vai imprimir o
resultado de `1/n =`. O programa deve ser capaz de se proteger da exceção `InputMismatchException` e ao final do
programa ele deve fechar o Scanner.
[Exercício](/src/br/com/letscode/introducao/base/exceptions/exercicios/TryResources.java)

### `throws`

Devolver a exceção para o método que chamou ela tratar.

```java
public class Exemplo {

    public void metodo() throws Exception {
        // Código que pode gerar a exceção
    }
}
```

### try with resources

Sempre que for necessário abrir um recurso é necessário fecha-lo ao final de sua utilização. Nesse caso ele sempre será
fechado mesmo que uma exceção seja lançada no meio do código;¶

```java
import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Código que pode gerar a exceção
        } catch (Exception e) {
            // Tratamento da exceção
        }
    }
}
```

[Fonte](https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html)

**Exercício:** Adaptar o programa anterior para utilizar o try with resources.
[Exercício](/src/br/com/letscode/introducao/base/exceptions/exercicios/TryResources.java)
