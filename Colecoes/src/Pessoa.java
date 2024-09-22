public class Pessoa {

    private String genero;
    private String nome;

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Pessoa(String genero, String nome) {
        this.genero = genero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "genero='" + genero + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
