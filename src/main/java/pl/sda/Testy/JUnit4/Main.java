package pl.sda.Testy.JUnit4;

import pl.sda.Testy.JUnit4.Zadania.Basket;
import pl.sda.Testy.JUnit4.Zadania.Item;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();
        Basket basket2 = new Basket();

        Item item1 = new Item("Bread", 1.70);
        Item item2 = new Item("Towel", 10);
        Item item3 = new Item("Cheese", 3);

        basket.addItem(item1, 5);
        basket.addItem(item2);
        basket.addItem(item3, 3);
        System.out.println(basket);

        basket2.addItem(item2, 3);
        basket2.addItem(item1);
        basket2.addItem(item1);
        System.out.println(basket2);
    }

}
