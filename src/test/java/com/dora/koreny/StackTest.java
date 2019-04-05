package com.dora.koreny;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StackTest {

    @Test
    public void pushItemIncreasesItemCounter() {
        Stack stack = new Stack(5);
        int stackSize = stack.getStartLength();
        stack.push("First");
        assertEquals(stack.getItemCounter(), 1);
    }

    @Test()
    public void pushThrowsExceptionWhenFull() {
        Stack stack = new Stack(1);
        stack.push("First");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> stack.push("Second"));
    }

    @Test
    public void popReturnsLastItem() {
        Stack stack = new Stack(2);
        stack.push("First");
        stack.push("Second");
        String poppedItem = stack.pop();
        assertEquals(poppedItem, "Second");
    }

    @Test
    public void popRemovesLastItem() {
        Stack stack = new Stack(2);
        int lastItemIndex = stack.getItemCounter();
        stack.push("First");
        stack.push("Second");
        stack.pop();
        assertEquals(lastItemIndex, 0);
    }

    @Test
    public void popThrowsExceptionWhenStackIsEmpty() {
        Stack stack = new Stack(1);
        assertThrows(NullPointerException.class, () -> stack.pop());
    }

    @Test
    public void peekReturnsLastItem() {
        Stack stack = new Stack(2);
        stack.push("First");
        stack.push("Second");
        String lastItem = stack.peek();
        assertEquals(lastItem, "Second");
    }

    @Test
    public void peekDoesNotRemoveLastItem() {
        Stack stack = new Stack(2);
        stack.push("First");
        stack.push("Second");
        stack.peek();
        int itemCounter = stack.getItemCounter();
        assertEquals(itemCounter, 2);
    }

    @Test
    public void getNumberOfItems() {
        Stack stack = new Stack(2);
        stack.push("First");
        stack.push("Second");
        assertEquals(stack.getNumberOfItems(), 2);
    }
}