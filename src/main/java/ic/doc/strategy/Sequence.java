package ic.doc.strategy;

import java.util.Iterator;

public class Sequence implements Iterable<Integer> {

    private final TermGenerator generator;

    public Sequence(TermGenerator generator) {
        this.generator = generator;
    }

    public int term(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Not defined for indices < 0");
        }
        return generator.positiveTerm(i);
    }

    public Iterator<Integer> iterator() {
        return new SequenceIterator();
    }

    private class SequenceIterator implements Iterator<Integer> {

        private int i = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return generator.positiveTerm(i++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }


}
