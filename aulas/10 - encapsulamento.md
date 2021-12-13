# Encapsulamento

É o ato de esconder características e ações de uma classe do mundo externo. O que está sendo escondido é apenas
utilizado internamente na classe para evitar algum acesso indevido a alguma variável/método.

## Modificadores de acesso

[Fonte](http://high5devs.com/2015/02/modificadores-de-acesso-em-java/#:~:text=S%C3%A3o%204%20os%20modificadores%20de,uso%20apenas%20do%20modificador%20public%20.):
Existem quatro modificadores de acesso no Java. São eles:

### `private`

O modificador de acesso private é o mais restritivo modificador de acesso. Todo membro de uma classe definido com o
modificador private só é acessível para a própria classe. Não importa a localização dentro de pacotes ou se a classe foi
herdada ou não, um membro private só é acessível dentro da mesma classe em que ele foi declarado.

### padrão

O modificador de acesso padrão, também conhecido como acessibilidade de pacote, é o modificador atribuído aos membros da
classe que não foram marcados explicitamente com outro modificador de acesso. Membros com acessibilidade de pacote só
podem ser acessados por outras classes ou interfaces definidas dentro do mesmo pacote.

### `protected`

Os membros das classes marcados com o modificador de acesso protected serão acessíveis por classes e interfaces dentro
do mesmo pacote e por classes derivadas mesmo que estejam em pacotes diferentes.

### `public`

Menos restritivo. Qualquer parte de aplicação pode ter acesso ao item marcado.

## Atributos

Por convenções e boas práticas os atributos tendem a ser o mais restritivos possíveis, sendo normalmente lidos/alterados
com a utilização de **getters e setters** que são métodos responsáveis por ler e alterar atributos. Eles existem para
evitar que os atributos sejam alterados de forma indevida podendo ser alterados para valores aonde não fazem sentido
existir. Ex: Uma idade com valor negativo

## Métodos

Métodos mais restritivos são normalmente utilizados para execução de lógica interna da classe. Enquanto os menos
restritivos são os métodos que outras partes do código podem acessar.