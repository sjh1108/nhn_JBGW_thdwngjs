import java.util.List;
import java.util.ArrayList;

public class Playground {
    public static void main(String[] args){
        Unit marine1 = new Marine("M1", 20);
        Unit firebat1 = new Firebat("F1", 20);
        Unit mutal1 = new Mutal("MU1", 20);
        Unit observer1 = new Observer("O1", 10);

        List<Unit> list = new ArrayList<>();
        list.add(marine1);
        list.add(firebat1);
        list.add(mutal1);
        list.add(observer1);

        for(Unit u : list){
            u.move();
        }
        
        for(Unit u: list){
            if(u instanceof Attackable){
                ((Attackable)u).attack(mutal1);
            }
        }
    }
}
