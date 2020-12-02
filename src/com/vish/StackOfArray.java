package com.vish;

import java.lang.reflect.Array;

public class StackOfArray {

    public int topofStack;
    public int A[];

    public void createStack(int size){
        this.A = new int[size];
        this.topofStack = -1;
        System.out.println("Stack created successfully with a size of: "+size);
    }

    public void push(int value){
        System.out.println("\nPushing an element "+value+" in the Stack.......");
        if (isFullStack()){
            System.out.println("The Stack is full, cannot perform push");
            return;
        }
        else {
            topofStack++;
            A[topofStack] = value;
        }
    }

    public void pop(){
        System.out.println("\nPopping the top element from the Stack......");
        if (isEmptyStack()){
            System.out.println("The stack is empty, nothing to pop");
            return ;
        }
        else {
            System.out.println("Element "+A[topofStack] +" popped off the array");
            topofStack--;
        }
    }

    public void peek(){
        System.out.println("\nPeeking for the top element of the Stack..........");
        if (isEmptyStack()){
            System.out.println("The stack is currently empty");
            return;
        }
        else {
            System.out.println("The top element in the Stack is:"+A[topofStack]);
        }
    }

    public void displayStackElements(){
        int loop = topofStack;
        System.out.println("\nPrinting the elements of the stack......");

        if(A == null)
            System.out.println("The stack is empty");

        else if(loop == -1)
            System.out.println("The stack is empty");

        else {
            while (loop != -1){
                System.out.print(A[loop] + " ");
                loop--;
            }
        }
        System.out.println();

    }

    public boolean isEmptyStack(){
        if (topofStack == -1)
            return true;
        else
            return false;
    }

    public boolean isFullStack(){
        if (topofStack == A.length-1)
            return true;
        else
            return false;
    }

    public void deleteTheStack(){
        A = null;
        System.out.println("\nThe Stack deleted successfully");
    }

}