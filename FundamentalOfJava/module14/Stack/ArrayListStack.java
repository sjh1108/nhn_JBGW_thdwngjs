package Stack;
import java.util.Iterator;

import List.ArrayList;
import List.List;

public class ArrayListStack<E> implements Stackable<E>{
    List<E> list;

    public ArrayListStack(){
        this.list = new ArrayList<>();
    }
    
    // acess: isEmpty
    // if my elements exist, or not : false, true
    public boolean isEmpty(){
        return this.list.isEmpty();
    }

    // acccess: push
    // insert a element to last of Stack
    public void push(E element){
        this.list.add(element);
    }

    // access: pop
    // get a elements from first of Stack with deletion
    public E pop(){
        E tmp = this.list.get(list.size()-1);
        this.list.remove(list.size()-1);

        return tmp;
    }

    // access: top
    // get a element from first of Stack without deletion
    public E top(){
        return this.list.get(this.list.size()-1);
    }

    @Override
    public Iterator<E> iterator() {
        return new java.util.Iterator<E>() {
            private int currentIdx = list.size() - 1;

            @Override
            public boolean hasNext(){
                return currentIdx >= 0;
            }

            @Override
            public E next(){
                return list.get(currentIdx--);
            }
        };
    }
    
}
