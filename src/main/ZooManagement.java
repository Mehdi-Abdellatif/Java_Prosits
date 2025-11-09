package main;

import entities.*;
import exceptions.InvalidAgeException;
import exceptions.ZooFullException;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement z = new ZooManagement();

        Terrestrial terrestrial = new Terrestrial("mammal", "elephant", 10, true, 4);
        Dolphin dolphin = new Dolphin("mammal", "flipper", 5, true, "atlantic", 22.3f);
        Penguin penguin = new Penguin("bird", "pingu", 3, false, "antarctica", 18.0f);


        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        dolphin.swim();
        penguin.swim();

        Zoo myZoo = new Zoo("myZoo", "Tunis");
        Animal lion = new Animal("king", "simba", 5, true);
        Animal tiger = new Animal("siberian", "Tiger", 4, true);
        Animal a3 = new Animal("monkey", "ape", 2, true);

        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(tiger);
            myZoo.addAnimal(a3);
        }catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : "+ e.getMessage());
        }
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        myZoo.displayAquaticSwims();



        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(lion));
        System.out.println(myZoo.searchAnimal(a3));
    }
}