package academy.learningprogramming;

public class Cat extends Animal implements Run{

    public Cat(int age) {
        super(age);
    }

    @Override
    public void printName() {

    }

    @Override
    public int getWeight() {
        return 5;
    }

    @Override
    public int getSpeed() {
        return 15;
    }
}
