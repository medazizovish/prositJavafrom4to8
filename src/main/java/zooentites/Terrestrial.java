package zooentites;

public final class Terrestrial extends Animal{
    private int nbLegs;
    public Terrestrial(){}
    public Terrestrial(int nbLegs,String family, String name, int age, boolean isMammal){
        super(family,name,age,isMammal);
        this.nbLegs=nbLegs;
    }

    @Override

    public String toString(){
        return super.toString()+"nbLegs"+this.nbLegs;
    }
}
