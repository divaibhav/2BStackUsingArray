package implementation;

import myinterface.StackADT;

public class MyStack implements StackADT {
    //MAX_SIZE
    private final int MAX_CAPACITY;
    //arr for storing elements in stack
    private int[] arr;
    //every stack have top
    private int top;

    //constructor
    public MyStack(int MAX_CAPACITY){
        this.MAX_CAPACITY = MAX_CAPACITY;
        //initialize arr
        arr = new int[MAX_CAPACITY];
        // top is  -1 or 0
        top = -1;
    }

    @Override
    public void push(int element) {
        if(isEmpty()){
            top++;
            arr[top] = element;
            System.out.println("element add");
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    @Override
    public int pop() {
        int response = 0;
        if(top != -1){
            response = arr[top];
            top--;
        }
        else {
            System.out.println("Stack Underflow");
        }
        return response;
    }

    @Override
    public int peek() {
        if(top != -1){
            return arr[top];
        }
        System.out.println("Stack is empty");
        return 0;//considering 0 as invalid data
    }

    @Override
    public boolean isEmpty() {
        if(top < MAX_CAPACITY - 1){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return top + 1;
    }

    public boolean search(int searchKey){
        boolean response = false;
        for (int i = 0; i <= top ; i++) {
            if (searchKey == arr[i]){
                response = true;
                break;
            }
        }
        return response;

    }
    public void traverse(){
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
