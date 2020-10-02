package com.example.demo.testconfig;




import java.lang.reflect.Array;
        import java.util.Arrays;

class Stack {

    int a[] = new int[10];
    int top;


    Stack(){

        top=-1 ;
    }

    public void push()
    {

        a[++top] = 1;

    }
    public void pop()
    {
        a[top] =0 ;
        top= top-1;


    }





    public static void main(String[] args) {

        Stack obj = new Stack();
        obj.push();
        obj.push();
        obj.pop();

        System.out.println(  Arrays.toString(obj.a));


    }
}