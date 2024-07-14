
interface Animal {
    void walk();

    void sound();
}


public class AnonymousClass {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void walk() {
                System.out.println("Cat can walk on 4 legs");
            }

            @Override
            public void sound() {
                System.out.println("Meow Meow...");
            }
        };

        cat.walk();
    }
}
