/*
 * Esta classe representa um retângulo e fornece métodos para calcular a área,
 * o perímetro e a diagonal do retângulo, bem como para formatar esses valores
 * em uma string formatada.
 */

// Definição do pacote onde a classe Rectangle está localizada
package entities;

/**
 * Classe que representa um retângulo.
 */
public class Rectangle {
    // Declaração dos membros de dados que representam a largura e a altura do retângulo
    public double width;
    public double height;
    
    /**
     * Método que calcula a área do retângulo.
     * @return a área do retângulo
     */
    public double area() {
        return width * height; // Multiplica a largura pela altura para obter a área
    }
    
    /**
     * Método que calcula o perímetro do retângulo.
     * @return o perímetro do retângulo
     */
    public double perimeter() {
        return 2 * (height + width); // Calcula o perímetro utilizando a fórmula 2 * (altura + largura)
    }
    
    /**
     * Método que calcula a diagonal do retângulo.
     * @return a diagonal do retângulo
     */
    public double diagonal() {
        return Math.sqrt(height * height + width * width); // Calcula a diagonal utilizando o teorema de Pitágoras
    }
    
    /**
     * Método que retorna uma representação em string formatada dos dados do retângulo.
     * @return uma string formatada contendo a área, o perímetro e a diagonal do retângulo
     */
    public String toString() {
        // Formata a saída com a área, o perímetro e a diagonal do retângulo com duas casas decimais
        return String.format("Área = %.2f\nPerímetro = %.2f\nDiagonal = %.2f", area(), perimeter(), diagonal());
    }
}
