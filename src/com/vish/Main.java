package com.vish;

public class Main {

    public static void main(String[] args) {
        StackOfArray S = new StackOfArray();

        S.createStack(5);
        S.displayStackElements();

        S.push(5);
        S.push(10);
        S.push(15);
        S.push(20);
        S.push(25);
        S.push(50);

        S.displayStackElements();

        S.peek();

        S.pop();
        S.pop();
        S.displayStackElements();

        S.push(10);
        S.displayStackElements();
        S.push(20);
        S.displayStackElements();

        S.peek();

        S.push(30);
        S.push(40);
        S.displayStackElements();

//        S.deleteTheStack();
//        S.displayStackElements();
    }
}
