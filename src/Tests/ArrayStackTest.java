package Tests;

import Utility.ArrayStack;
import Utility.LinkedListStack;

import static org.junit.Assert.*;

/**
 * Created by Abhishek on 7/18/2016.
 */
public class ArrayStackTest {
    ArrayStack<String> nameStack = new ArrayStack<String>(4);

    @org.junit.Test
    public void size() throws Exception {
        nameStack.push("A");
        nameStack.push("B");
        nameStack.push("C");
        nameStack.push("D");
        assertEquals(4, nameStack.size());

    }

    @org.junit.Test
    public void pop() throws Exception {
        nameStack.push("A");
        nameStack.push("B");
        nameStack.push("C");
        nameStack.push("D");
        nameStack.pop();
        assertEquals(3, nameStack.size());
    }

    @org.junit.Test
    public void top() throws Exception {
        nameStack.push("A");
        nameStack.push("B");
        nameStack.push("C");
        nameStack.push("D");
        nameStack.top();
        assertEquals("D", nameStack.top());
    }

    @org.junit.Test
    public void push() throws Exception {
        nameStack.push("A");
        nameStack.push("B");
        System.out.print(nameStack);
        assertEquals(false, nameStack.isEmpty());
    }

    @org.junit.Test
    public void isEmpty() throws Exception {
        nameStack.push("A");
        assertEquals(false, nameStack.isEmpty());
    }

    @org.junit.Test
    public void isFull() throws Exception {
        nameStack.push("A");
        nameStack.push("B");
        nameStack.push("C");
        nameStack.push("D");
        assertEquals(true, nameStack.isFull());
    }


}