public class Main {
    public static void main(String[] args) {
        Animal tiger = new Animal("Cats", "Tiger", 5, true);
        Animal lion = new Animal("Cats", "Lion", 8, true);
        Animal Tiger2 = new Animal("Cats", "Tiger", 5, true);

        Zoo myZoo = new Zoo("Belvedaire Zoo", "Tunis");
        Zoo myZoo2 = new Zoo("kef Zoo", "kef");

        System.out.println("Adding Tiger: " + myZoo.addAnimal(tiger));
        System.out.println("Adding Lion: " + myZoo.addAnimal(lion));
        System.out.println("Adding Tiger2: " + myZoo.addAnimal(Tiger2));

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

}
