import com.example.Feline;
import com.example.util.EnvConfig;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception {
        assertEquals(EnvConfig.PREDATOR_EAT, feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        assertEquals(EnvConfig.FELINE, feline.getFamily());
    }

    @Test
    public void testGetKittensWithOutParameters() {
        assertEquals(EnvConfig.DEFAULT_KITTENS, feline.getKittens());
    }
}