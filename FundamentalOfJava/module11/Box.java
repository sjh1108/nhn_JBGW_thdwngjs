public class Box <T, K>{
    private T item;
    private K key;

    public Box(T item, K key){
        this.item = item;
        this.key = key;
    }

    public void set(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
}
