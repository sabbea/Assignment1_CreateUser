package Tests;

import Utility.ArrayQueue;

import static org.junit.Assert.*;

/**
 * Created by Abhishek on 7/18/2016.
 */
public class ArrayQueueTest {
    ArrayQueue<String> nameQueue = new ArrayQueue<String>();

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
        nameQueue.enQueue("B");
        nameQueue.enQueue("C");
        assertEquals(false, nameQueue.isEmpty());

    }


    @org.junit.Test
    public void enQueue() throws Exception {
        nameQueue.enQueue("A");
        nameQueue.enQueue("B");
        nameQueue.enQueue("C");
        nameQueue.enQueue("D");
        assertEquals(false, nameQueue.isEmpty());

    }

    @org.junit.Test
    public void deQueue() throws Exception {
        nameQueue.enQueue("A");
        nameQueue.enQueue("B");
        nameQueue.enQueue("C");
        nameQueue.enQueue("D");
        nameQueue.deQueue();
        assertEquals(3, nameQueue.size());

    }


}