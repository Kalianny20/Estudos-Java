/*
 * Este programa em Java calcula a área de dois triângulos e determina qual deles tem a maior área.
 */

// Importação das classes necessárias
package application;
import entities.Triangle; // Importa a classe Triangle do pacote entities
import java.util.Locale; // Importa a classe Locale para definir o locale padrão
import java.util.Scanner; // Importa a classe Scanner para entrada de dados pelo usuário

/**
 * Classe principal que contém o método main para executar o programa.
 */
public class Program {

    /**
     * Método principal para executar o programa.
     * @param args os argumentos da linha de comando (não utilizado neste programa)
     */
    public static void main(String[] args) {
        // Define o locale padrão como US para garantir a formatação correta dos números
        Locale.setDefault(Locale.US);
        // Cria um objeto Scanner para ler entrada do usuário a partir do console
        Scanner sc = new Scanner(System.in);
        
        // Declaração dos objetos Triangle x e Triangle y
        Triangle x = new Triangle(); // Instância do triângulo x
        Triangle y = new Triangle(); // Instância do triângulo y
        
        // Solicita ao usuário que insira as medidas dos lados do triângulo x
        System.out.println("Enter the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        // Solicita ao usuário que insira as medidas dos lados do triângulo y
        System.out.println("Enter the measures of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
           
        // Calcula a área dos triângulos X e Y utilizando o método area() da classe Triangle
        double areaX = x.area(); // Calcula a área do triângulo x e armazena em areaX
        double areaY = y.area(); // Calcula a área do triângulo y e armazena em areaY
        
        // Imprime a área de cada triângulo com precisão de quatro casas decimais
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        
        // Determina qual triângulo tem a maior área e imprime a mensagem correspondente
        if (areaX > areaY) {
            System.out.println("Large area: X");
        } else {
            System.out.println("Large area: Y");
        }
        
        // Fecha o scanner para liberar os recursos
        sc.close();
    }
}
