package pl.sda.KlasyWewnetrzne.Nauka.InterfejsyFunkcyjne;

public class AnonymousClasses {

    public static class Robot {

        private final KlasaInterfejsFunkcyjny.GreetingModule greeting;

        public Robot(KlasaInterfejsFunkcyjny.GreetingModule greeting) {
            this.greeting = greeting;
        }

        public void saySomething() {
            greeting.sayHello();
        }

    }

    public static void main(String[] args) {
        Robot jan = new Robot(new KlasaInterfejsFunkcyjny.GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Witaj świecie!");
            }
        });

        Robot john = new Robot(new KlasaInterfejsFunkcyjny.GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Hello world!");
            }
        });

        Robot johaness = new Robot(new KlasaInterfejsFunkcyjny.GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("guten morgen!");
            }
        });

        jan.saySomething();
        john.saySomething();
        johaness.saySomething();
        System.out.println(jan.getClass());
    }
}
