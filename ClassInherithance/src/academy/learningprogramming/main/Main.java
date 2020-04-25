package academy.learningprogramming.main;

import academy.learningprogramming.*;

public class Main {

    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Rex");
        husky.printDetais();
        husky.setAge(6);
//        husky.printName();
        husky.printDetais();
        husky.run(10);
        System.out.println("tail lenght=" + husky.getTailLenght());
        System.out.println("weight=" + husky.getWeight());

//        Dog dog = new Dog(3);
//        dog.setName("Rex");
//        dog.printDetais();

        husky.eat();
        husky.printDetais();

        System.out.println("avg=" + husky.getAverageWeight());

        Bear bear = new Bear();
        bear.setName("Jimmy");
        bear.setAge(10);
        bear.eatMeat();
        bear.eatPlants();
        bear.printDetais();

        Rabbit rabbit = new Rabbit();
        rabbit.eatPlants();
        rabbit.getAverageWeight();

        Cat cat = new Cat(3);
        int speed = cat.getSpeed();
        System.out.println("cat speed is =" + speed);
    }

}
