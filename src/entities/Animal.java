package entities;

public class Animal {
    private String family;
    private String name;
    public String getName() { return name; }
    private int age;
    private boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        if (age < 0) throw new IllegalArgumentException("Un animal ne peut pas avoir un âge négatif");
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "main.Animal{family='" + family + "', name='" + name + "', age=" + age + ", isMammal=" + isMammal + "}";
    }
}
