package pl.sda.ModyfikatoryDostepu.Nauka.Dziedziczenie;

public class Tree {

    protected int height = 12;

    protected void prune() {
        if (height > 15) {
            height -= 1;
        }
    }

    public void grow() {
        height += 1;
    }

}
