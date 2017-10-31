package example.codeclan.com.kaiju;

/**
 * Created by user on 27/10/2017.
 */

public class Tricycle extends Vehicle implements Arsenal {

    public Tricycle(String type, int healthValue) {
        super(type, healthValue);
    }

    public void slowlyBumpInto(Kaiju target){
        System.out.println(getType() + " the Tricycle collides into " + target.getName() + " at a low to moderate speed!!");
        int damage = -2;
        target.setHealthValue(damage);
    }

    public void neoCannon(Kaiju target){
        System.out.println(getType() + " the Tricycle surprises " + target.getName() + " with it's neoKannon onslaught");
        int damage = -200;
        target.setHealthValue(damage);
    }



}
