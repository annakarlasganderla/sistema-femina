package ClassJava;

public class Categoria {

    private String nome;
    private long id;
    // lista de produtos


    public Categoria(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // sem métodos

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}