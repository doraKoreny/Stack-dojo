package com.dora.koreny;

import java.util.Arrays;

public class Stack {
    private String[] staticStackArray;

    private int startLength;
    private int itemCounter = 0;

    public Stack(int length) {
        this.startLength = length;
        this.staticStackArray = new String[length];
    }

    @Override
    public String toString() {
        return "Stack{" +
                "staticStackArray=" + Arrays.toString(staticStackArray) +
                ", startLength=" + startLength +
                ", itemCounter=" + itemCounter +
                '}';
    }
}




