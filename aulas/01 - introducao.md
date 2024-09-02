# Introdução

## Java

* Linguagem [orientada a objeto](https://www.devmedia.com.br/os-4-pilares-da-programacao-orientada-a-objetos/9264)
    * Abstração — Representação de um objeto real
        * identidade — Nome e sobrenomes únicos
        * propriedades — Características
        * métodos — Ações
    * Encapsulamento
      * Esconder as propriedades e alguns métodos - Caixa preta
    * Herança
      * Reuso de código
      * Herança de caracteristicas
    * Polimorfismo
      * Reescrita de métodos herdados
* [Fortemente tipada](https://pt.wikipedia.org/wiki/Linguagem_tipada) — Todas as variáveis possuem um tipo e ele não é
  alterado dinamicamente
* Write once, run everywhere
    * JVM
    * Java Garbage Collection
* Releases
    * Cada seis meses
    * Lts: 11, 17, 21

## Hello World

### Configuração

Instalar Java 21. Fonte: https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html

Instalar IDE.

* InteliJ
* 
    * Link para download: https://www.jetbrains.com/idea/download/#section=windows
* Eclipse
    * Link para download: https://www.eclipse.org/downloads/packages/
* Vs Code
    * Link para download: https://code.visualstudio.com/
* Sprint Tools
  * Link para download: https://spring.io/tools

### Primeiro programa

Criar primeiro projeto Criar uma classe

* Criar projeto
* Criar classe principal
* Compilar
* Executar código

Exemplo: [Hello World](/src/br/com/letscode/introducao/base/HelloWorld.java)

### Padrão de nomenclatura

Pacotes devem possuir apenas letras minusculas, sem espaçamento

Cada pacote um diretório

O nome da classe deve seruir padrão CamelCase

Criar método main — Autocomplete do InteliJ

Toda instrução no JAVA termina com ;

## Comentários

Utilizados para adicionar trechos para ajudar na documentação do código e geram trechos que não são
compilados/executados

// e /* */ <BR>
Javadoc <BR>

#### Terminal

`JSHELL` Executar utilizando a linha de comando

`Javac` compila o código

`Java` executa
