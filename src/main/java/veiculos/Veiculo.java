package veiculos;

public abstract class Veiculo {
    protected String nome;

    public Veiculo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
