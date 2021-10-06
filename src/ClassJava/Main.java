package ClassJava;

public class Main {

    public static void main(String[] args) {

        // CLASSES RELATIVAS AO PRODUTO -------------------------------------
        ModelosDosProdutos mod = new ModelosDosProdutos(1,"banana-prata");
        Cor c1 = new Cor("amarelo","#000125");
        Categoria cat1 = new Categoria("fruta",5);
        Tamanho t1 = new Tamanho("p", 15);
        Endereco enderecoMarca = new Endereco("brasil","paraná","sao miguel do iguaçu","tatata","123.456-9",1453);
        Marca marca1 = new Marca(0, "hope",enderecoMarca);

        // CLASSE RELATIVA AO ENDEREÇO DO FORNECEDOR
        Endereco enderecoFornecedor = new Endereco("brasil","paraná","foz do iguaçu","tangará","123.456-7",723);
        Fornecedor fornecedor1 = new Fornecedor(15,"frutas.ltda","1254684546", enderecoFornecedor);
        Contatos contatoFornecedor = new Contatos(2,"123456","maju@gmial.com");
        Produto p1 = new Produto(1,"banana",1.22,5,fornecedor1, cat1);

        fornecedor1.getContatos().add(contatoFornecedor);

        p1.getModeloDosProdutos().add(mod);
        p1.getCor().add(c1);
        p1.getTamanho().add(t1);
        cat1.getProduto().add(p1);

        // CLASSES RELATIVAS AO CLIENTE  ------------------------------------------
        Endereco enderecoCliente = new Endereco("brasil","paraná","itaipulandia","aaaaaaa","123.456-5",23);
        Contatos contato1 = new Contatos(1,"456456","anna@gmail.com");
        Cliente cliente = new Cliente(48,"anna","123456",18,enderecoCliente);

        cliente.getContatos().add(contato1);

        marca1.getContatos().add(contato1);

        Favoritos favoritos = new Favoritos();

        favoritos.getProdutos().add(p1);
        favoritos.getCliente().add(cliente);

        // CLASSES RELATIVAS A LOJA -----------------------------------
        Endereco enderecoLoja1 = new Endereco("brasil","paraná","foz do iguaçu","tangará","123.456-3",13);
        Endereco enderecoFuncionario = new Endereco("brasil","paraná","itaipulandia","lalala","123.456-6",453);

        Funcionarios funcionario = new Funcionarios(0, "Dayane", "vendedora", enderecoFuncionario);
        funcionario.getContatos().add(contato1);

        // CLASSES RELATIVAS A PROMOÇÕES  -------------------------

        ProdutoDesconto produtoDesconto = new ProdutoDesconto(25.00);

        Ofertas ofertas = new Ofertas(5);

        ofertas.getProdutoComDesconto().add(produtoDesconto);

        Lojas lojas = new Lojas(1, "Femina1", enderecoLoja1);

        Outlet outlet = new Outlet();

        outlet.getLojas().add(lojas);

        lojas.getContatos().add(contato1);
        lojas.getFuncionarios().add(funcionario);
        lojas.getProdutos().add(p1);

        // CLASSES RELATIVAS A DESTAQUES ----------------------------
        Destaques destaque = new Destaques();
        destaque.setNomeColecao("Coleção inverno");
        destaque.getProdutos().add(p1);

        System.out.println(p1);
        System.out.println(cliente);
        System.out.println(lojas);
        System.out.println(destaque);
        System.out.println(cat1);
    }
}
