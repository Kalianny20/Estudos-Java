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

<h2> 🔗 Métodos e Classes</h2>

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

</br>

## 🔗 Método toString()
- O método `toString` em Java é essencial para criar representações textuais de objetos.
- Toda classe em Java é automaticamente uma filha da classe `Object`, que possui o método `toString`.
- A implementação padrão de `toString` em `Object` retorna "nomeDaClasse@endereçoNaMemória".
- É possível personalizar a representação textual de um objeto ao sobrescrever o método `toString`.
- Por exemplo, ao sobrescrever `toString` na classe `Pessoa`, podemos retornar uma representação que inclui CPF e nome.
- Isso oferece flexibilidade para controlar como os objetos são representados textualmente.
- `toString` facilita a depuração e a compreensão do código, fornecendo uma representação legível do objeto em forma de texto.

    Exemplo:
    ```java
    public class Pessoa {
    private String nome;
    private String cpf;

    // Construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Sobrescrevendo o método toString para personalizar a representação textual
    @Override
    public String toString() {
        return "Pessoa{ nome='" + nome + "', cpf='" + cpf + "' }";
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", "123.456.789-10");
        
        // Imprimindo a instância da classe Pessoa
        System.out.println(pessoa);
    }
}


Neste exemplo, a classe `Pessoa` possui dois atributos: `nome` e `cpf`. O método `toString` é sobrescrito para retornar uma representação personalizada da pessoa, incluindo o nome e o CPF. Ao criar uma instância da classe `Pessoa` e imprimir essa instância, o método `toString` personalizado é chamado automaticamente, fornecendo uma representação textual mais útil da pessoa.

---
</br>
 
<h1 align="center"> 🍀 Dia 3 </h1>

<h2> 💻 Exercícios</h2>

### ➡️ Pasta Rectangle

Nessa aula, foram abordados:

1. **Classes e Objetos**: A definição da classe `Rectangle` representa um modelo para criar objetos retângulo. A instância dessa classe (`rectangle`) é utilizada para realizar cálculos e armazenar dados.

2. **Encapsulamento**: Os membros de dados (`width` e `height`) da classe `Rectangle` foram declarados como públicos para simplificar o exemplo, mas em aplicações reais, é uma boa prática encapsular esses membros, tornando-os privados e fornecendo métodos públicos para acessá-los e modificá-los.

3. **Métodos**: Os métodos na classe `Rectangle` (`area()`, `perimeter()`, `diagonal()`) realizam cálculos específicos com os dados do retângulo. Isso promove o reúso de código e a organização das funcionalidades.

4. **Entrada de Dados**: O uso da classe `Scanner` para obter entrada do usuário via teclado.

5. **Saída Formatada**: A formatação da saída usando o método `String.format()` para garantir que os resultados sejam exibidos de maneira clara e legível.

6. **Utilização de Bibliotecas Padrão**: O uso da classe `Math` para calcular a diagonal do retângulo usando o teorema de Pitágoras (`Math.sqrt()`).

7. **Padrões de Codificação**: A utilização de convenções de nomenclatura padrão (como camelCase para nomes de variáveis e métodos) e organização do código em blocos e métodos.

### ➡️ Pasta Funcionarios

Nesta aula, desenvolvemos um programa em Java para gerenciar informações de funcionários e calcular salários líquidos. Aqui está um resumo do que foi feito:

1. **Configuração do Ambiente**: Utilizamos a classe `Locale` para configurar o local padrão para formatação de números decimais, garantindo consistência na exibição dos valores.

2. **Entrada de Dados**: Utilizamos a classe `Scanner` para receber entrada do usuário via teclado, solicitando e armazenando informações como nome, salário bruto e imposto do funcionário.

3. **Manipulação de Objetos**: Criamos uma classe `Employee` para representar um funcionário, com atributos para nome, salário bruto e imposto. Instanciamos um objeto dessa classe para armazenar os dados do funcionário.

4. **Cálculo do Salário Líquido**: Implementamos um método na classe `Employee` para calcular o salário líquido do funcionário, subtraindo o valor do imposto do salário bruto.

5. **Aumento de Salário**: Criamos um método na classe `Employee` para aumentar o salário do funcionário com base em uma porcentagem fornecida pelo usuário.

6. **Saída Formatada**: Utilizamos o método `toString()` na classe `Employee` para formatar os dados do funcionário em uma string legível, incluindo o nome e o salário líquido.

7. **Interatividade com o Usuário**: Solicitamos ao usuário uma porcentagem para aumentar o salário do funcionário e exibimos os dados atualizados do funcionário, incluindo o novo salário líquido.

8. **Boas Práticas de Programação**: Utilizamos comentários para documentar o código e fechamos o objeto `Scanner` para evitar vazamentos de recursos.


### ➡️ Pasta Alunos
Nesta aula, desenvolvemos um programa em Java para calcular a nota final de um aluno e determinar se ele foi aprovado ou reprovado. Aqui está um resumo do que foi feito:

1. **Configuração do Ambiente**: Utilizamos a classe `Locale` para configurar o local padrão como US, garantindo a formatação correta dos números decimais.

2. **Entrada de Dados**: Utilizamos a classe `Scanner` para receber entrada do usuário via console, solicitando e armazenando o nome do aluno e suas três notas.

3. **Manipulação de Objetos**: Criamos uma classe `Student` para representar um aluno, com atributos para nome e notas. Instanciamos um objeto dessa classe para armazenar os dados do aluno.

4. **Cálculo da Nota Final**: Implementamos um método na classe `Student` para calcular a nota final do aluno, somando suas três notas.

5. **Verificação de Aprovação**: Utilizamos o método `notaFinal()` para determinar se o aluno foi aprovado ou reprovado. Se a nota final for menor que 60, o aluno é considerado reprovado, caso contrário, é considerado aprovado.

6. **Mensagens de Saída**: Exibimos a nota final do aluno e uma mensagem indicando se ele foi aprovado ou reprovado. Se reprovado, também exibimos a quantidade de pontos que faltam para atingir a nota mínima de aprovação.

7.  **Boas Práticas de Programação**: Utilizamos comentários para documentar o código e fechamos o objeto `Scanner` para evitar vazamentos de recursos.

---
</br>
<h1 align="center"> 🍀 Dia 4 </h1>


## 🔗  OBJETOS SÃO ACESSADOS POR REFERÊNCIAS

Quando declaramos uma variável para associar a um objeto, na verdade, essa variável não guarda o
objeto, mas, sim, uma maneira de acessá-lo, chamada de referência. É por esse motivo que, diferente dos tipos primitivos como int e long, precisamos dar `new` depois de declarada a variável:

```java
public static void main(String[] args) {
    Conta c1;
    c1 = new Conta();
    Conta c2;
    c2 = new Conta();
}
```

O correto aqui é dizer que `c1` se refere a um objeto. Não é certo dizer que `c1` é um objeto, pois `c1` é uma variável referência, apesar de, depois de um tempo, os programadores Java falarem: "tenho um objeto `c` do tipo `Conta`" como um modo para encurtar a frase: "tenho uma referência `c` a um objeto do tipo `Conta`".

Basta lembrar que, em Java, uma variável nunca é um objeto. Não há, no Java, uma maneira de criarmos o que é conhecido como objeto pilha ou objeto local, pois todo objeto, nessa linguagem, sem exceção, é acessado por uma variável referência.

Esse código nos deixa na seguinte situação:

```java
Conta c1;
c1 = new Conta();
Conta c2;
c2 = new Conta();
```

Internamente, `c1` e `c2` vão guardar um número que identifica em que posição da memória aquela `Conta` se encontra. Dessa maneira, ao utilizarmos o "." para navegar, o Java acessará a `Conta` que se encontra naquela posição de memória, e não uma outra.

Para quem conhece, é parecido com um ponteiro. Porém, você não pode manipulá-lo como um número nem utilizá-lo para aritmética, pois ela é tipada.

Um outro exemplo:

```java
class TestaReferencias {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.deposita(100);
        Conta c2 = c1; // linha importante!
        c2.deposita(200);
        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
    }
}
```

Qual é o resultado do código acima? O que aparece ao rodar?

O que acontece aqui? O operador `=` copia o valor de uma variável. Mas qual é o valor da variável `c1`? É o objeto? Não. Na verdade, o valor guardado é a referência (endereço) ao local onde o objeto se encontra na memória principal.

Na memória, o que acontece nesse caso:

```java
Conta c1 = new Conta();
Conta c2 = c1;
```

Quando fizemos `c2 = c1`, `c2` passa, nesse instante, a fazer referência ao mesmo objeto referenciado por `c1`.

Então, nesse código em específico, quando utilizamos `c1` ou `c2`, estamos nos referindo exatamente ao mesmo objeto! Elas são duas referências distintas, porém apontam para o mesmo objeto. Compará-las com `==` irá nos retornar `true`, pois o valor que elas carregam é o mesmo!

Outra forma de perceber isso é que demos apenas um `new`, logo só pode haver um objeto `Conta` na memória.

Atenção: não estamos discutindo aqui a utilidade de fazer uma referência apontar para o mesmo objeto que outra. Essa utilidade ficará mais evidente quando passarmos variáveis do tipo referência como argumento a métodos.

## 🔗 NEW

O que exatamente faz o `new`?

O `new` executa uma série de tarefas que veremos mais adiante.

Mas, a fim de melhor entender as referências no Java, imagine que o `new`, depois de alocar a memória para esse objeto, devolve uma flecha, isto é, um valor de referência. Quando você atribui isso a uma variável, essa variável passa a se referir a esse mesmo objeto.

Podemos, então, ver outra situação:

```java
public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.titular = "Duke";
    c1.saldo = 227;
    Conta c2 = new Conta();
    c2.titular = "Duke";
    c2.saldo = 227;
    if (c1 == c2) {
        System.out.println("Contas iguais");
    }
}
```

O operador `==` compara o conteúdo das variáveis, mas essas variáveis não guardam o objeto, e sim o endereço em que ele se encontra. Como em cada uma dessas variáveis guardamos duas contas criadas diferentemente, elas estão em espaços distintos da memória, o que faz o teste `if` valer `false`. As contas podem ser equivalentes no nosso critério de igualdade, porém elas não são o mesmo objeto.

Quando se trata de objetos, pode ficar mais fácil pensar que o `==` compara se os objetos (referências, na verdade) são o mesmo, e não se são iguais. Para saber se dois objetos têm o mesmo conteúdo, você precisa comparar atributo por atributo. Veremos uma solução mais elegante para isso também.

</br>

<h1 align="center"> 🍀 Dia 5 </h1>

##  🔗  Membros estáticos

- Também chamados membros de classe
- Em oposição a membros de instância
- São membros que fazem sentido independentemente de objetos. Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.
- Aplicações comuns:
  - Classes utilitárias
  - Declaração de constantes
- Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada

Vamos simplificar. Pense em uma classe como uma receita para criar objetos. Os membros são as "partes" dessa receita: variáveis e métodos.

Agora, considere que você tem uma classe chamada `Carro`. Esta classe tem membros, como `cor` e `velocidadeMaxima`. Quando você cria um objeto dessa classe, como `meuCarro`, ele terá sua própria cor e velocidade máxima.

Mas, às vezes, você tem algo relacionado à classe como um todo, não a uma instância específica. Por exemplo, você pode querer saber a quantidade total de carros criados, ou uma funcionalidade que não dependa de um carro em particular.

Aqui é onde entram os membros estáticos. Eles são membros da classe em si, não de uma instância específica. Assim, todos os objetos da classe compartilham o mesmo valor para um membro estático.

Por exemplo, digamos que você queira saber a quantidade total de carros criados. Em vez de rastrear isso individualmente para cada carro, você pode ter um membro estático na classe `Carro`, chamado `quantidadeTotalDeCarros`.

Essa é uma maneira de ver membros estáticos: como pertencendo à classe em si, em vez de a instâncias individuais dessa classe. Isso significa que você pode acessá-los sem precisar criar um objeto da classe.
 
<h3> Problema exemplo:</h3>
Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma circunferência e do volume de uma esfera para um raio daquele valor. Informar também o valor de PI com duas casas decimais.

- Versão 1: métodos na própria classe do programa
  - Nota: dentro de um método estático você não pode chamar membros de instância da mesma classe.
- Versão 2: classe Calculator com membros de instância
- Versão 3: classe Calculator com método estático

VERSÃO 1
```java
package application;
import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double c = circumference(radius);
        double v = volume(radius);
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);
        sc.close();
    }
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}

```

VERSÃO 2
```java
package util;
public class Calculator {
    public final double PI = 3.14159;
    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }
    public double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
```
```java
Calculator calc = new Calculator();
System.out.print("Enter radius: ");
double radius = sc.nextDouble();
double c = calc.circumference(radius);
double v = calc.volume(radius);
System.out.printf("Circumference: %.2f%n", c);
System.out.printf("Volume: %.2f%n", v);
System.out.printf("PI value: %.2f%n", calc.PI);
```

VERSÃO 3
```java
System.out.print("Enter radius: ");
double radius = sc.nextDouble();
double c = Calculator.circumference(radius);
double v = Calculator.volume(radius);
System.out.printf("Circumference: %.2f%n", c);
System.out.printf("Volume: %.2f%n", v);
System.out.printf("PI value: %.2f%n", Calculator.PI);
```
