package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClasseVisitorTest {

    @Test
    void deveExibirAssalto() {
        Assalto assalto = new Assalto(40, "PHenriqueCEC");

        ClasseVisitor visitor = new ClasseVisitor();
        assertEquals("Assalto{nível=40, nome='PHenriqueCEC'}", visitor.exibir(assalto));
    }

    @Test
    void deveExibirSuporte() {
        Suporte suporte = new Suporte(30, "PHenriqueCEC");

        ClasseVisitor visitor = new ClasseVisitor();
        assertEquals("Suporte{nível=30, nome='PHenriqueCEC'}", visitor.exibir(suporte));
    }

    @Test
    void deveExibirBatedor() {
        Batedor batedor = new Batedor(50, "PHenriqueCEC");

        ClasseVisitor visitor = new ClasseVisitor();
        assertEquals("Batedor{nível=50, nome='PHenriqueCEC'}", visitor.exibir(batedor));
    }
}
