public class Singleton {
    private static Singleton singleton;
    private int number;

    private Singleton(){}

    public synchronized int nextNumber(){
        return this.number++;
    }

    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }
}