package pl.sda.Testy.JUnit4.Zadania;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Remigiusz Zudzin
 */
public class Basket {

    protected static final String ITEM_ORDER_FORMAT = "%s (%.2f x %d = %.2f)";

    private final Map<Item, Integer> orderedItems = new TreeMap<>();

    public Map<Item, Integer> getOrderedItems() {
        return this.orderedItems;
    }

    public Map<Item, Integer> addItem(Item item) {
        if (orderedItems.isEmpty()) {
            orderedItems.put(item, 1);
            return orderedItems;
        } else {
            return addItem(item, 1);
        }
    }

    public Map<Item, Integer> addItem(Item item, Integer quantity) {
        if (quantity <= 0) throw new IllegalArgumentException("Quantity has to be 1 or above!");
        if (orderedItems.containsKey(item)) {
            quantity = orderedItems.get(item) + quantity;
        }
            orderedItems.put(item, quantity);
            return orderedItems;
    }

    public Map<Item, Integer> removeItem(Basket basket, Item item, Integer quantity) {
        Map<Item, Integer> orderedItems = basket.getOrderedItems();
        if (orderedItems.isEmpty()) throw new IllegalArgumentException("Basket is empty!");
        if (quantity <= 0) throw new IllegalArgumentException("Quantity has to be 1 or above!");
        orderedItems.remove(item, 1);
        return orderedItems;
    }

    public Map<Item, Integer> removeItems(Basket basket, Item item, Integer quantity) {
        Map<Item, Integer> orderedItems = basket.getOrderedItems();
        if (orderedItems.isEmpty()) throw new IllegalArgumentException("Basket is empty!");
        if (quantity <= 0) throw new IllegalArgumentException("Quantity has to be 1 or above!");
        quantity = orderedItems.get(item) - quantity;
        if (quantity == 0) {
            orderedItems.remove(item);
        } else if (quantity < 0 ) {
            throw new IllegalStateException("There is no that many items to remove!");
        } else {
            orderedItems.put(item, quantity);
        }
        return orderedItems;
    }

    public double getBasketValue(Basket basket) {

        double orderValue = 0;

        for(Map.Entry<Item, Integer> itemOrder : orderedItems.entrySet()) {
            orderValue += itemOrder.getKey().getPrice() * itemOrder.getValue();
        }

        return orderValue;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for(Map.Entry<Item, Integer> itemOrder : orderedItems.entrySet()) {
            Item item = itemOrder.getKey();
            Integer quantity = itemOrder.getValue();
            String itemString = String.format(
                    ITEM_ORDER_FORMAT,
                    item.getName(),
                    item.getPrice(),
                    quantity,
                    item.getPrice() * quantity
            );
            result.append(itemString);
            result.append(System.lineSeparator());
        }

        result.append(String.format("Total: %.2f", getBasketValue(this)));
        return result.toString();
    }
}
