package gestionzoo;
import zooentites.*;

public class ZooManagemnt {

public static void main(String[] args) {

        Animal lion = new Animal("cats", "Simba", 8, true);
        Animal dog = new Animal("dogs", "S", 8, true);
        Animal girafe = new Animal("girafe ", "himba", 8, true);
        Animal cate = new Animal("cat", "tom", 8, true);
        Animal lapin = new Animal("lapin", "carrote", 8, true);


        Zoo myZoo = new Zoo("Wildlife World", "Tunis");
        Zoo myZoo2 = new Zoo("eya", "Tunis");

        // Affichage des informations du zoo
        myZoo.display();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        // Affichage des informations de l'animal
        System.out.println(lion);
        System.out.println(lion.toString());

        // Ajout de l'animal au zoo
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo2.addAnimal(girafe));
        System.out.println(myZoo2.addAnimal(cate));
        System.out.println(myZoo2.addAnimal(lapin));
        //affichafe liste es animaux
        myZoo.display();
        myZoo.displayAnimal();
        //rechercher animaux
       System.out.println( myZoo.searchAnimal(dog));
       //supprimer aniamux
        System.out.println( myZoo.removeAnimal(dog));
         myZoo.setName("");
        myZoo.displayAnimal();
        //comparer zoo
        System.out.println(Zoo.comparerZoo(myZoo,myZoo2));
        Aquatic aqua=new Aquatic();
        Aquatic aqua2=new Aquatic("mer","fish", "serdina",5,true);
        Terrestrial terst=new Terrestrial(5,"panda","pandouda",10,true);
        Penguin penguin1=new Penguin( 12,"mer","Penguin", "paw",5,true);
        Dolphin daolph= new Dolphin(12f,"mer","Daulphin","dolphi",2,true);
        System.out.println(aqua2.toString());
        System.out.println(terst.toString());
        System.out.println(penguin1.toString());

    }
}
