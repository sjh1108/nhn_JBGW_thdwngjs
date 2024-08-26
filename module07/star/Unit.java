public class Unit {
    protected String name;
    protected int hp;
    protected int attackPower;
    
    public Unit(String name, int hp, int attackPower){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public void attack(Unit unit){
        System.out.println(this.name + " is attack to " + unit.getName());
        unit.setHp(unit.getHp() - this.attackPower);
    }

    public String getName(){
        return this.name;
    }

    public int getHp(){
        return this.hp;
    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public void setHp(int hp){
        this.hp = hp;
    }
}
