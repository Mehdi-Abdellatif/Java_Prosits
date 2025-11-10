package interfaces;

public interface Omnivore<T> extends Herbivore,Carnivore {
    void eatPlantAndmeat(T food);
}
