package ic.doc.strategy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleNumbersSequenceTermGeneratorTest {

    final TermGenerator termGen = new TriangleNumbersSequenceTermGenerator();

    @Test
    public void definesFirstTermToBeOne() {

        assertThat(termGen.positiveTerm(0), is(1));
    }

    @Test
    public void definesSubsequentTermsToBeTheTriangleNumbers() {
        assertThat(termGen.positiveTerm(1), is(3));
        assertThat(termGen.positiveTerm(2), is(6));
        assertThat(termGen.positiveTerm(3), is(10));
        assertThat(termGen.positiveTerm(4), is(15));
    }

}