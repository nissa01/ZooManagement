package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private final int maxAquatic = 10;

    private int numAnimal;
    private int numAquatic;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[maxAquatic];
        this.numAnimal = 0;
        this.numAquatic = 0;
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

    public void addAquaticAnimal(Aquatic aquatic) {
        if (numAquatic < aquaticAnimals.length) {
            aquaticAnimals[numAquatic] = aquatic;
            numAquatic++;
            System.out.println(aquatic.getName() + " has been added to the aquatic animals.");
        } else {
            System.out.println("The zoo's aquatic animals section is full!");
        }
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
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

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimal;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimal instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Number of dolphins: " + dolphinCount);
        System.out.println("Number of penguins: " + penguinCount);
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        return (z1.numAnimal > z2.numAnimal) ? z1 : z2;
    }

    @Override
    public String toString() {
        return "Zoo: Name=" + name + ", City=" + city + ", Number of Animals=" + numAnimal + ", Number of Cages=" + nbrCages;
    }
}
