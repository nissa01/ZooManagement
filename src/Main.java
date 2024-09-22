public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Cats", "Lion", 4, true);
        Zoo myZoo = new Zoo("Belvedaire Zoo", "Tunis", 20);
        myZoo.addAnimal(lion, 0);

        System.out.println(myZoo);

        myZoo.displayAnimals();
    }
}
