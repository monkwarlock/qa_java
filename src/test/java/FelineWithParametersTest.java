import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineWithParametersTest {
    private final int kittens;
    private final int expected;

    public FelineWithParametersTest(int kittens, int expected) {
        this.kittens = kittens;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSumKittens() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {3, 3},
                {5, 5},
                {10, 10}
        };
    }

    @Test
    public void testGetKittensWithParameters() {
        Feline feline = new Feline();
        int result = feline.getKittens(kittens);
        assertEquals(expected, result);
    }
}