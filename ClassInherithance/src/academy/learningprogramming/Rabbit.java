package academy.learningprogramming;

public class Rabbit extends Animal implements Herbivore, Hop {

    public Rabbit() {
        //super; //does not compile
        //super().setAge(); // does not compile

        super();
        //super.setAge(3);
        //this.setAge(3);
        //setAge(3);
    }

    public Rabbit(int age) {
        //this(age); //it call itself does not compile

        //super();
        //this();
        //setAge(3);

        super(3);
    }

    @Override
    public int getWeight() {
        return 3;
    }

    @Override
    public void printName() {

    }

    @Override
    public void printDetais() {
        System.out.println("Rabbit average jump height is = " + Hop.getAverageJumpHeight());
    }
}
