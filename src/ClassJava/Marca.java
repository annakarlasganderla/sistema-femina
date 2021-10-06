package ClassJava;

import java.util.ArrayList;
import java.util.List;

public class Marca {

    private long id;
    private String nome;
    private List<Contatos> contatos = new ArrayList<Contatos>();

    public Marca(long id, String nome) {
        this.id = id;
        this.nome = nome;
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

    public List<Contatos> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contatos> contatos) {
        this.contatos = contatos;
    }

    // sem métodos
    
    @Override
    public String toString() {
        return "Marca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", contatos=" + contatos +
                '}';
    }
}
