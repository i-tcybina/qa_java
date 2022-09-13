import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline  Feline;

    @Test
    public void getSound() {
        Cat Cat = new Cat( );
        Cat.getSound();
        assertEquals(("Мяу"),Cat.getSound());
    }
    @Test
    public void getFood() throws Exception {
        MockitoAnnotations.openMocks(this);
        Mockito.when(Feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat Cat = new Cat(Feline);
        Cat.getFood();
        assertEquals((List.of("Животные", "Птицы", "Рыба")),Cat.getFood());
    }
}
