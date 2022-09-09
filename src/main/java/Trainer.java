public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting

        getToSpeak(a);

        Animal d2 = (Duck) a; // downcasting
        getToSpeak(d2);

        train(new Duck());
        // train(new Parrot());


    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    // When invoking a method, Java will find the most underlying object (the most exact object) and invoke the method
    // of that object.

    private static void train(Bird bird) {
        Duck d = (Duck) bird;
        d.swim();
    }
}
