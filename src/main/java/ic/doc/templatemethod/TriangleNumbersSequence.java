package ic.doc.templatemethod;

public class TriangleNumbersSequence extends Sequence {

    @Override
    protected int positiveTerm(int i) {
        return (i + 1) * (i + 2) / 2;
    }

}