public class Zergling extends Unit implements Attackable{
    public Zergling(String name, int hp, int attackPower){
        super(name, hp, attackPower);
    }

    public void attack(Unit unit){
        System.out.println(this.name + "이 " + unit.getName() + "을 공격합니다.");
        unit.setHp(this.attackPower);
    }
}
