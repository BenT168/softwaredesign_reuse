package ic.doc.strategy;

import java.util.Iterator;

public class Sequence implements Iterable<Integer> {

    private final SequenceGenerator generator;

    public Sequence(SequenceGenerator generator) {
        this.generator = generator;
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
            return generator.term(i++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }

    public int term(int i) {
        return generator.term(i);
    }

}
