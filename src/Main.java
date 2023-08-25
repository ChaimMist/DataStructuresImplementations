import LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.insertStart("Hello World");
        list.insertStart("Welcome");
        list.insertStart("Test");
        list.insertStart("test2");
        list.insertEnd("Should be last element");
        list.insertStart("Should be first element");

        list.print();
        System.out.println("--------------Index--------------");
        System.out.println(list.getNodeByIndex(list.size()/2).val);
        System.out.println("--------------Value--------------");
        System.out.println(list.getNodeByValue("Should be first element").val);
        System.out.println("--------------Reversed--------------");
        list.reverseListIterative();
        list.print();
    }
}