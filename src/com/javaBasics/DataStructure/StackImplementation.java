package com.javaBasics.DataStructure;

// Stack Implementation using Array: time complexity of all methods is O(n)
public class StackImplementation {

    int size;
    int top;
    int arr[];

    StackImplementation(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (size-1 == top);
    }

    // peek won't delete the data, it will give you top element
    public int peek(){
        if(!this.isEmpty()){
            return arr[top];
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void push(int ele){
        if(!this.isFull()){
            top++;
            arr[top] = ele;
            System.out.println("Pushed element is: " + ele);
        }else{
            System.out.println("Stack is full");
        }
    }
   // pop method will delete the top data as LIFO operation will happen
    public int pop(){
        if(!this.isEmpty()){
            int returnedTop = top;
            top--;
            System.out.println("Popped element is: " + arr[returnedTop]);
            return arr[returnedTop];
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }


    public static void main(String[] args){
        StackImplementation stack = new StackImplementation(10);
        stack.pop();
        System.out.println("**************");
        System.out.println(stack.peek());
        System.out.println("**************");
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        System.out.println("**************");
        stack.pop();
        stack.pop();
        System.out.println("**************");
        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());



    }
}
