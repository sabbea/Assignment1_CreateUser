package Tests;

import Utility.LinkedListQueue;

import static org.junit.Assert.*;

/**
 * Created by Abhishek on 7/18/2016.
 */
public class LinkedListQueueTest {
    LinkedListQueue<String> nameQueue = new LinkedListQueue<String>();

    @org.junit.Test
    public void size() throws Exception {
        nameQueue.enQueue("A");
        nameQueue.enQueue("B");
        nameQueue.enQueue("C");
        nameQueue.enQueue("D");
        assertEquals(4, nameQueue.size());
    }

    @org.junit.Test
    public void isEmpty() throws Exception {
        nameQueue.enQueue("A");
        assertEquals(false, nameQueue.isEmpty());

    }

    @org.junit.Test
    public void enQueue() throws Exception {
        nameQueue.enQueue("A");
        nameQueue.enQueue("B");
        nameQueue.enQueue("C");
        nameQueue.enQueue("D");
        System.out.print(nameQueue);
    }

    @org.junit.Test
    public void deQueue() throws Exception {
        nameQueue.enQueue("A");
        nameQueue.enQueue("B");
        nameQueue.enQueue("C");
        System.out.print(nameQueue);
        nameQueue.deQueue();
        System.out.print(nameQueue);

    }

}