package LinkedList;

public class LinkedList<E> {
    public Node<E> header;
    private int size = 0;


    public LinkedList() {
        header = new Node<E>();
    }




//    -----------------------------------Insert Node----------------------------------------
    public void insertStart(E e) {
        Node<E> temp = header.next;
        header.next = new Node<E>(e);
        header.next.next = temp;
        this.size++;
    }

    public void insertEnd(E e) {
        Node<E> temp = header;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node<E>(e);
        this.size++;
    }


//    -----------------------------------Remove Node----------------------------------------

    public void removeFirst() {
        if (header.next == null) return;

        Node<E> temp = header.next;
        header.next = temp.next;
        this.size--;
    }

    public void removeLast() {
        if (header.next == null) return;

        Node<E> temp = header;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        this.size--;
    }

    //-----------------------------------Get Node----------------------------------------

    /*
        returns the node in the index provided.
        this does not return the value rather the node itself.
    */
    public Node<E> getNodeByIndex(int index) {
        //Check if index is minus or bigger than size of list.
        if (index < 0) return null;
        if (size < index) {
            return null;
        }

        //Set a temp header and loop till index
        Node<E> temp = header;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    /*
        returns the first occurring node where its
        value is equal to the one provided.
     */
    public Node<E> getNodeByValue(E e) {
        return null;
    }



    public int size() {
        return this.size;
    }

    public void print() {
        Node<E> temp = header.next;
        while (temp != null) {
            temp.print();
            temp = temp.next;
        }
    }


}
