import java.util.LinkedList;

public interface Queue<E> {
    public void enequeue(E e);
    public E dequeue();
    public int size();
}

class LinkedListQueue<E> implements Queue<E>{
    LinkedList<E> list = new LinkedList<>();

    public LinkedListQueue(){
        this.list = new LinkedList<>();
    }

    public void enequeue(E e){
        this.list.add(e);
    }

    public E dequeue(){
        return this.list.removeFirst();
    }

    public int size(){
        return this.list.size();
    }
}