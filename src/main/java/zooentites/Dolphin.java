package zooentites;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;
    public Dolphin(float swimmingSpeed,String habitat,String family, String name, int age, boolean isMammal){
       super(habitat, family, name, age, isMammal);
        this.swimmingSpeed = swimmingSpeed;


    }
    public String toString(){
        return super.toString()+"swimmmingSpeed"+this.swimmingSpeed;
    }

}
