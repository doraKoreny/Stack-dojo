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
    
    public int getItemCounter() {
        return itemCounter;
    }

    public void push(String item) {
        if (itemCounter > startLength) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            staticStackArray[itemCounter] = item;
            itemCounter++;
        }
    }

    public String pop() {
        if (staticStackArray[0] == null) {
            throw new NullPointerException("Error: Stack is empty");
        } else {
            String lastItem = staticStackArray[itemCounter - 1];
            staticStackArray[itemCounter - 1] = null;
            itemCounter--;
            return lastItem;
        }
    }

    public String peek() {
        String lastItem = staticStackArray[itemCounter - 1];
        return lastItem;
    }

    public int getNumberOfItems() {
        return itemCounter;
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




