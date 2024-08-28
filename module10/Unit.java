public class Unit {
    protected String name;
    protected int hp;

    public Unit(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName(){
        return this.name;
    }
    public int hp(){
        return this.hp;
    }

    public void move(){
        System.out.println(this.name + ": is walking through the road");
    }
}
