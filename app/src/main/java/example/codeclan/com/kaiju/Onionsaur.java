package example.codeclan.com.kaiju;

/**
 * Created by user on 27/10/2017.
 */

public class Onionsaur extends Kaiju {

    public Onionsaur(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public void roar() {
        System.out.println("ONIONSAUR: I am Onionsaur. I am a very good lizard.");
    }

    public void move() {
        System.out.println(this.getName() + " stomped around and stank the place up.");
    }
}
