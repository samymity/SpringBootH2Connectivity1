package com.example.demo.test;

import org.springframework.stereotype.Component;

@Component
public class Stack1 implements MyService {
    static final int MAX = 1000;
    public int top;
    public int a[] = new int[MAX]; // Maximum size of Stack


    public Stack1() {
        top = -1;
    }



    @Override
    public void single(String foo) {
        top = -1;
    }
}

// Driver code


