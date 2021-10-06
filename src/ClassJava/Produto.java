package ClassJava;

// fazer o toString depois de relacionar todas as classes

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private long id;
    private String nome;
    private Double preco;
    private int qtd;
    private List<ModelosDosProdutos> modeloDosProdutos = new ArrayList<ModelosDosProdutos>();
    private List<Cor> cor = new ArrayList<Cor>();
    private List<Categoria> categoria = new ArrayList<Categoria>();
    private List<Tamanho> tamanho = new ArrayList<Tamanho>();
    private Fornecedor fornecedor; // obj

    public Produto(long id, String nome, Double preco, int qtd, ClassJava.Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        this.fornecedor = fornecedor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public List<ModelosDosProdutos> getModeloDosProdutos() {
        return modeloDosProdutos;
    }

    public void setModeloDosProdutos(List<ModelosDosProdutos> modeloDosProdutos) {
        this.modeloDosProdutos = modeloDosProdutos;
    }

    public List<Cor> getCor() {
        return cor;
    }

    public void setCor(List<Cor> cor) {
        this.cor = cor;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    public List<Tamanho> getTamanho() {
        return tamanho;
    }

    public void setTamanho(List<Tamanho> tamanho) {
        this.tamanho = tamanho;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtd=" + qtd +
                ", modeloDosProdutos=" + modeloDosProdutos +
                ", cor=" + cor +
                ", categoria=" + categoria +
                ", tamanho=" + tamanho +
                ", fornecedor=" + fornecedor +
                '}';
    }
}
