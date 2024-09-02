@SuppressWarnings("all")
public class ArrayStack<E> implements Stackable<E> {
    private E[] elements;
    private int index = 0;

    // default constructor
    public ArrayStack(){
        this.elements = (E[]) new Object[10];
    }
    
    // Constructor: copy
    public ArrayStack(ArrayStack<E> stack){
        this.elements = stack.elements;
    }
    
    // acess: isEmpty
    // if my elements exist, or not : false, true
    public boolean isEmpty(){
        return index == 0 ? true : false;
    }
    
    // acccess: push
    // insert a element to last of Stack
    public void push(E element){
        this.elements[this.index++] = element;
    }
    
    // access: pop
    // get a elements from first of Stack with deletion
    public E pop(){
        return this.elements[--this.index];
    }
    
    // access: top
    // get a element from first of Stack without deletion
    public E top(){
        return this.elements[this.index-1];
    }
    
    @Override
    public java.util.Iterator iterator(){
        return new java.util.Iterator<E>() {
            private int currentIdx = 0;

            @Override
            public boolean hasNext(){
                return currentIdx < index;
            }

            @Override
            public E next(){
                return ArrayStack.this.pop();
            }
        };
    }
}
