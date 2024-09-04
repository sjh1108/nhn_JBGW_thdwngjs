import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListStack<E> implements Stackable<E> {
    LinkedList<E> list;

    public LinkedListStack(){
        this.list = new LinkedList<>();
    }

    public boolean isEmpty(){
        return this.list.isEmpty();
    }

    @Override
    public void push(E element){
        this.list.add(element);
    }

    @Override
    public E pop(){
        return list.removeLast();
    }

    @Override
    public E top(){
        return list.getLast();
    }

    @Override
    public Iterator<E> iterator(){
        return new Iterator<E>() {
            int i = list.size()-1;

            @Override
            public boolean hasNext(){
                return this.i != 0;
            }

            @Override
            public E next(){
                return list.get(this.i--);
            }
        };
    }
}
