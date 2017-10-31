package example.codeclan.com.kaiju;

/**
 * Created by user on 27/10/2017.
 */

public class Tomatozilla extends Kaiju {

    public Tomatozilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "Onionsaur is a joke. I am Tomatosaur and I am the only good lizard.";
    }

    public String move() {
        return this.getName() + " splattered all over the place.";
    }
}
