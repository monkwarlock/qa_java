import com.example.Feline;
import com.example.Lion;
import com.example.util.EnvConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline mockFeline;

    @Test
    public void testLionGetKittensCheckingTheReturnValue() throws Exception {
        Lion lion = new Lion(EnvConfig.MALE, mockFeline);
        when(mockFeline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testLionGetKittensCheckingTheMethodOperation() throws Exception {
        Lion lion = new Lion(EnvConfig.MALE, mockFeline);
        lion.getKittens();
        verify(mockFeline, times(1)).getKittens();
    }

    @Test
    public void testLionGetFoodCheckingTheReturnValue() throws Exception {
        Lion lion = new Lion(EnvConfig.MALE, mockFeline);
        List<String> expectedFood = EnvConfig.PREDATOR_EAT;
        when(mockFeline.getFood(EnvConfig.PREDATOR_ANIMAL)).thenReturn(expectedFood);
        List<String> result = lion.getFood();
        assertEquals(expectedFood, result);
    }

    @Test
    public void testLionGetFoodCheckingTheMethodOperation() throws Exception {
        Lion lion = new Lion(EnvConfig.MALE, mockFeline);
        lion.getFood();
        verify(mockFeline, times(1)).getFood(EnvConfig.PREDATOR_ANIMAL);
    }

    @Test
    public void testConstructorInvalidSex() {
        try {
            new Lion(EnvConfig.NON_BINARY_PERSONALITY, mockFeline);
            fail("Должно быть выброшено исключение");
        } catch (Exception e) {
            assertEquals(
                    EnvConfig.EXCEPTION_MESSAGE,
                    e.getMessage()
            );
        }
    }
}