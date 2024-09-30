public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    public final int nbrCages = 25;
    public int numAnimal;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.numAnimal = 0;
    }

    public boolean addAnimal(Animal animal) {

        if (searchAnimal(animal) == -1 && numAnimal < nbrCages) {
            animals[numAnimal] = animal;
            numAnimal++;
            return true;
        }
        return false;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("Animal: Family=" + animal.family + ", Name=" + animal.name +
                        ", Age=" + animal.age + ", Is Mammal=" + animal.isMammal);
            }
        }
    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < numAnimal; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i; // Return index if found
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {

            for (int i = index; i < numAnimal - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[numAnimal - 1] = null;
            numAnimal--;
            return true;
        }
        return false;
    }

    public boolean isZooFull() {
        return numAnimal >= nbrCages;
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        return (z1.numAnimal > z2.numAnimal) ? z1 : z2;
    }

    @Override
    public String toString() {
        return "Zoo: Name=" + name + ", City=" + city + ", Number of Animals=" + numAnimal + ", Number of Cages=" + nbrCages;
    }
}
