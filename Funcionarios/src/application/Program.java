/*
 * Este programa solicita informações sobre um funcionário, calcula o salário líquido
 * e permite aumentar o salário com base em uma porcentagem fornecida pelo usuário.
 */

package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // Configura o local padrão para formatação de números decimais
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para receber entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Cria um novo objeto Employee para armazenar os dados do funcionário
        Employee employee = new Employee();
        
        // Solicita e armazena o nome do funcionário
        System.out.println("Digite o nome: ");
        employee.name = sc.nextLine();
        
        // Solicita e armazena o salário bruto do funcionário
        System.out.println("Digite o salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        
        // Solicita e armazena o imposto do funcionário
        System.out.println("Digite o imposto: ");
        employee.tax = sc.nextDouble();
        
        System.out.println();
        
        // Exibe os dados do funcionário, incluindo o salário líquido
        System.out.println("Funcionário: " + employee);
        System.out.println();
        
        // Solicita ao usuário a porcentagem para aumentar o salário
        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double percentage = sc.nextDouble();
        
        // Aumenta o salário do funcionário com base na porcentagem fornecida
        employee.increaseSalary(percentage);
        
        System.out.println();
        
        // Exibe os dados atualizados do funcionário, incluindo o novo salário líquido
        System.out.println("Dados atualizados: " + employee);
        
        // Fecha o scanner para evitar vazamentos de recursos
        sc.close();
    }   
}
