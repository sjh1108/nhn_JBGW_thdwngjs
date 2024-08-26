public class Dragoon extends Unit implements Attackable{
    public Dragoon(String name, int hp, int attackPower){
        super(name, hp, attackPower);
    }

    public void attack(Unit unit){
        System.out.println(this.name + " is balsa attack to " + unit.getName());
        unit.setHp(this.attackPower);
    }
}
