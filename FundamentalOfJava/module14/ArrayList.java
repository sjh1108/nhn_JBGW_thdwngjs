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
        return this.elements[index];
    }

    public int size(){
        return this.index;
    }

    public void remove(){
        this.elements[--this.index] = null;
    }

    public boolean isEmpty(){
        return this.index == 0 ? true : false;
    }

    public void clear(){
        this.index = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>(){
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < index;
            }

            @Override
            public E next() {
                return elements[currentIndex++];
            }
        };
    }

}