package Starcraft;
public class Mutal extends Unit implements Attackable{
    public Mutal(String name, int hp){
        super(name, hp);
    }
    
    public void move(){
        System.out.println(this.name + ": fly moving");
    }

    public void attack(Unit u){
        System.out.println(this.name + ": " + u.getName() + " eunga balsa");
    }
}
