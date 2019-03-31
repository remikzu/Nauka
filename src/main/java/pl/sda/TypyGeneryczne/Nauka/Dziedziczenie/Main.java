package pl.sda.TypyGeneryczne.Nauka.Dziedziczenie;

import pl.sda.TypyGeneryczne.Nauka.Figures.*;
import pl.sda.TypyGeneryczne.Nauka.Fruits.Apple.Apple;

public class Main {
    public static void main(String[] args) {

        FancyBox<String> fancyBox = new FancyBox<>("something");
        fancyBox.saySomethingFancy();

        FancyBox<?> box = new FancyBox<>("object");
        box.object = null;
//        box.object = "xxx"; //compilation error - ? przyjmuje tylko
        System.out.println("Upper Bound Wild card:");
        upperBoundWildCard();
        System.out.println();
        System.out.println("Plain wild card:");
        plainWildcard();
        System.out.println();
        System.out.println("Lower Bound Wild Card:");
        lowerBoundWildCard();

    }

    private static void method1(FancyBox<?> box) {
        Object object = box.object;
        System.out.println(object);
    }

    private static void plainWildcard() {
        method1(new FancyBox<>(new Object()));
        method1(new FancyBox<>(new Square()));
        method1(new FancyBox<>(new Apple()));
    }

    private static void method2(FancyBox<? extends Figure> box) {
        Figure figure = box.object;
        System.out.println(figure);
    }

    private static void method3(FancyBox<Figure> box) {
        Figure figure = box.object;
        System.out.println(figure);
    }

    private static void method4(FancyBox<? super Rectangle> box) {
        box.object = null;
        box.object = new Square();
        box.object = new Rectangle();
//        box.object = new Circle(); //dziedziczenie z dolu
        System.out.println(box.object);
    }

    private static void upperBoundWildCard() {
        FancyBox<Figure> fancyFigureBox = new FancyBox<>(new Circle());
        FancyBox<Circle> fancyCircleBox = new FancyBox<>(new Circle());
        FancyBox<Square> fancySquareBox = new FancyBox<>(new Square());
        FancyBox<Rectangle> fancyRectangleBox = new FancyBox<>(new Rectangle());
        FancyBox<Triangle> fancyTriangleBox = new FancyBox<>(new Triangle());
        method2(fancyFigureBox);
        method2(fancyCircleBox);
        method2(fancySquareBox);
        method2(fancyRectangleBox);
        method2(fancyTriangleBox);
        method3(fancyFigureBox); // <- metoda 3 przyjmuje tylko argumenty typu Figure
//        method3(fancyTriangleBox);
        // method3(fancyRectangleBox); //compilation error
        // method3(fancySquareBox); // compilation error
    }

    private static void lowerBoundWildCard() {
        FancyBox<Figure> fancyFigureBoxWithSquare = new FancyBox<>(new Square());
        FancyBox<Rectangle> fancyRectangleBox = new FancyBox<>(new Rectangle());
        FancyBox<Triangle> fancyTriangleBox = new FancyBox<>(new Triangle());
        FancyBox<Square> fancySquareBox = new FancyBox<>(new Square());
        FancyBox<Rectangle> fancyRectangleBoxWithSquare = new FancyBox<>(new Square());
//        FancyBox<Rectangle> fancyRectangleWrongBox = new FancyBox<>(new Circle()); //circle nie należy do rectangle
        FancyBox<Figure> fancyFigureBoxWithCircles = new FancyBox<>(new Circle());

        method4(fancyFigureBoxWithSquare);
        method4(fancyRectangleBox);
//        method4(fancyTriangleBox); //nie kompiluje się, bo triangle nie należy do Rectangle
        method4(fancyRectangleBoxWithSquare);
        method4(fancyFigureBoxWithCircles);
//        method4(fancySquareBox); //nie kompuluje się, bo square jest "niżej" niż rectangle
    }
}
