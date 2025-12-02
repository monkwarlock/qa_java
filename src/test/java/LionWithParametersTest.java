import com.example.Feline;
import com.example.Lion;
import com.example.util.EnvConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionWithParametersTest {
    private final String sex;
    private final boolean expectedHasMane;

    public LionWithParametersTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSexLion() {
        return new Object[][] {
                {EnvConfig.MALE, true},
                {EnvConfig.FEMALE, false}
        };
    }

    @Test
    public void testDoesHaveManeLion() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals("Для пола '" + sex + "' ожидалось наличие гривы: "
                        + expectedHasMane, expectedHasMane, actualHasMane);
    }
}