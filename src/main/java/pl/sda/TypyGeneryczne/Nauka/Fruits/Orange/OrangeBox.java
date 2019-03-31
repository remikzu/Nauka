package pl.sda.TypyGeneryczne.Nauka.Fruits.Orange;

public class OrangeBox<O> {

    private Orange orange;

    public OrangeBox(Orange orange) {
        this.orange = orange;
    }

    public Orange getOrange() {
        return orange;
    }
}
