public class Marine extends Unit implements Attackable{
    public Marine(String name, int hp, int attackPower){
        super(name, hp, attackPower);
    }

    public void attack(Unit unit){
        System.out.println(this.name + " 이 " + unit.getName() + "을 원거리에서 기관총 공격합니다.");
        unit.setHp(this.attackPower);
    }
}
