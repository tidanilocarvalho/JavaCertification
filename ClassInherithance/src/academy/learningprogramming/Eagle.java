package academy.learningprogramming;

public class Eagle extends Bird {

    public int fly(int height) {
        System.out.println("Eagle is flying at " + height + " meters");
        return height;
    }

//    @Override
//    public int eat(int amount) {
//        super.eat(amount);
//        return amount;
//    }
}
