package application;

import entities.Product; // Importa a classe Product do pacote entities
import java.util.Locale; // Importa a classe Locale do pacote java.util para formatação
import java.util.Scanner; // Importa a classe Scanner do pacote java.util para entrada de dados

/**
 * Classe principal do programa.
 */
public class Program {

    /**
     * Método principal do programa.
     * @param args os argumentos da linha de comando (não são usados neste programa)
     */
    public static void main(String[] args) {
        // Configura o local padrão para formatação de números decimais
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para receber entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Cria um objeto Product para representar o produto inserido pelo usuário
        Product product = new Product();
        
        // Solicita ao usuário que insira os dados do produto
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine(); // Captura o nome do produto inserido pelo usuário
        System.out.print("Price: ");
        product.price = sc.nextDouble(); // Captura o preço do produto inserido pelo usuário
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt(); // Captura a quantidade em estoque do produto inserida pelo usuário

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity); // Adiciona a quantidade de produtos ao estoque

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity); // Remove a quantidade de produtos do estoque

        System.out.println();
        System.out.println("Update data: " + product);
        
        // Fecha o objeto Scanner para liberar os recursos
        sc.close();
    }
    
}
