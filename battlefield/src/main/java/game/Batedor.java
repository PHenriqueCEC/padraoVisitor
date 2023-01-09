package game;

public class Batedor implements Classe {
    private int nivel;
    private String nome;

    public Batedor(int nivel, String nome) {
        this.nivel = nivel;
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirBatedor(this);
    }
}
