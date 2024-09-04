public class LinkedList <E> {
    static class Node<E>{
        private E element;
        private Node<E> next;

        public Node(){}
        public Node(E e){
            setElement(e);
            this.next = null;
        }

        public void setElement(E e){
            this.element = e;
        }

        public void setNext(Node<E> n){
            this.next = n;
        }

        public E getElement(){
            return this.element;
        }

        public Node<E> getNext(){
            return this.next;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(E element){
        if(this.size == 0){
            this.head = new Node<E>(element);
            this.tail = this.head;
        } else{
            Node<E> tmp = new Node<>(element);

            this.tail.setNext(tmp);
            this.tail = tmp;
        }

        this.size++;
    }

    public E get(int index){
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();

        Node<E> tmp = this.head;
        for(int i = 0; i < index; i++){
            tmp = tmp.getNext();
        }

        return tmp.getElement();
    }

    public void remove(int index){
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
        else if(index == 0) this.head = this.head.getNext();
        else{
            Node<E> tmp = this.head;
            for(int i = 0; i < index-1; i++){
                tmp = tmp.getNext();
            }
            tmp.setNext(tmp.getNext().getNext());
        }
        
        this.size--;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void clear(){
        this.head = this.tail = null;
        this.size = 0;
    }
}
