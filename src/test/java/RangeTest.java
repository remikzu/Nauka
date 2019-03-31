import org.junit.Assert;
import org.junit.Test;
import pl.sda.Testy.JUnit4.Nauka.Range;

/**
 * @author Remigiusz Zudzin
 */
public class RangeTest {

    @Test
    public void shouldSayThat15rIsInRange() {
        Range range = new Range(10, 20);
        Assert.assertTrue(range.isInRange(15));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException() {
        new Range(20, 10);
    }

}
