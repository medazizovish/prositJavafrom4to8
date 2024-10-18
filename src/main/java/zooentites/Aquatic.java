package zooentites;

public  non-sealed  class Aquatic extends Animal{
     protected String habitat;

     public Aquatic(){}
    public Aquatic(String habitat,String family, String name, int age, boolean isMammal){
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }

    @Override
    public String toString(){
        return super.toString()+"habitat"+this.habitat;
    }

}
