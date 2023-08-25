package LinkedList;

public class Node<E> {
    public E val;
    public Node<E> next;

    //Constructor With Null initializer
    public Node(){
        this.val = null;
        this.next = null;
    }


    //Constructor With value initializer
    public Node(E val){
        this.val = val;
        this.next = null;
    }


    //Constructor with value and next initializer.
    public Node(E val, Node<E> next){
       this.val = val;
       this.next = next;
    }

    public void print() {
        System.out.println(this.val);
    }
}
