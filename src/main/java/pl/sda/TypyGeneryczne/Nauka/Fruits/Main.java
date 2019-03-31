package pl.sda.TypyGeneryczne.Nauka.Fruits;

import pl.sda.TypyGeneryczne.Nauka.Fruits.Apple.Apple;
import pl.sda.TypyGeneryczne.Nauka.Fruits.Orange.Orange;

public class Main {
    public static void main(String[] args) {
        BoxOnSteroids<Apple> appleBox = new BoxOnSteroids<>(new Apple());
        BoxOnSteroids<Orange> orangeBox = new BoxOnSteroids<>(new Orange());

//        Orange fruit = orangeBox.getFruit();
//        System.out.println(orangeBox.fruit.equals(orangeBox.fruit)); //true
//        System.out.println(appleBox.fruit.equals(appleBox.fruit)); //true
//        System.out.println(orangeBox.fruit.equals(appleBox.fruit)); //false
//        System.out.println(orangeBox.getFruit().equals(orangeBox.getFruit())); //true

        BoxOnSteroids boxWithoutType = new BoxOnSteroids(new Apple());
        BoxOnSteroids<Apple> boxWithApple = boxWithoutType;
        BoxOnSteroids<Orange> boxWithOrange = boxWithoutType;
        Apple apple = boxWithApple.getFruit();
        Orange orange = boxWithOrange.getFruit(); // ClassCastException
    }
}