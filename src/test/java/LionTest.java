import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline  Feline;

    @Mock
    com.example.Lion lion;

    public LionTest() throws Exception {
    }


    @Test
    public void doesHaveManeFalse() throws Exception {
        MockitoAnnotations.openMocks(this);
        Lion Lion = new Lion("Самка", Feline);
        Lion.doesHaveMane();
        assertEquals((false),Lion.doesHaveMane());
    }
    @Test
    public void doesHaveManeTrue() throws Exception {
        MockitoAnnotations.openMocks(this);
        Lion Lion = new Lion("Самец", Feline);
        Lion.doesHaveMane();
        assertEquals((true),Lion.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        MockitoAnnotations.openMocks(this);
        Mockito.when(Feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion Lion = new Lion("Самка", Feline);
        Lion.getFood();
        assertEquals((List.of("Животные", "Птицы", "Рыба")),Lion.getFood());
    }
    @Test
    public void getKittens() throws Exception {
        MockitoAnnotations.openMocks(this);
        Mockito.when(Feline.getKittens()).thenReturn(1);
        Lion Lion = new Lion("Самка", Feline);
        Lion.getKittens();
        assertEquals(1,Lion.getKittens());
    }
}
