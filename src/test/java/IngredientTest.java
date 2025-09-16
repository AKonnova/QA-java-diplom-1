import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {

    private static final float DELTA = 0.0f;
    private Ingredient ingredient;

    @Before
    public void createIngredient(){
        ingredient = new Ingredient(SAUCE, "Кисло-сладкий", 49.99f);
    }

    @Test
    public void ingredientGetTypeTest() {
        assertEquals(SAUCE, ingredient.getType());
    }

    @Test
    public void ingredientGetNameTest() {
        assertEquals("Кисло-сладкий", ingredient.getName());
    }

    @Test
    public void ingredientGetPriceTest() {
        assertEquals(49.99f, ingredient.getPrice(), DELTA);
    }
}