package main;


import entities.Animal;
import entities.Zoo;
import entities.ZooManagement;

public class Main {
    public static void main(String[] args) {
        ZooManagement z = new ZooManagement();
        Zoo myZoo = new Zoo("myZoo", "Tunis");
        Animal lion = new Animal("king", "simba", 5, true);
        Animal tiger = new Animal("siberian", "Tiger", 4, true);
        Animal a3 = new Animal("monkey", "ape", 2, true);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(a3);
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(lion));
        System.out.println(myZoo.searchAnimal(a3));


    }
}




