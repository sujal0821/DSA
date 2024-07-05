package datastructures.doublylinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;
         

        Node (int value) {
            this.value = value;
        }
    }
    public DoublyLinkedList(int value) {
        // making a new node
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println("Head: "+head.value);
    }
    public void getTail(){
        System.out.println("Tail: "+tail.value);
    }
    public void getLength(){
        System.out.println("Length: "+length);
    }
    public void append(int value) {
         Node newNode = new Node(value);
         if (length == 0){
            head = newNode;
            tail = newNode;
        } else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next=head;
            head =newNode;
        }
        length++;
    }
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
    public Node get(int index){
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail ;
            for ( int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }
    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insert( int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        }
            Node newNode = new Node(value);
            Node before = get(index -1);
            Node after = before.next;
            newNode.prev = before;
            newNode.next = after;
            before.next = newNode;
            after.prev = newNode;
            length++;
            
         return true;
    } 
    public boolean remove(int index) {
        if (index < 0 || index >= length) return false;
        if (index == 0) {
            removeFirst();
        } else if (index == length - 1) {
            removeLast();
        } else {
            Node temp = get(index);
            Node before = temp.prev;
            Node after = temp.next;
            before.next = after;
            after.prev = before;
            temp.next = null;
            temp.prev = null;
            length--;
        }
        return true;
    }

    
}
