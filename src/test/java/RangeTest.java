import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.sda.Testy.JUnit4.Nauka.Range;

/**
 * @author Remigiusz Zudzin
 */
public class RangeTest {

    private Range range;

    @Before
    public void setUp() {
        range = new Range(10, 20);
    }

    @Test
    public void shouldSayThat15rIsInRange() {
        Assert.assertTrue(range.isInRange(15));
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException() {
        new Range(20, 10);
    }

    @Test
    public void shouldHaveProperErrorMessage() {
        try {
            new Range(20, 10);
            Assert.fail("Exception wasn't thrown!");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("lowerboud is bigger than upperbound!", e.getMessage());
        }
    }



}
