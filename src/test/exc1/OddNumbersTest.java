package exc1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class OddNumbersTest {

    private OddNumbers underTest = new OddNumbers();

    @Test
    public void testOddAverage() {
        long avg = underTest.calculateOddAverage(Arrays.asList(1L, 2L, 3L, 9L, 6L));
        Assert.assertEquals(5, avg);
    }

    @Test
    public void testAverage() {
        long avg = underTest.getAverage(3, 9);
        Assert.assertEquals(6, avg);
    }
}
