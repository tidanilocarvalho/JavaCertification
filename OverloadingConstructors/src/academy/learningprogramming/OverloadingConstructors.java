package academy.learningprogramming;

class Dog {
    private String name;
    private String breed;
    private double weight;

    public Dog(String name) {
//        this.name = name;
//        breed = "husky";
//        weight = 30.0;

        //Dog("husky"); // does not compile
        //new Dog ("husky"); // this compile but does not what we want

        //System.out.println("constructor one");

        this(name, "husky"); // it must be the same statement in the constuctor body

        System.out.println("Constructor 1");
    }

    public Dog(String name, String breed) {
//        this.name = name;
//        this.breed = breed;
//        weight = 30.0;

        this(name, breed, 30); // constructor chain

        System.out.println("Constructor 2");
    }

    // this consctructor does the whole work for us
    public Dog(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;

        System.out.println("Constructor 3");
    }

    public void print() {
        System.out.println(name + " " + breed + " " + weight);
    }

}

public class OverloadingConstructors {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Jimmy");
        dog1.print();

        Dog dog2 = new Dog("Anthony", "shepard");
        dog2.print();

        Dog dog3 = new Dog("Rex", "german shepard", 40);
        dog3.print();
    }

}
