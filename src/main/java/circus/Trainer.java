package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck("Donald");
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting

        getToSpeak(a);

        Animal d2 = (Duck) a; // downcasting
        getToSpeak(d2);

<<<<<<< HEAD:src/main/java/Trainer.java
        train(new Duck());
        // train(new Parrot());


=======
        train(new Duck("Daisy"));
        // train(new animal.Parrot());
>>>>>>> 4171f38e4bcc7f62eca0ce4093b0beb05d87ce96:src/main/java/circus/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    // When invoking a method, Java will find the most underlying object (the most exact object) and invoke the method
    // of that object.

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
