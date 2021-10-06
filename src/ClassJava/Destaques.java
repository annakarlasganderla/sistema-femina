package ClassJava;

public class Destaques {
    private String nomeColecao;
    // lista de produtos


    public Destaques(String nomeColecao) {
        this.nomeColecao = nomeColecao;
    }

    public String getNomeColecao() {
        return nomeColecao;
    }

    public void setNomeColecao(String nomeColecao) {
        this.nomeColecao = nomeColecao;
    }

    @Override
    public String toString() {
        return "Destaques{" +
                "nomeColecao='" + nomeColecao + '\'' +
                '}';
    }
}
