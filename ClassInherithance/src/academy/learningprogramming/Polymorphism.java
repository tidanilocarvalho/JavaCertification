package academy.learningprogramming;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {

    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Rex");

        //UP CASTING
        Dog dog = husky; // another reference to Husk object in memory
        dog.printDetais();

        HasTail hasTail = husky;
        System.out.println("tail lenght= " + hasTail.getTailLenght());

        CanRun canRun = husky;
        canRun.run(5);

        Animal animal = husky;
        animal.printDetais();

        Object object = husky;

        Dog myDog = (Dog) animal;
        dog.printName();

        //DOWN CASTING
        Animal cat = new Cat(2);
        Cat myCat = (Cat) cat;
        ((Cat) cat).getSpeed();
        myCat.getSpeed();

       // Bear bear = (Bear) "test"; // not related in hierarchy

        //Dog newDog = (Dog) cat; // class cast exception

        // it is not polymorphic
        Bird bird = new Bird();
        Object birdObject = bird;

        Eagle eagle = new Eagle();
        Bird eagleBird = eagle;
        Object eagleObject = eagle;

        List<String> list = new ArrayList<>();

        Animal rabbitAnimal = new Rabbit();
        rabbitAnimal.printDetais();
    }

}
