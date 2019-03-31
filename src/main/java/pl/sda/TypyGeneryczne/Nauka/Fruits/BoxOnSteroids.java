package pl.sda.TypyGeneryczne.Nauka.Fruits;

public class BoxOnSteroids<T> {
    public T fruit;

    public BoxOnSteroids(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }
}