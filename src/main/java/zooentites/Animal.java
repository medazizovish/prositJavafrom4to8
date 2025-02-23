package zooentites;

public  sealed  class Animal permits Aquatic,Terrestrial {
     private String family;
     private String name;
     private int age;
     private boolean isMammal;
     public Animal(){}

     public Animal(String family, String name, int age, boolean isMammal) {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setAge(int age) {
         if(age<0){
             System.out.println("Invalid age");
         }
        this.age = age;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }


}
