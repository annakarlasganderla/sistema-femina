package ClassJava;

public class Ofertas {

    private long id;
    // lista de produtosDesconto

    public Ofertas(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ofertas{" +
                "id=" + id +
                '}';
    }
}
