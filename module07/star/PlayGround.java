public class PlayGround {
    public static void main(String[] args){
        Marine marine1 = new Marine("Marine 1", 20, 3);
        Hydra hydra1 = new Hydra("Hydra 1", 20, 3);
        Zealot zealot1 = new Zealot("Zealot 1", 100, 3);
        Dragoon dragoon1 = new Dragoon("Dragoon 1", 100, 3);
        Zergling zergling = new Zergling("zergling 1", 30, 3);


        marine1.attack(hydra1);
        hydra1.attack(zealot1);
        zealot1.attack(dragoon1);
        zergling.attack(marine1);
    }
    
}
