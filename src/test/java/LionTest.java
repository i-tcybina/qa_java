import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionTest {
    private final String sex;
    private final Boolean doesHaveMane;
    public LionTest(String sex,Boolean doesHaveMane) {
        this.sex = sex;
        this.doesHaveMane = doesHaveMane;
                    }
    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][] {
                { "Самка", false},
                { "Самец", true},
        };
    }
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline  Feline;

    @Test
    public void doesHaveManeFalse() throws Exception {
        Lion Lion = new Lion(sex, Feline);
        Lion.doesHaveMane();
        assertEquals((doesHaveMane),Lion.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(Feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion Lion = new Lion(sex, Feline);
        Lion.getFood();
        assertEquals((List.of("Животные", "Птицы", "Рыба")),Lion.getFood());
    }
    @Test
    public void getKittens() throws Exception {
        Mockito.when(Feline.getKittens()).thenReturn(1);
        Lion Lion = new Lion(sex, Feline);
        Lion.getKittens();
        assertEquals(1,Lion.getKittens());
    }
}
