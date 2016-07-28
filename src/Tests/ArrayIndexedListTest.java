package Tests;

import Utility.ArrayIndexedList;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by Abhishek on 7/18/2016.
 */
public class ArrayIndexedListTest {
    ArrayIndexedList<String> indexedList = new ArrayIndexedList<String>(5);

    @org.junit.Test
    public void add() throws Exception {
        indexedList.add(0, "A");
        indexedList.add(1, "B");
        indexedList.add(2, "C");
        indexedList.add(3, "D");
        System.out.print(indexedList);
        assertEquals(4, indexedList.size());
    }

    @org.junit.Test
    public void set() throws Exception {
        indexedList.add(0, "A");
        indexedList.add(1, "B");
        indexedList.add(2, "C");
        indexedList.add(3, "D");
        indexedList.set(2, "F");
        assertEquals(4, indexedList.size());
        System.out.print(indexedList);
    }

    @org.junit.Test
    public void get() throws Exception {
        indexedList.add(0, "A");
        indexedList.add(1, "B");
        indexedList.add(2, "C");
        indexedList.add(3, "D");
        indexedList.get(2);
        assertEquals("C", indexedList.get(2));

    }

    @org.junit.Test
    public void indexOf() throws Exception {
        indexedList.add(0, "A");
        indexedList.add(1, "B");
        indexedList.add(2, "C");
        indexedList.add(3, "D");
        assertEquals(2, indexedList.indexOf("C"));

    }

    @org.junit.Test
    public void remove() throws Exception {
        indexedList.add(0, "A");
        indexedList.add(1, "B");
        indexedList.add(2, "C");
        indexedList.add(3, "D");
        System.out.println(indexedList);
        indexedList.remove(2);
        System.out.println(indexedList);
        assertEquals(3, indexedList.size());
    }


    @org.junit.Test
    public void isEmpty() throws Exception {
        indexedList.add(0, "A");
        assertEquals(false, indexedList.isEmpty());
    }

    @org.junit.Test
    public void contains() throws Exception {
        indexedList.add(0, "A");
        indexedList.add(1, "B");
        indexedList.add(2, "C");
        indexedList.add(3, "D");
        assertEquals(true, indexedList.contains("C"));
    }

    @org.junit.Test
    public void size() throws Exception {
        indexedList.add(0, "A");
        indexedList.add(1, "B");
        indexedList.add(2, "C");
        indexedList.add(3, "D");
        assertEquals(4, indexedList.size());
    }

    @org.junit.Test
    public void getNext() throws Exception {
        indexedList.add(0, "A");
        indexedList.add(1, "B");
        indexedList.add(2, "C");
        indexedList.add(3, "D");
        assertEquals("B", indexedList.getNext());
        assertEquals("C", indexedList.getNext());
    }


}