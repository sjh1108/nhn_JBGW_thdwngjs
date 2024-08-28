public class Observer extends Unit{
    public Observer(String name, int hp){
        super(name, hp);
    }

    public void move(){
        System.out.println(this.name + ": fly move");
    }
}
