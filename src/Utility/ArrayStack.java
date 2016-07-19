package Utility;


import Exceptions.UnderflowException;
import Utility.IStack;

import java.util.Iterator;

public class ArrayStack<T> implements IStack<T> {
    private final int CAPACITY = 100;
    private int top;  // indicates the next open slot
    private transient T[] stack;

    public ArrayStack() {
        top = 0;
        stack = (T[]) (new Object[CAPACITY]);
    }

    public ArrayStack(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    public void push(T element) {
        if (size() == stack.length)
            enlarge();

        stack[top] = element;
        top++;
    }

    public T pop() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException();

        top--;
        T result = stack[top];
        stack[top] = null;

        return result;
    }

    public T top() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException();


        return stack[top - 1];
    }

    public boolean isFull() {
        return (top == stack.length);
    }

    public boolean isEmpty() {
        return (top == 0);
    }

    public int size() {
        return top;
    }


    public String toString() {
        String result = "";

        for (int scan = 0; scan < top; scan++)
            result = result + stack[scan].toString() + "\n";

        return result;
    }

    private void enlarge() {
        T[] larger = (T[]) (new Object[stack.length * 2]);

        for (int index = 0; index < stack.length; index++)
            larger[index] = stack[index];

        stack = larger;
    }
}