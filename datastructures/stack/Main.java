package datastructures.stack;

public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(4);
        //myStack.gettop();
        //myStack.getheight();
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);

        myStack.pop();
        myStack.printStack();
    }
    
}
