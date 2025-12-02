import com.example.Alex;
import com.example.Feline;
import com.example.util.EnvConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    private Feline mockFeline;

    @Test
    public void testGetAlexFriends() throws Exception {
        Alex lion = new Alex(mockFeline);
        assertEquals(EnvConfig.ALEX_FRIENDS, lion.getFriends());
    }

    @Test
    public void testGetAlexPlaceOfLiving() throws Exception {
        Alex lion = new Alex(mockFeline);
        assertEquals(EnvConfig.ALEX_PLACE_OF_LIVING, lion.getPlaceOfLiving());
    }

    @Test
    public void testGetAlexKittens() throws Exception {
        Alex lion = new Alex(mockFeline);
        assertEquals(EnvConfig.ALEX_KITTENS, lion.getKittens());
    }
}