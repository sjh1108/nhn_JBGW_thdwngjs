public interface Stackable<E> extends Iterable<E> {
    // acess: isEmpty
    // if my elements exist, or not : false, true
    public boolean isEmpty();

    // acccess: push
    // insert a element to last of Stack
    public void push(E element);

    // access: pop
    // get a elements from first of Stack with deletion
    public E pop();

    // access: top
    // get a element from first of Stack without deletion
    public E top();
}
