import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {

    private static final float DELTA = 0.0f;

    @Test
    public void bunGetNameTest() {
        Bun bun = new Bun("Пшеничная", 19.99f);
        assertEquals("Пшеничная", bun.getName());
    }

    @Test
    public void bunGetPriceTest() {
        Bun bun = new Bun("Пшеничная", 19.99f);
        assertEquals(19.99f, bun.getPrice(), DELTA);
    }
}