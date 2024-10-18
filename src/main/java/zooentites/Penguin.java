package zooentites;

public class Penguin extends Aquatic{
    private  float swimmingDepth;
    public Penguin(){}
    public Penguin(float swimmingDepth,String habitat,String family, String name, int age, boolean isMammal){
        super(habitat, family, name, age, isMammal);
        this.swimmingDepth =swimmingDepth;}

    @Override
    public String toString(){
        return super.toString()+"swimmmingDepth"+this.swimmingDepth;
    }

}
