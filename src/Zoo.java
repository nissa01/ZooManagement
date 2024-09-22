public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    public int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }

    public void addAnimal(Animal animal, int index) {
        if (index < animals.length) {
            animals[index] = animal;
        } else {
            System.out.println("Zoo is full. Cannot add more animals.");
        }
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo: Name=" + name + ", City=" + city + ", Number of Cages=" + nbrCages;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("Animal: Family=" + animal.family + ", Name=" + animal.name +
                        ", Age=" + animal.age + ", Is Mammal=" + animal.isMammal);
            }
        }
    }
}
