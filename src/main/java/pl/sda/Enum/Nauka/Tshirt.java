package pl.sda.Enum.Nauka;

public class Tshirt {

    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size=" + size +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public void tellMoreAboutSize() {
        switch (size) {
            case S:
                System.out.println("Kupiłeś bluzkę w rozmiarze S");
                break;
            case M:
                System.out.println("Kupiłeś bluzkę w rozmiarze M");
                break;
            case L:
                System.out.println("Kupiłeś bluzkę w rozmiarze L");
                break;
            case XL:
                System.out.println("Kupiłeś bluzkę w rozmiarze XL");
                break;
        }
    }

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.XL, "cotton");
        System.out.println(tshirt);
        tshirt.tellMoreAboutSize();
    }
}
