public interface List<E> extends Iterable<E> {
    void add(E item);
    E get(int index);
    int size();
    boolean isEmpty();
    void clear();
}
