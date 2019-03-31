package pl.sda.TypyGeneryczne.Nauka.Fruits.Apple;

public class AppleBox<A> {

    private Apple apple;

    public AppleBox(Apple apple) {
        this.apple = apple;
    }

    public Apple getApple() {
        return apple;
    }
}
