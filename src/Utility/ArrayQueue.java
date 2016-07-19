package Utility;

import Exceptions.OverflowException;
import Exceptions.UnderflowException;
import Model.User;

/**
 * Created by Abhishek on 7/6/2016.
 */
public class ArrayQueue<T> implements IArrayQueue<T> {
    protected final int CAPACITY = 100;
    protected T[] queue;
    protected int numElements = 0;
    protected int head = 0;
    protected int tail;

    //constructors
    public ArrayQueue() {
        queue = (T[]) new Object[CAPACITY];
        tail = CAPACITY - 1;
    }

    public ArrayQueue(int maxSize) {
        queue = (T[]) new Object[maxSize];
        tail = maxSize - 1;

    }

    public int size() {
        return numElements;
    }

    public boolean isEmpty() {
        return (numElements == 0);
    }

    @Override
    public boolean isFull() {
        return (numElements == queue.length);
    }

    //Inserts an element at the end of the queue
    @Override
    public void enQueue(T element) throws OverflowException {
        if (isFull()) {
            throw new OverflowException("Queue is full");
        } else {
            tail = (tail + 1) % queue.length;
            queue[tail] = element;
            numElements = numElements + 1;
        }
    }


    //Removes and returns the first element of the queue, or null if the queue is empty

    @Override
    public T deQueue() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException("Queue is empty");
        } else {
            T toReturn = queue[head];
            queue[head] = null;
            head = (head + 1) % queue.length;
            numElements = numElements - 1;
            return toReturn;

        }
    }

    @Override
    public String toString() {
        String result = "";

        for (int scan = 0; scan < head; scan++)
            result = result + queue[scan].toString() + "\n";

        return result;
    }


}
