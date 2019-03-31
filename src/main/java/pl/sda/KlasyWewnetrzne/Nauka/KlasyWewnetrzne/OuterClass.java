package pl.sda.KlasyWewnetrzne.Nauka.KlasyWewnetrzne;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OuterClass {

    public class InnerClass {

    }

    private InnerClass instantiate() {
        return new InnerClass();
    }

    public static class InnerClass2 {


    }
    private InnerClass2 instantiate2() {
        return new InnerClass2();
    }

    OuterClass.InnerClass2 instance1 = new InnerClass2();

    private static void instantiateInnerClassMethod(String[] args) {
        class LocalClass {
            @Override
            public String toString() {
                return "Argument metody: " + Arrays.toString(args);
            }
        }
        LocalClass localClassInstance = new LocalClass();
        System.out.println(localClassInstance);
    }

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass instance1 = outerClass.instantiate();
        OuterClass.InnerClass instance3 = outerClass.new InnerClass();

//        OuterClass.InnerClass2 instance4 = outerClass.new InnerClass2(); //bo nie może być static

        Map<String, Integer> dayInMonths = new HashMap<>();
        dayInMonths.put("styczen", 31);
        dayInMonths.put("luty", 28);
        dayInMonths.put("marzec", 31);

        for(Map.Entry<String, Integer> entry : dayInMonths.entrySet()){
            System.out.println(entry.getKey() + " ma " + entry.getValue() + " dni");
        }
    }

}
