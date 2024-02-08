package entities;

/**
 * Classe que representa um produto.
 */
public class Product {
    
    // Atributos do produto
    public String name; // Nome do produto
    public double price; // Preço do produto
    public int quantity; // Quantidade em estoque do produto
    
    /**
     * Calcula o valor total em estoque do produto.
     * @return o valor total em estoque do produto
     */
    public double totalValueInStock () {
        return price * quantity;
    }
    
    /**
     * Adiciona uma determinada quantidade de produtos ao estoque.
     * @param quantity a quantidade de produtos a ser adicionada
     */
    public void addProducts (int quantity) {
        this.quantity += quantity;
    }
    
    /**
     * Remove uma determinada quantidade de produtos do estoque.
     * @param quantity a quantidade de produtos a ser removida
     */
    public void removeProducts (int quantity) {
        this.quantity -= quantity;
    }
    
    /**
     * Retorna uma representação textual do objeto Product.
     * @return uma representação textual do objeto Product
     */
    @Override
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
    
}
