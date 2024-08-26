public class Hydra extends Unit{
    public Hydra(String name, int hp, int attackPower){
        super(name, hp, attackPower);
    }

    public void attack(Unit unit){
        System.out.println(this.name + " is chim attack to " + unit.getName());
        unit.setHp(this.attackPower);
    }
}
