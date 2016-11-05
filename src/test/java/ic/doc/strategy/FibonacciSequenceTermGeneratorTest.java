package ic.doc.strategy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FibonacciSequenceTermGeneratorTest {

    private final Sequence sequence = new Sequence(new FibonacciSequenceTermGenerator());

    @Test
    public void definesFirstTwoTermsToBeOne() {

        assertThat(sequence.term(0), is(1));
        assertThat(sequence.term(1), is(1));
    }

    @Test
    public void definesSubsequentTermsToBeTheSumOfThePreviousTwo() {

        assertThat(sequence.term(2), is(2));
        assertThat(sequence.term(3), is(3));
        assertThat(sequence.term(4), is(5));
    }

    @Test
    public void canBeIteratedThrough() {

        assertThat(sequence, hasItems(1, 1, 2, 3, 5));
    }

}