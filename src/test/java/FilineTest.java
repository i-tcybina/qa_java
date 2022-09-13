import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FilineTest {
    Feline Feline = new Feline();

    @Test
    public void getKittens1() {
        Feline.getKittens(1);
        assertEquals(1,Feline.getKittens(1));
    }
    @Test
    public void getKittens() {
        Feline.getKittens(); //
        assertEquals(1,Feline.getKittens());
    }
    @Test
    public void eatMeat() throws Exception {
     Feline.eatMeat(); //
     assertEquals(List.of("Животные", "Птицы", "Рыба"),Feline.eatMeat());
    }
    @Test
    public void getFamily() throws Exception {
        Feline.getFamily();
        assertEquals(("Кошачьи"),Feline.getFamily());
    }
}






