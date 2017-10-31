package example.codeclan.com.kaiju;

import static android.R.attr.start;

/**
 * Created by user on 31/10/2017.
 */

public class Runner {

    public static void main(String[] args){
        Onionsaur onionsaur = new Onionsaur("Ricky", 1000, 75);
        Tomatozilla tomatozilla = new Tomatozilla("Gregory", 800, 125);
        Tricycle tricycle = new Tricycle("Rusty", 12);
        ImperviousTank tank = new ImperviousTank("Grace", 20000);
        onionsaur.startMsg();
        onionsaur.attack(tank);
        tricycle.neoCannon(tomatozilla);
        tomatozilla.attack(tricycle);
        tank.slowlyBumpInto(tomatozilla);
        tank.slowlyBumpInto(onionsaur);
        tank.slowlyBumpInto(tomatozilla);
    }


}
