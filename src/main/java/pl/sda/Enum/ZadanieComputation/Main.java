package pl.sda.Enum.ZadanieComputation;

public class Main {

    public static void main(String[] args) {
        Computation.ADD.perform(1, 2);
        Computation.DIVIDE.perform(1, 2);
//        Computation.DIVIDE.perform(1, 0);
        Computation.MULTIPLY.perform(1, 2);
        Computation.SUBSTRACT.perform(1, 2);
        System.out.println(Computation.ADD.perform(1, 2));
        System.out.println(Computation.DIVIDE.perform(1, 2));
//        System.out.println(Computation.DIVIDE.perform(1, 0));
        System.out.println(Computation.MULTIPLY.perform(1, 2));
        System.out.println(Computation.SUBSTRACT.perform(1, 2));
    }

}
