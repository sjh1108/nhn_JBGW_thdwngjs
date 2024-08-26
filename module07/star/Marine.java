public class Marine extends Unit{
    public Marine(String name, int hp, int attackPower){
        super(name, hp, attackPower);
    }

    public void attack(Marine marine){
        System.out.println(this.name + " is gun attack to " + marine.getName());
        marine.setHp(this.attackPower);
    }
}
