package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        Animal tiger = new Animal("Cats", "Tiger", 5, true);
        Animal lion = new Animal("Cats", "Lion", 8, true);
        Animal tiger2 = new Animal("Cats", "Tiger", 5, true);

        Zoo myZoo = new Zoo("Belvedere Zoo", "Tunis");
        Zoo myZoo2 = new Zoo("Kef Zoo", "Kef");

        System.out.println("Adding Tiger: " + myZoo.addAnimal(tiger));
        System.out.println("Adding Lion: " + myZoo.addAnimal(lion));
        System.out.println("Adding Tiger2: " + myZoo.addAnimal(tiger2));

        myZoo.displayAnimals();

        int index = myZoo.searchAnimal(tiger);
        if (index != -1) {
            System.out.println("Tiger found at index: " + index);
        } else {
            System.out.println("Tiger not found.");
        }

        System.out.println("Removing Tiger: " + myZoo.removeAnimal(tiger));
        myZoo.displayAnimals();

        System.out.println("Is zoo full? " + myZoo.isZooFull());

        Zoo largerZoo = Zoo.compareZoo(myZoo, myZoo2);
        System.out.println("The zoo with more animals is: " + largerZoo);

        System.out.println("-------------------------------------------------------");

        Dolphin dolphin = new Dolphin("Cetacea", "Dolphin", 9, true, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Penguin", 4, false, "Antarctica", 200.0f);

        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        System.out.println("Swimming behavior of aquatic animals:");
        for (Aquatic aquaticAnimal : myZoo.getAquaticAnimals()) {
            if (aquaticAnimal != null) {
                aquaticAnimal.swim();
            }
        }

        System.out.println("Maximum swimming depth of penguins: " + myZoo.maxPenguinSwimmingDepth() + " meters");

        myZoo.displayNumberOfAquaticsByType();

        System.out.println("-------------------------------------------------------");
    }
}
