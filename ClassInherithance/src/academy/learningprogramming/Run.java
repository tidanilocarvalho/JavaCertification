package academy.learningprogramming;

public interface Run extends Walk {

    default int getSpeed() {
        return 10;
    }

}
