package pl.sda.FormatowanieDanychWejsciowych;

import java.math.BigInteger;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    public static void main(String[] args) {
        double x = 10000.0 / 3.0;
        System.out.println(x);
        System.out.printf("%6.2f", x);
        System.out.println();
        String name = "Roman";
        String name2 = "costam";
        int age = 25;
        System.out.printf("Witaj, %s. W %s przyszłym roku będę mieć lat %d", name, name2, age);
        System.out.println();
        System.out.printf("%,.2f", 10000.0 / 3.0);

    }

}
