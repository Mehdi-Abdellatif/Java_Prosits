package entities;

import java.util.Objects;

public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }



    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }

    public abstract void swim();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aquatic other = (Aquatic) o;
        return getAge() == other.getAge()
                && Objects.equals(getName(), other.getName())
                && Objects.equals(habitat, other.habitat);
    }
}
