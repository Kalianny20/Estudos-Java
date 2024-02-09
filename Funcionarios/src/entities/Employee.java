/*
 * A classe Employee representa um funcionário e contém seus atributos
 * (nome, salário bruto e imposto), além de métodos para calcular o salário líquido
 * e aumentar o salário.
 */

package entities;

public class Employee {
    public String name; // Nome do funcionário
    public double grossSalary; // Salário bruto do funcionário
    public double tax; // Imposto do funcionário
    
    // Método para calcular o salário líquido do funcionário
    public double netSalary() {
        return grossSalary - tax;
    }
    
    // Método para aumentar o salário do funcionário com base em uma porcentagem
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }
    
    // Método para formatar os dados do funcionário em uma string
    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
