package pl.sda.TypyGeneryczne.Nauka.Fruits.Pair;

public class Pair<T, S> {

    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        System.out.println("lala");
        return first;
    }

    public S getSecond() {
        System.out.println("lele");
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
