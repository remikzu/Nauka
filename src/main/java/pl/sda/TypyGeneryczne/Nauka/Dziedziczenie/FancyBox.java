package pl.sda.TypyGeneryczne.Nauka.Dziedziczenie;

public class FancyBox<T> extends StandardBox<T> {

    public FancyBox(T object) {
        super(object);
    }

    public void saySomethingFancy() {
        System.out.println("our " + object + " is fancy!");
    }


}
