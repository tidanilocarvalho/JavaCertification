package academy.learningprogramming;

public class Snake extends Repitle {

    @Override
    protected boolean hasLegs() {
        return false;
    }

    @Override
    public double getWeight() {
        return 10;
    }
}
