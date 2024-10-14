package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;

public class Main {
    public static void main(String[] args) {

        Dolphin dolphin = new Dolphin("Cetacea", "Dolphin", 9, true, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Penguin", 4, false, "Antarctica", 200.0f);
        Terrestrial lion = new Terrestrial("Felidae", "Lion", 5, true, 4);
        Aquatic genericAquatic = new Aquatic("Generic Family", "Generic Aquatic", 3, true, "Generic Habitat");


        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(lion);
        genericAquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
       /* Animal tiger = new Animal("Cats", "Tiger", 5, true);
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
    }
}*/
