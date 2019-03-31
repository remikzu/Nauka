package pl.sda.KlasyWewnetrzne.Nauka.InterfejsyFunkcyjne;


public class KlasaInterfejsFunkcyjny {

    @FunctionalInterface
    public interface GreetingModule {
        void sayHello();
    }

    public void someMethod() {
        GreetingModule greetingModule = new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Witaj świecie!");
            }
        };
    }

    // /\ to jest to samo, co to \/

    public class GreetingModuleClass implements GreetingModule {

        @Override
        public void sayHello() {
            System.out.println("Witaj świecie!");
        }
    }

    public void someMethod2() {
        GreetingModule greetingModule = new GreetingModuleClass();
    }



}
