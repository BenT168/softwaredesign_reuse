package ic.doc.strategy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleNumbersSequenceTermGeneratorTest {

    private final Sequence sequence = new Sequence(new TriangleNumbersSequenceTermGenerator());

    @Test
    public void definesFirstTermToBeOne() {

        assertThat(sequence.term(0), is(1));
    }

    @Test
    public void definesSubsequentTermsToBeTheTriangleNumbers() {
        assertThat(sequence.term(1), is(3));
        assertThat(sequence.term(2), is(6));
        assertThat(sequence.term(3), is(10));
        assertThat(sequence.term(4), is(15));
    }

    @Test
    public void canBeIteratedThrough() {
        assertThat(sequence, hasItems(1, 3, 6, 10, 15));
    }

}