package ClassJava;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {

    private long id;
    private String nome;
    private String cnpj;
    private List<Contatos> contatos = new ArrayList<Contatos>(); // lista de contatos
    // OBJETO -> endereço

    public Fornecedor(long id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Contatos> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contatos> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", contatos=" + contatos +
                '}';
    }
}
