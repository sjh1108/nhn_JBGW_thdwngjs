import java.util.List;
import java.util.ArrayList;

public class PlayGround {
    public static void main(String[] args){
        Unit marine1 = new Marine("Marine 1", 20, 3);
        Unit hydra1 = new Hydra("Hydra 1", 20, 3);
        Unit zealot1 = new Zealot("Zealot 1", 100, 3);
        Unit dragoon1 = new Dragoon("Dragoon 1", 100, 3);
        Unit zergling1 = new Zergling("zergling 1", 30, 3);
        Unit medic1 = new Medic("Medic 1", 20, 1);

        List<Unit> list = new ArrayList<>();
        list.add(marine1);
        list.add(hydra1);
        list.add(zealot1);
        list.add(dragoon1);
        list.add(zergling1);

        for(Unit u: list){
            u.attack(marine1);
        }


        marine1.attack(hydra1);
        hydra1.attack(zealot1);
        zealot1.attack(dragoon1);
        zergling1.attack(marine1);
    }
}
