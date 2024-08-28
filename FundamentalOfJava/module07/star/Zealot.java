public class Zealot extends Unit implements Attackable{
    public Zealot(String name, int hp, int attackPower){
        super(name, hp, attackPower);
    }

    public void attack(Unit unit){
        System.out.println(this.name + "이 " + unit.getName() + "을 사시미 공격합니다.");
        unit.setHp(this.attackPower);
    }
}
