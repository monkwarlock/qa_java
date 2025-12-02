import com.example.Cat;
import com.example.Feline;
import com.example.util.EnvConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline mockPredator;

    @InjectMocks
    private Cat cat;

    @Test
    public void testGetSound() {
        assertEquals(EnvConfig.CAT_SOUND, cat.getSound());
    }

    @Test
    public void testGetFoodCheckingTheReturnValue() throws Exception {
        List<String> expectedFood = EnvConfig.PREDATOR_EAT;
        when(mockPredator.eatMeat()).thenReturn(expectedFood);
        List<String> result = cat.getFood();
        assertEquals(expectedFood, result);
    }

    @Test
    public void testGetFoodCheckingTheMethodOperation() throws Exception {
        cat.getFood();
        verify(mockPredator, times(1)).eatMeat();
    }
}