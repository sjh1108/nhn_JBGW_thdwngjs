import java.util.Iterator;

public class LinkedList<E> implements List<E> {
    public static class Node<E> {
        private E element;
        private Node<E> next;
    
        public Node(E element){
            this.element = element;
        }
    
        public Node(E element, Node<E> next){
            this(element);
    
            this.next = next;
        }
    
        public E getElement(){
            return this.element;
        }
        public Node<E> getNext(){
            return this.next;
        }
    
        public void setElement(E element){
            this.element = element;
        }
        public void setNext(Node<E> node){
            this.next = node;
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

    public void add(E item){
        if(head == null){
            head = new Node<E>(item, null);
            tail = head;
        } else{
            tail.setNext(new Node<E>(item));
            tail = tail.getNext();
        }

        this.size++;
    }

    public E get(int index){
        Node<E> tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.getNext();
        }

        return tmp.getElement();
    }

    public void removeFirst(){
        head = head.getNext();
        this.size--;
    }

    public void remove(int index){
        if(index == 0){
            removeFirst();
            return;
        }
        Node<E> tmp = head;

        for(int i = 0; i < index-1; i++){
            tmp = tmp.getNext();
        }

        tmp.setNext(tmp.getNext().getNext());

        this.size--;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void clear(){
        this.head = this.tail = null;
        this.size = 0;
    }

    public int size(){
        return this.size;
    }

    @Override
    public Iterator<E> iterator(){
        return new Iterator<E> (){
            private Node<E> current = head;

            @Override
            public boolean hasNext(){
                return current != null;
            }

            @Override
            public E next(){
                E data = current.getElement();
                current = current.getNext();
                return data;
            }
        };
    }
}


