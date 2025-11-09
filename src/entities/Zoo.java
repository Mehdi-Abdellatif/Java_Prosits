package entities;

public class Zoo{
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int nbrAquaticAnimals = 0;
    public Zoo(String name, String city) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Le nom d’un main.Zoo ne doit pas être vide");
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "main.Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + "}";
    }


    public void displayAnimals() {
        for (int i = 0; i < nbrAnimals; i++) System.out.println(animals[i]);
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName()))
                return i;
        }
        return -1;
    }
    public boolean addAnimal(Animal animal) {
        if ( isZooFull() || searchAnimal(animal) != -1 ) return false;
        animals[nbrAnimals++] = animal;
        return true;
    }
    boolean removeAnimal(Animal animal) {
        int i = searchAnimal(animal);
        if (i == -1) return false;
        animals[i] = null;
        return true;
    }
    boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquatic == null || nbrAquaticAnimals >= aquaticAnimals.length) return;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] != null && aquaticAnimals[i].getName().equals(aquatic.getName()))
                return;
        }
        aquaticAnimals[nbrAquaticAnimals++] = aquatic;
    }
    public void displayAquaticSwims() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] != null) {
                aquaticAnimals[i].swim();
            }
        }
    }
    public float maxPenguinSwimmingDepth() {
        float max = 0f;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            Aquatic a = aquaticAnimals[i];
            if (a instanceof Penguin) {
                float d = ((Penguin) a).getSwimmingDepth();
                if (d > max) max = d;
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphins = 0, penguins = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            Aquatic a = aquaticAnimals[i];
            if (a instanceof Dolphin) dolphins++;
            else if (a instanceof Penguin) penguins++;
        }
        System.out.println("Dolphins: " + dolphins);
        System.out.println("Penguins: " + penguins);
    }

}

