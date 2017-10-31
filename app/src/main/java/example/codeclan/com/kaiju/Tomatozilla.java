package example.codeclan.com.kaiju;

/**
 * Created by user on 27/10/2017.
 */

public class Tomatozilla extends Kaiju {

    public Tomatozilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public void roar() {
        System.out.println("TOMATOZILLA: Onionsaur is a joke. I am Tomatosaur I mean Tomatozilla and I am the only good lizard.");
    }

    public void move() {
       System.out.println(this.getName() + " splattered all over the place.");
    }
}
