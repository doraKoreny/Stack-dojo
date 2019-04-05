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
}