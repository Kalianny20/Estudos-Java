/*
 * Este programa calcula a nota final de um aluno e determina se ele foi aprovado ou reprovado.
 */

package application; // Pacote que contém a classe Program

import entities.Student; // Importa a classe Student do pacote entities
import java.util.Locale; // Importa a classe Locale do pacote java.util
import java.util.Scanner; // Importa a classe Scanner do pacote java.util

/**
 * A classe Program é a classe principal que contém o método main para executar o programa.
 */
public class Program {

    /**
     * O método main é o ponto de entrada do programa.
     * @param args os argumentos da linha de comando (não utilizados neste programa)
     */
    public static void main(String[] args) {
        // Define o locale padrão como US para garantir a formatação correta dos números
        Locale.setDefault(Locale.US);
        // Cria um objeto Scanner para ler entrada do usuário a partir do console
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student(); // Cria um novo objeto Student
        
        System.out.print("Nome: "); // Solicita o nome do aluno ao usuário
        student.nome = sc.nextLine(); // Lê o nome do aluno
        System.out.print("Primeira nota: "); // Solicita a primeira nota ao usuário
        student.nota1 = sc.nextDouble(); // Lê a primeira nota do aluno
        System.out.print("Segunda nota: "); // Solicita a segunda nota ao usuário
        student.nota2 = sc.nextDouble(); // Lê a segunda nota do aluno
        System.out.print("Terceira nota: "); // Solicita a terceira nota ao usuário
        student.nota3 = sc.nextDouble(); // Lê a terceira nota do aluno
        
        System.out.println("Nota final: " + student.notaFinal()); // Exibe a nota final do aluno
        
        // Verifica se o aluno foi aprovado ou reprovado e exibe a mensagem correspondente
        if (student.notaFinal() < 60.0) {
            System.out.println("REPROVADO");
            System.out.printf("FALTARAM %.2f PONTOS%n", student.faltamPontos());
        } else {
            System.out.println("APROVADO");
        }
        
        sc.close(); // Fecha o objeto Scanner
    }
    
}