package ClassJava;

public class Main {

    public static void main(String[] args) {

        ModelosDosProdutos mod = new ModelosDosProdutos(1,"banana-prata");
        Cor c1 = new Cor("amarelo","#000125");
        Categoria cat1 = new Categoria("fruta",5);
        Tamanho t1 = new Tamanho("p", 15);

        Endereco endereco = new Endereco("brasil","paraná","foz do iguaçu","tangará","123456",123);
        Fornecedor fornecedor1 = new Fornecedor(15,"frutas.ltda","1254684546", endereco);
        Contatos contato1 = new Contatos(1,"456456","anna@gmail.com");
        Produto p1 = new Produto(1,"banana",1.22,5,fornecedor1, cat1);
        
        p1.getModeloDosProdutos().add(mod);
        p1.getCor().add(c1);
        p1.getTamanho().add(t1);

        cat1.getProduto().add(p1);

        System.out.println(p1);
        System.out.println(cat1);
    }
}
