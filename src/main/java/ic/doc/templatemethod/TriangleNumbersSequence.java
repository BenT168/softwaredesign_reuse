package ic.doc.templatemethod;

import java.util.Iterator;

public class TriangleNumbersSequence implements Iterable<Integer> {

    public int term(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Not defined for indices < 0");
        }
        if (i == 0) {
            return 1;
        }
        return (i + 1) * (i + 2) / 2;
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
            return term(i++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }
}