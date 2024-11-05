package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

import static tn.esprit.gestionzoo.enums.Food.MEAT;

public class Main {
    public static void main(String[] args) throws InvalidAgeException  {
        Animal lion = null;
        try {
            lion = new Animal("Cats", "Simba", 8, true);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");

        Animal dog = null;
        try {
            dog = new Animal("Canine", "Snoopy", 2, true);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        Animal cat = null;
        try {
            cat = new Animal("Canine", "Snoopy", 3, true);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            myZoo.addAnimal(lion);
            System.out.println("Lion added successfully.");
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            myZoo.addAnimal(dog);
            System.out.println("Dog added successfully.");
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        myZoo.displayAnimals();

        System.out.println("Search Dog: " + myZoo.searchAnimal(dog));
        Animal dog2 = null;
        try {
            dog2 = new Animal("Canine", "lll", 2, true);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Search Invalid Dog: " + myZoo.searchAnimal(dog2));

        myZoo.displayAnimals();

        System.out.println(myZoo);

        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(dog);
            myZoo.addAnimal(dog2);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        myZoo.displayAnimals();

        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println("Comparing Zoos: " + notMyZoo1);

        System.out.println("-------------------------------------------------------");

        Aquatic aquatic = null;
        Terrestrial terrestrial = null;
        Penguin penguin = null;  // Declare penguin once here

        try {
            aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
            terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
            Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
            penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);  // Assign penguin here

            System.out.println(aquatic);
            System.out.println(terrestrial);
            System.out.println(dolphin);
            System.out.println(penguin);

            aquatic.swim();
            dolphin.swim();
            penguin.swim();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        Penguin HHJ = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

        aquatic.eatMeat(Food.MEAT);
        terrestrial.eatPlantAndMeet(Food.BOTH);
        penguin.eatMeat(MEAT);  // penguin is accessible here
    }
}
