package game;

public interface Visitor {
    String exibirAssalto(Assalto assalto);
    String exibirSuporte(Suporte suporte);
    String exibirBatedor(Batedor batedor);
}
