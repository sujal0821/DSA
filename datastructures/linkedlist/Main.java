package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {

        Linkedlist myLinkedlist = new Linkedlist(11);
        //.getHead();
        //.getTail();
        //.getLength();
        myLinkedlist.append(3);
        myLinkedlist.append(23);
        myLinkedlist.append(7);
       // myLinkedlist.prepend(6);
       //System.out.println(myLinkedlist.get(2).value + "\n");
       //myLinkedlist.insert(1, 4);
       //myLinkedlist.remove(2);
       myLinkedlist.reverse();   

        myLinkedlist.printList();
        //System.out.println(myLinkedlist.removeFirst().value);
        //System.out.println(myLinkedlist.removeFirst().value);
        //System.out.println(myLinkedlist.removeFirst());
    }
    
}
