/*
 * A classe Student representa um aluno e contém métodos para calcular a nota final e os pontos faltantes.
 */

package entities; // Pacote que contém a classe Student

/**
 * A classe Student representa um aluno.
 */
public class Student {
    public String nome; // Nome do aluno
    public double nota1, nota2, nota3; // Notas do aluno
    
    /**
     * O método notaFinal calcula a nota final do aluno.
     * @return a soma das notas do aluno
     */
    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }
    
    /**
     * O método faltamPontos calcula os pontos que faltam para o aluno ser aprovado.
     * @return a quantidade de pontos que faltam para o aluno ser aprovado (zero se já estiver aprovado)
     */
    public double faltamPontos() {
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();
        } else {
            return 0.0;
        }
    }
    
}