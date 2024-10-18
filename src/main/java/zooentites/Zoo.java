package zooentites;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    final int nbCages=25;
    int animalCount = 0;
    private Aquatic[] aquaticAnimals;


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbCages];
        this.aquaticAnimals = new Aquatic[10];
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        if(name.isBlank()){
            System.out.println("Invalid name:");
        }
        else {
            this.name = name;
        }
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Zoo{" +

                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbCages=" + nbCages +
                '}';
    }


    public void display() {
        System.out.println("name: " + this.name + ", city: " + this.city + ", nbCages: " + this.nbCages);
    }

    // Méthode pour ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux.");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal est déjà dans le zoo.");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        System.out.println(animal.getName() + " a été ajouté au zoo.");
        return true;
    }

    public void displayAnimal() {
        System.out.println("list of animls" + name + "");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }
// rechercher un animal
public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < animalCount; i++) {
            if (animal.getName() == animals[i].getName()) {
                return i;
            }

        }
        return index;
    }

//supprimer animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("L'animal n'existe pas dans le zoo.");
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        System.out.println(animal.getName() + " a été supprimé du zoo.");
        return true;  }
    //verifier la capacité de zoo
    public boolean isZooFull() {
           if( animalCount >= nbCages){
               return true;
           }
           return false;
    }
    //comparer les zoo
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z1.animalCount < z2.animalCount) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return z1;
        }
    }

    //

}

