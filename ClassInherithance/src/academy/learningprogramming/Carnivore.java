package academy.learningprogramming;

public interface Carnivore {

    default void eatMeat() {
        System.out.println("Eating meat");
    }

}
