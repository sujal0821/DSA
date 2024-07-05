package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        //myDLL.getHead();
        //myDLL.getTail();
        //myDLL.getLength();
        myDLL.append(3);
        myDLL.append(4);
        //myDLL.append(4);
        //System.out.println(myDLL.removeLast().value);
        //System.out.println(myDLL.removeLast().value);
        //System.out.println(myDLL.removeLast());
        //myDLL.prepend(1);
        //System.out.println(myDLL.removeFirst().value);
        //System.out.println(myDLL.removeFirst().value);
        //System.out.println(myDLL.removeFirst());
        //System.out.println(myDLL.get(1).value);
        //myDLL.set(1, 5);
        myDLL.insert(1, 2);
        myDLL.remove(2);
        

        myDLL.printList();
    }
    
}
