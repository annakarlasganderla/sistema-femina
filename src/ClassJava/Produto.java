package ClassJava;

public class Produto {

    private Integer codigo;
    private String nome,marca,cor;
    private Double valor;
    private ModelosDosProdutos tipo;
    private Tamanho tamanho;
    private Fornecedor fornecedor;

    public Produto(){}

    public Produto(Integer codigo, String nome, ModelosDosProdutos tipo, String marca, String cor, Double valor,Tamanho tamanho, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo; //
        this.marca = marca; //
        this.cor = cor; //
        this.tamanho = tamanho; // dimensao
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }
    public Integer getCodigo(){
        return codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setTipo(ModelosDosProdutos tipo){
        this.tipo = tipo;
    }
    public ModelosDosProdutos getTipo(){
        return tipo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }

    public void setTamanho(Tamanho tamanho){
        this.tamanho = tamanho;
    }
    public Tamanho getTamanho(){
        return tamanho;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }
    public Double getValor(){
        return valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "codigo: " + codigo + '\n' +
                "nome: " + nome + '\n' +
                "tipo: " + tipo.getTipo() + '\n' +
                "marca: " + marca + '\n' +
                "cor: " + cor + '\n' +
                "tamanho: " + tamanho.getTam() + '\n' +
                "valor: " + valor + '\n' +
                "fornecedor: " + fornecedor.getNome();
    }
}
