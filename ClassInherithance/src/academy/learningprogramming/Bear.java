package academy.learningprogramming;

public class Bear extends Animal implements Onivore {

    @Override
    public void eatMeat() {
        System.out.println("Bear eating meat");
    }

    @Override
    public void eatPlants() {
        System.out.println("Bear eating plants");
    }

    @Override
    protected void printName() {
        System.out.println("Bear");
    }

    @Override
    public int getWeight() {
        return 2000;
    }
}
