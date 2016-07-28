package Utility;

import Exceptions.UnderflowException;

import java.util.*;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by Abhishek on 7/6/2016.
 */
public class LinkedListQueue<T> implements ILinkedListQueue<T> {
    LinkedListNode head;
    LinkedListNode tail;
    int numElements = 0;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public int size() {

        return numElements;

    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public void enQueue(T element) {

        LinkedListNode<T> newNode = new LinkedListNode<T>(element); //create new node

        if (head == null) {
            head = newNode;
        } else {
            tail.setPointer(newNode);
        }
        tail = newNode;
        numElements++;

    }

    @Override
    public T deQueue() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException("Queue is empty");
        }
        T element = (T) head.getElement();
        if (head == tail) {
            tail = null;
        }
        head = head.getPointer();
        numElements--;
        return element;
    }

    public String toString() {
        LinkedListNode<T> current = head;
        String result = "";
        while (current != null) {
            result += current.getElement() + "\t";
            current = current.getPointer();
        }


        return result;
    }
}

