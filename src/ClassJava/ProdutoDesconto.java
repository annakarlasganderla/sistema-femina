package ClassJava;

public class ProdutoDesconto {
    private Double preco;
    // lista de produtos


    public ProdutoDesconto(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ProdutoDesconto{" +
                "preco=" + preco +
                '}';
    }
}
