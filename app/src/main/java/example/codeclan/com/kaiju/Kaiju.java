package example.codeclan.com.kaiju;

/**
 * Created by user on 27/10/2017.
 */

public abstract class Kaiju {

    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public abstract String roar();
    public abstract String move();

    public int attack(Vehicle vehicle) {
        int currentHealth = vehicle.getHealthValue();
        vehicle.setHealthValue(currentHealth -= attackValue);
        System.out.println(this.name + " attacked " + vehicle.getType() + " for " + attackValue);
        System.out.println(vehicle.getType() + "now has " + vehicle.getHealthValue() + "health");
        if (vehicle.getHealthValue() < 0) {
            System.out.println(vehicle.getType() + " has been killed.");
        }
        return vehicle.getHealthValue();
    };

    public String getName() {
        return name;
    }
}
