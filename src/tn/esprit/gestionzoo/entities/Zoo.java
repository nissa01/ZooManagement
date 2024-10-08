package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int numAnimal;

    public Zoo(String name, String city) {
        setName(name);  // Validating name
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.numAnimal = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Zoo name cannot be empty");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean addAnimal(Animal animal) {
        if (!isZooFull() && searchAnimal(animal) == -1) {
            animals[numAnimal] = animal;
            numAnimal++;
            return true;
        }
        return false;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("Animal: Family=" + animal.getFamily() + ", Name=" + animal.getName() +
                        ", Age=" + animal.getAge() + ", Is Mammal=" + animal.isMammal());
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < numAnimal; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
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
