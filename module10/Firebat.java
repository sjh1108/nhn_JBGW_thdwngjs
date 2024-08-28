public class Firebat extends Unit implements Attackable{

    public Firebat(String name, int hp){
        super(name, hp);
    }
    
    public void attack(Unit u){
        System.out.println(this.name + ": " + u.getName() + " burn it out");
    }
}
