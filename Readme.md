<h1 align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Righteous&size=40&duration=4000&pause=1000&color=0098D1&center=true&vCenter=true&random=false&width=435&lines=🔎+Estudos+de+Java!!!;" />
</h1>

<h2 align="center">
  <img src="https://media1.tenor.com/m/xv-8Q_TJne4AAAAC/java.gif"/>
</h2>

</br> 

<p align="center">
  🚀 Bem-vindo ao meu repositório dedicado aos estudos em Orientação a Objetos com Java! Aqui, compartilho minha jornada de aprendizado por meio de um desafio de 100 dias, onde me comprometo a programar diariamente e aprofundar meus conhecimentos em POO. Este espaço será constantemente atualizado com novos projetos, exemplos e insights, então fique à vontade para acompanhar minha evolução. 💻✨
</p>


</br>

<h1 align="center"> 🍀 Dia 1 </h1>

<h2>🎓 Introdução à Tecnologia de Objetos </h2>

Hoje, como a demanda por software novo e mais poderoso está aumentando, construir softwares de maneira rápida, correta e econômica continua a ser um objetivo indefinido. Objetos ou, mais precisamente, as classes de onde os objetos vêm são essencialmente componentes reutilizáveis de software. Há objetos data, objetos data/hora, objetos áudio, objetos vídeo, objetos automóvel, objetos pessoas etc. Quase qualquer substantivo pode ser razoavelmente representado como um objeto de software em termos dos atributos (por exemplo, nome, cor e tamanho) e comportamentos (por exemplo, calcular, mover e comunicar). Grupos de desenvolvimento de software podem usar uma abordagem modular de projeto e implementação orientados a objetos para que sejam muito mais produtivos do que com as técnicas anteriormente populares como “programação estruturada” — programas orientados a objetos são muitas vezes mais fáceis de entender, corrigir e modificar.

</br>

<h2>🚘 O Automóvel como um Objeto </h2>

- **Analogia com Carro:**
  - Para facilitar a compreensão de objetos e seus conteúdos, vamos usar uma analogia com um carro.
  - Imagine que você queira dirigir um carro e acelerá-lo pisando no pedal do acelerador.

- **Projeto do Carro:**
  - Antes de ser possível dirigir um carro, ele precisa ser projetado.
  - Um carro começa como desenhos de engenharia, semelhantes a plantas que descrevem o projeto de uma casa.
  - Esses desenhos incluem o projeto do pedal do acelerador.

- **Ocultação dos Mecanismos:**
  - Assim como o pedal do acelerador esconde do motorista os mecanismos que fazem o carro ir mais rápido, outros componentes como o pedal de freio e a direção também ocultam seus mecanismos.
  - Isso torna possível para pessoas com pouco conhecimento técnico dirigirem um carro facilmente.

- **Construção do Carro:**
  - Antes de ser possível dirigir um carro, ele precisa ser construído a partir dos desenhos de engenharia que o descrevem.
  - Um carro pronto tem um pedal de acelerador real para fazê-lo andar mais rápido.
  - No entanto, o carro não acelerará por conta própria; o motorista deve pressionar o pedal do acelerador.

</br> 

<h2>🔗 Métodos e Classes</h2>

- **Classes:**
  - Em Java, as classes são a base da programação orientada a objetos (POO).
  - Uma classe é um modelo ou um plano para criar objetos.
  - Define os atributos e comportamentos comuns que os objetos compartilham.
  - Exemplo: uma classe `Carro` pode ter atributos como `marca`, `modelo` e `cor`, e métodos como `ligar()`, `desligar()` e `acelerar()`.

- **Métodos:**
  - Os métodos em Java são funções ou procedimentos associados a uma classe.
  - Definem o comportamento dos objetos criados a partir dessa classe.
  - Podem realizar operações, acessar ou modificar atributos e interagir com outros objetos.
  - Encapsulam a lógica de como um objeto deve se comportar e interagir com o mundo exterior.
  - Exemplo: um método `ligar()` na classe `Carro` muda o estado do carro de desligado para ligado.

- **Combinação de Classes e Métodos:**
  - Permite a criação de código modular e reutilizável.
  - As classes definem a estrutura e o comportamento dos objetos.
  - Os métodos encapsulam a funcionalidade específica.
  - Promove a organização do código, facilitando a manutenção e a extensão do sistema.


<h2> 💻 Exercício</h2>

### ➡️ Pasta "Classes"

Esta pasta contém o seguinte programa Java:

### Programa de Cálculo de Área de Triângulos

O arquivo `Program.java` é um programa Java que calcula a área de dois triângulos e determina qual deles tem a maior área. O programa consiste em duas classes:

1. **Classe `Program`**:
   - Esta classe é a classe principal do programa e contém o método `main`, que é o ponto de entrada do programa.
   - No método `main`, são realizadas as seguintes operações:
     - Configuração do local padrão para formatação de números.
     - Criação de um objeto `Scanner` para receber entrada do usuário.
     - Declaração de dois objetos `Triangle` para representar os triângulos.
     - Solicitação ao usuário para inserir as medidas dos lados dos triângulos.
     - Cálculo das áreas dos triângulos e determinação do triângulo com a maior área.
     - Impressão das áreas dos triângulos e da mensagem indicando qual tem a maior área.

2. **Classe `Triangle`**:
   - Esta classe define a estrutura de um triângulo com três atributos para os comprimentos dos lados (`a`, `b` e `c`).
   - Possui um método `area()` que calcula a área do triângulo usando a fórmula de Herão.

- O programa é estruturado em pacotes: o pacote `application` contém a classe `Program`, e o pacote `entities` contém a classe `Triangle`.

- Esse foi um exercício feito para colocar em prática os conceitos de `Classes`  e `Métodos` .

 ---
</br>
 
<h1 align="center"> 🍀 Dia 2 </h1>

## 🔗 Parâmetros e Argumentos

Em orientação a objetos, "parâmetros" e "argumentos" são termos frequentemente usados em conjunto, mas referem-se a conceitos diferentes.

1. **Parâmetros**: São variáveis definidas na declaração de um método ou função. Eles servem como marcadores de posição para os valores que serão passados quando o método ou função for chamado. Os parâmetros definem quais tipos de valores uma função espera receber e como esses valores serão usados dentro dela.

   Exemplo:
   ```java
   public class Exemplo {
       // Método que recebe dois parâmetros e retorna a soma
       public static int soma(int a, int b) {
           return a + b;
       }

       public static void main(String[] args) {
           // Chamando o método soma e passando os argumentos 3 e 5
           int resultado = soma(3, 5);
           System.out.println("Resultado da soma: " + resultado);
       }
   }
   ```

   Neste exemplo, temos um método chamado `soma` que recebe dois parâmetros `a` e `b`, e retorna a soma desses dois parâmetros. No método `main`, estamos chamando o método `soma` e passando os argumentos `3` e `5`. Quando o método é chamado com esses argumentos, `a` será igual a `3` e `b` será igual a `5`. O resultado da soma será impresso no console.

3. **Argumentos**: São os valores reais que são passados para uma função ou método quando ele é chamado. Eles preenchem os parâmetros definidos na declaração da função. Em outras palavras, são os valores que você fornece para que a função os utilize durante sua execução.

   Exemplo:
   ```java
   public class Exemplo {
       // Método que recebe dois parâmetros e retorna a soma
       public static int soma(int a, int b) {
           return a + b;
       }

       public static void main(String[] args) {
           // Chamando o método soma e passando os argumentos 3 e 5
           int resultado = soma(3, 5);
           System.out.println("Resultado da soma: " + resultado);
       }
   }
   ```

   Neste exemplo, temos um método chamado `soma` que recebe dois parâmetros `a` e `b`, e retorna a soma desses dois parâmetros. No método `main`, estamos chamando o método `soma` e passando os argumentos `3` e `5`. Quando o método é chamado com esses argumentos, `a` será igual a `3` e `b` será igual a `5`. O resultado da soma será impresso no console.

Resumindo, os parâmetros são as variáveis na declaração de uma função que definem quais valores ela espera receber, enquanto os argumentos são os valores reais fornecidos quando a função é chamada para preencher esses parâmetros.

 
<h2> 💻 Exercício</h2>

### ➡️ Pasta "Classes2"

Esta pasta contém o seguinte programa Java:

### Programa de Controle de Produtos

1. **Classe Program:**
   - Esta é a classe principal do programa, contendo o método `main` como ponto de entrada.
   - No método `main`, as seguintes operações são realizadas:
     - Configuração do local padrão para formatação de números decimais para o estilo dos EUA.
     - Criação de um objeto `Scanner` para receber entrada do usuário.
     - Criação de um objeto `Product` para representar o produto inserido pelo usuário.
     - Solicitação ao usuário para inserir os dados do produto, incluindo nome, preço e quantidade em estoque.
     - Exibição dos detalhes do produto utilizando o método `toString()` da classe `Product`.
     - Fechamento do objeto `Scanner` para liberar os recursos.

2. **Classe Product:**
   - Esta classe representa um produto com três atributos: `name` (nome), `price` (preço) e `quantity` (quantidade em estoque).
   - Possui métodos para calcular o valor total em estoque do produto (`totalValueInStock()`), adicionar produtos ao estoque (`addProducts()`) e remover produtos do estoque (`removeProducts()`).
   - O método `toString()` é sobrescrito para fornecer uma representação personalizada do objeto `Product`, exibindo o nome, preço, quantidade em estoque e o valor total em estoque formatado.

O programa é organizado em dois arquivos Java, onde a classe `Program` está no pacote `application` e a classe `Product` está no pacote `entities`.

