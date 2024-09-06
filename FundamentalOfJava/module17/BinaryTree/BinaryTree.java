import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Node{
    int key;

    Node left, right;

    public Node(int key){
        this.key = key;
        this.left = this.right = null;
    }
}

public class BinaryTree implements Iterable<Integer> {
    Node root;

    public BinaryTree(){
        this.root = null;
    }

    public Node getRootNode(){
        return this.root;
    }

    public void addNode(int key){
        this.root = addNode(this.root, key);
    }

    public Node addNode(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }

        if(key < root.key){
            root.left = addNode(root.left, key);
        } else if(key > root.key){
            root.right = addNode(root.right, key);
        }

        return root;
    }

    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.key);
            inOrder(node.right);
        }
    }

    public void preOrder(Node node){
        if(node != null){
            System.out.println(node.key);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.key);
        }
    }

    private List<Integer> list = new ArrayList<>();
    private void inOrderIterater(Node node){
        if(node != null){
            inOrderIterater(node.left);
            list.add(node.key);
            inOrderIterater(node.right);
        }
    }

    @Override
    public Iterator<Integer> iterator(){
        list.clear();
        inOrderIterater(root);

        return list.iterator();
    }
}

class BinaryTreeTest{
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        
        tree.addNode(40);
        tree.addNode(10);
        tree.addNode(50);
        tree.addNode(70);
        tree.addNode(80);
        tree.addNode(30);
        tree.addNode(20);
        tree.addNode(60);

        // tree.inOrder(tree.root);
        // System.out.println();
        // tree.preOrder(tree.root);


        for(int i : tree){
            System.out.println(i);
        }
    }
}