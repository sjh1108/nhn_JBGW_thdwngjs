public class Zealot extends Unit{
    public Zealot(String name, int hp, int attackPower){
        super(name, hp, attackPower);
    }

    public void attack(Unit unit){
        System.out.println(this.name + " is sashimi attack to " + unit.getName());
        unit.setHp(this.attackPower);
    }
}
