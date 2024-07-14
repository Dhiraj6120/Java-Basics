
@FunctionalInterface
interface Animal {
    void walk(int a);

//    void sound();
}


public class AnonymousClass {
    public static void main(String[] args) {

        //This is for Anonymous class understanding
        Animal cat = new Animal() {
            @Override
            public void walk(int a) {
                System.out.println("Cat can walk on " +  a + " legs");
            }

//            @Override
//            public void sound() {
//                System.out.println("Meow Meow...");
//            }
        };

        cat.walk(2);

        //this is instantiat using the Lambda
        Animal Dog = (a) -> {
            System.out.println("This is from the Lambda expressions " + a);
        };
        Dog.walk(45);
    }
}
