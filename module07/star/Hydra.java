public class Hydra extends Unit implements Attackable{
    public Hydra(String name, int hp, int attackPower){
        super(name, hp, attackPower);
    }

    public void attack(Unit unit){
        System.out.println(this.name + " 이 " + unit.getName() + "을 침공격합니다");
        unit.setHp(this.attackPower);
    }
}
