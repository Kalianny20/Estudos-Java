/*
 * Fazer um programa para ler os valores da largura e altura de um
 * retângulo. Em seguida, mostrar na tela o valor de sua área,
 * perímetro e diagonal.
 */

// Importação das classes Rectangle, Locale e Scanner
package application;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

/**
 * Classe principal que contém o método main para execução do programa.
 */
public class Program {

    /**
     * Método principal que inicia a execução do programa.
     * @param args os argumentos da linha de comando (não são utilizados neste programa)
     */
    public static void main(String[] args) {
        // Configura o local padrão para os valores numéricos como o formato dos EUA
        Locale.setDefault(Locale.US);
        // Cria um objeto Scanner para ler entrada do teclado
        Scanner sc = new Scanner(System.in);
        
        // Cria um novo objeto retângulo
        Rectangle rectangle = new Rectangle();
        
        // Solicita ao usuário que insira a largura do retângulo
        System.out.print("Entre com a largura do retângulo: ");
        // Lê a largura do retângulo fornecida pelo usuário
        rectangle.width = sc.nextDouble();
        // Solicita ao usuário que insira a altura do retângulo
        System.out.print("Entre com a altura do retângulo: ");
        // Lê a altura do retângulo fornecida pelo usuário
        rectangle.height = sc.nextDouble();
        
        // Exibe a área, o perímetro e a diagonal do retângulo na saída padrão
        System.out.println(rectangle);
    }
    
}
