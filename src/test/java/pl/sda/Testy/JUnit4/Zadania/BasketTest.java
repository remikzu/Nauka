package pl.sda.Testy.JUnit4.Zadania;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @author Remigiusz Zudzin
 */
public class BasketTest {

    private Basket basket;
    private Item item;

    private static final double PRICE_DELTA = 0.001;

    @Before
    public void setUp() {
        item = new Item("przedmiot", 39.99);
        basket = new Basket();
    }

    @Test
    public void addOneItem() {
        basket.addItem(item);

        Map<Item, Integer> expected = createOrder(item, 1);

        assertEquals(expected, basket.getOrderedItems());
    }

    @Test
    public void addTheSameItems() {
        basket.addItem(item);
        basket.addItem(item);

        Map<Item, Integer> expected = createOrder(item, 2);

        assertEquals(expected, basket.getOrderedItems());
    }

    @Test
    public void addMultipleItems() {
        basket.addItem(item, 50);

        Map<Item, Integer> expected = createOrder(item, 50);

        assertEquals(expected, basket.getOrderedItems());
    }

    @Test
    public void addMultipleSameItems() {
        basket.addItem(item, 30);
        basket.addItem(item, 20);

        Map<Item, Integer> expected = createOrder(item, 50);

        assertEquals(expected, basket.getOrderedItems());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldntAllowToAddItemsWithNegativeQuantity() {
        basket.addItem(item, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldntAllowToAddItemsWith0Quantity() {
        basket.addItem(item, 0);
    }

    @Test
    public void shouldAllowToRemoveItems() {
        basket.addItem(item, 3);
        basket.removeItems(item, 2);

        Map<Item, Integer> expected = createOrder(item, 1);

        assertEquals(expected, basket.getOrderedItems());
    }

    @Test
    public void shouldAllowToRemoveItem() {
        basket.addItem(item, 3);
        basket.removeItem(item);

        Map<Item, Integer> expected = createOrder(item, 2);

        assertEquals(expected, basket.getOrderedItems());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldntAllowToRemoveNegativeQuantityOfItems() {
        basket.addItem(item, 3);
        basket.removeItems(item, -3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldntAllowToRemove0Items() {
        basket.addItem(item, 3);
        basket.removeItems(item, 0);
    }

    @Test
    public void getBasketValue() {
        Item teddyBear = new Item("Teddy Bear", 19.99);
        basket.addItem(teddyBear, 3);

        double expectedValue = teddyBear.getPrice()*3;
        assertEquals(expectedValue, basket.getBasketValue(), PRICE_DELTA);
    }

    private Map<Item, Integer> createOrder(Object... mapContent) {
        Map<Item, Integer> result = new HashMap<>();

        for (int i = 0; i < mapContent.length; i += 2) {
            Item item = (Item) mapContent[i];
            Integer quantity = (Integer) mapContent[i+1];
            result.put(item, quantity);
        }

        return result;
    }
}