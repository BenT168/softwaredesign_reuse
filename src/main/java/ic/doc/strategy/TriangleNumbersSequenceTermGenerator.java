package ic.doc.strategy;

public class TriangleNumbersSequenceTermGenerator implements TermGenerator {

    @Override
    public int positiveTerm(int i) {
        return (i + 1) * (i + 2) / 2;
    }

}
