package academy.learningprogramming;

public interface Herbivore {

    default void eatPlants() {
        System.out.println("Eating plants");
    }

    //default int getRequiredPlantAmount();
//    public int getRequiredPlantAmount() {
//        return 10;
//    }
}
