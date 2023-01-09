package game;

public class ClasseVisitor implements Visitor {
    public String exibir(Classe classe) {
        return classe.aceitar(this);
    }

    @Override
    public String exibirAssalto(Assalto assalto) {
        return "Assalto{" +
                "nível=" + assalto.getNivel() +
                ", nome='" + assalto.getNome() + '\'' +
                '}';
    }

    @Override
    public String exibirSuporte(Suporte suporte) {
        return "Suporte{" +
                "nível=" + suporte.getNivel() +
                ", nome='" + suporte.getNome() + '\'' +
                '}';
    }

    @Override
    public String exibirBatedor(Batedor batedor) {
        return "Batedor{" +
                "nível=" + batedor.getNivel() +
                ", nome='" + batedor.getNome() + '\'' +
                '}';
    }
}
