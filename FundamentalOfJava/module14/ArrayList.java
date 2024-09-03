import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> implements List<E> {
    private E[] elements;
    private int index = 0;

    @SuppressWarnings("unchecked")
    public ArrayList(){
        this.elements = (E[]) new Object[10];
    }

    public void add(E item){
        this.elements[this.index++] = item;
    }

    public E get(int index){
        return this.elements[index];
    }

    public int size(){
        return this.index;
    }

    public void remove(int index){
        for(int i = index; i < this.index; i++){
            this.elements[i] = this.elements[i+1];
            this.elements[i+1] = null;
        }
        this.index--;
    }

    public boolean isEmpty(){
        return this.index == 0;
    }

    public void clear(){
        for(int i = 0; i < this.index; i++){
            this.elements[i] = null;
        }

        this.index = 0;
    }

    public Iterator<E> iterator(){
        return Arrays.stream(this.elements, 0, this.index).iterator();
    }
}
