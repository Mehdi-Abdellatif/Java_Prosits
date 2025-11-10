package entities;

import enumerations.Food;
import interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }

    @Override
    public void eatMeat(Object meat) {
        if (meat.equals(Food.MEAT)) {System.out.println("This terrestrial animal eats "+Food.MEAT);}
    }

    @Override
    public void eatPlant(Object plant) {
        if (plant.equals(Food.PLANT)) {System.out.println("This terrestrial animal eats "+Food.PLANT);}
    }

    @Override
    public void eatPlantAndmeat(Food food) {
        if (food.equals(Food.BOTH)) {System.out.println("This terrestrial animal eats "+Food.BOTH);}
    }
}
