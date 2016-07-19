package Tests;

import Utility.LinkedListStack;

import static org.junit.Assert.*;

/**
 * Created by Abhishek on 7/18/2016.
 */
public class LinkedListStackTest {
    LinkedListStack<String> nameStack = new LinkedListStack<String>();
    String expectedPushResult = "Daniel\tCatherine\tBobby\tAndrew\t";
    String expectedPopResult = "Catherine\tBobby\tAndrew\t";
    String expectedTopResult = "Daniel";
    int expectedSizeResult = 4;


    @org.junit.Test
    public void size() throws Exception {
        nameStack.push("Andrew");
        nameStack.push("Bobby");
        nameStack.push("Catherine");
        nameStack.push("Daniel");
        assertEquals("Stack size must be 4", expectedSizeResult, nameStack.size());

    }

    @org.junit.Test
    public void pop() throws Exception {
        nameStack.push("Andrew");
        nameStack.push("Bobby");
        nameStack.push("Catherine");
        nameStack.push("Daniel");
        System.out.println(nameStack.pop());
        System.out.println(nameStack);
        assertEquals("After Pop, the stack must contain \"Catherine\tBobby\tAndrew\t", expectedPopResult, nameStack.toString());

    }

    @org.junit.Test
    public void top() throws Exception {
        nameStack.push("Andrew");
        nameStack.push("Bobby");
        nameStack.push("Catherine");
        nameStack.push("Daniel");
        assertEquals("Top must contain \"Daniel\"", expectedTopResult, (String) nameStack.top());

    }

    @org.junit.Test
    public void push() throws Exception {
        nameStack.push("Andrew");
        nameStack.push("Bobby");
        nameStack.push("Catherine");
        nameStack.push("Daniel");
        assertEquals("Stack must contain \"Daniel\tCatherine\tBobby\tAndrew\t\"", expectedPushResult, nameStack.toString());

    }

    @org.junit.Test
    public void isEmpty() throws Exception {
        nameStack.push("Andrew");
        assertEquals(false, nameStack.isEmpty());
    }

}