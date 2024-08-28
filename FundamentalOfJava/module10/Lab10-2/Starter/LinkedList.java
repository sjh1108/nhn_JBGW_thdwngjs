public class LinkedList implements List {
    Node headNode;

    public LinkedList() {
        this.headNode = null;
    }

    private class Node {
        private int data;
        private Node nextNode;

        Node(int data) {
            this.data = data;
            this.nextNode = null;
        }

        public int getData() {
            return this.data;
        }

        public void setNextNode(Node node) {
            this.nextNode = node;
        }

        public Node getNextNode() {
            return this.nextNode;
        }
    }

        //
    // add code here for implements add method of List interface
    //

    //
    // add code here for implements remove method of List interface
    //

    //
    // add code here for implements get method of List interface
    //

    //
    // add code here for implements size method of List interface
    //
}
