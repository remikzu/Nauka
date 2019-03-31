package pl.sda.TypyGeneryczne.Nauka.Figures;

public class BoxForFigures<T extends Figure> {

    private T element;

    public BoxForFigures(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public String getElementName() {
        return element.getName();
    }

}
