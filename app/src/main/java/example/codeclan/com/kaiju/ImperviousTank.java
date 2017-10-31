package example.codeclan.com.kaiju;

/**
 * Created by user on 27/10/2017.
 */

public class ImperviousTank extends Vehicle {

    public ImperviousTank(String type, int healthValue) {
        super(type, healthValue);
    }

    public void slowlyBumpInto(Kaiju target){
        System.out.println(getType() + " the Tank kind of rolls up again " + target.getName() + ", to no discernible effect.");
        int damage = -1;
        target.setHealthValue(damage);
    }

    public void neoCannon(Kaiju target){
        System.out.println(getType() + "  the Tank attacks" + target.getName() + " with an impressive show of neoKannon style force.");
        int damage = -400;
        target.setHealthValue(damage);
    }
}
