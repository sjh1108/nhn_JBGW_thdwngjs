package List;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> implements List<E> {
    private E[] elements;
    private int index = 0;

    @SuppressWarnings("unchecked")
    public ArrayList(){
        this.elements = (E[]) new Object[50];
    }

    public void add(E item){
        this.elements[this.index++] = item;
    }

    public E get(int index){
        return this.elements[index-1];
    }

    public int size(){
        return this.index;
    }

    public void remove(int index){
        // this.elements[--this.index] = null;

        for(int i = index; i < this.index; i++){
            this.elements[i] = this.elements[i+1];
            this.elements[i+1] = null;
        }
        this.index--;
    }

    public boolean isEmpty(){
        return this.index == 0 ? true : false;
    }

    public void clear(){
        Arrays.fill(elements, null);
        this.index = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return Arrays.stream(elements, 0, index).iterator();
    }

}