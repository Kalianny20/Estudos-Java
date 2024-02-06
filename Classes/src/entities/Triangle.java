/*
 * Esta classe define um triângulo com três atributos a, b e c, representando os comprimentos dos lados.
 * Possui um método area() que calcula a área do triângulo usando a fórmula de Herão.
 */
package entities;

public class Triangle {
    
    public double a; // Primeiro lado do triângulo
    public double b; // Segundo lado do triângulo
    public double c; // Terceiro lado do triângulo
    
    /**
     * Calcula a área do triângulo usando a fórmula de Herão.
     * @return a área do triângulo
     */
    public double area() {
        double p = (a + b + c) / 2.0; // Semi-perímetro do triângulo
        return Math.sqrt (p * (p - a) * (p - b) * (p - c)); // Fórmula de Herão para área do triângulo
    }
}