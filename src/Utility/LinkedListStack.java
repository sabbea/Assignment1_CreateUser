package Utility;

import Exceptions.UnderflowException;

/**
 * Created by Abhishek on 7/6/2016.
 */
public class LinkedListStack<T> implements IStack<T> {
    private LinkedListNode head;
    private int size;

    public LinkedListStack() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T pop() throws UnderflowException {
        if (!isEmpty()) {
            head = head.getPointer();
        } else {
            throw new UnderflowException("Stack is Empty");
        }
        return (T) head.getElement();
    }

    @Override
    public T top() throws UnderflowException {
        if (!isEmpty()) {
            return (T) head.getElement();
        } else {
            throw new UnderflowException("Stack is empty");
        }
    }

    @Override
    public void push(T element) {
        LinkedListNode<T> newNode = new LinkedListNode<T>(element);
        newNode.setPointer(head);
        head = newNode;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    public String toString() {
        LinkedListNode<T> current = head;
        String list = "";
        while (current != null) {
            list += current.getElement() + "\t";
            current = current.getPointer();
        }
        return list;
    }
}
