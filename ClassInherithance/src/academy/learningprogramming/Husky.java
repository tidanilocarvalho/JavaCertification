package academy.learningprogramming;

public class Husky extends Dog {

    public Husky(int age) {
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Husky eating");

        super.eat();
    }

    @Override
    protected void printName() {
        System.out.println("Husky name = " + getName());
    }

    @Override
    public int getWeight() {
        return 30;
    }

    @Override
    public int getTailLenght() {
        return 20;
    }

    @Override
    public void run(int speed) {
        System.out.println("husky running at speed=" + speed);
    }
}
