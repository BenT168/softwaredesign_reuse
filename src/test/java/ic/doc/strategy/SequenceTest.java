package ic.doc.strategy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

public class SequenceTest {

    final Sequence sequence = new Sequence(new TermGenerator() {

        @Override
        public int positiveTerm(int i) {
            return i;
        }
    });

    @Test
    public void isUndefinedForNegativeIndices() {

        try {
            sequence.term(-1);
            fail("should have thrown exception");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), containsString("Not defined for indices < 0"));
        }
    }

    @Test
    public void canBeIteratedThrough() {

        assertThat(sequence, hasItems(1, 2, 3, 4, 5));
    }

}
