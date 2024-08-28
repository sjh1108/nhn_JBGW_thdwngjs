package Starcraft;
public class Marine extends Unit implements Attackable{
    public Marine(String name, int hp){
        super(name, hp);
    }

    public void attack(Unit unit){
        System.out.println(this.name + ": " + unit.name + " shot");
    }
}
