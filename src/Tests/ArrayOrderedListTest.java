package Tests;

import Utility.ArrayOrderedList;

import static org.junit.Assert.*;

/**
 * Created by Abhishek on 7/18/2016.
 */
public class ArrayOrderedListTest {
    ArrayOrderedList<String> orderedList = new ArrayOrderedList<String>();

    @org.junit.Test
    public void add() throws Exception {
        orderedList.add("A");
        orderedList.add("B");
        orderedList.add("C");
        orderedList.add("E");
        orderedList.add("F");
        orderedList.add("D");
        assertEquals(false, orderedList.isEmpty());
        System.out.print(orderedList);

    }

    @org.junit.Test
    public void remove() throws Exception {
        orderedList.add("A");
        orderedList.add("B");
        orderedList.add("C");
        orderedList.add("E");
        orderedList.add("F");
        System.out.println(orderedList);
        orderedList.remove("E");
        System.out.println(orderedList);
        assertEquals(4, orderedList.size());

    }

    @org.junit.Test
    public void contains() throws Exception {
        orderedList.add("A");
        orderedList.add("B");
        orderedList.add("C");
        orderedList.add("E");
        orderedList.add("F");
        assertEquals(true, orderedList.contains("B"));
    }

    @org.junit.Test
    public void size() throws Exception {
        orderedList.add("A");
        orderedList.add("B");
        orderedList.add("C");
        orderedList.add("E");
        orderedList.add("F");
        assertEquals(5, orderedList.size());
    }

    @org.junit.Test
    public void isEmpty() throws Exception {
        orderedList.add("A");
        assertEquals(false, orderedList.isEmpty());

    }

    @org.junit.Test
    public void getNext() throws Exception {
        orderedList.add("A");
        orderedList.add("B");
        assertEquals("B", orderedList.getNext());

    }

    @org.junit.Test
    public void get() throws Exception {
        orderedList.add("A");
        orderedList.add("B");
        orderedList.add("C");
        orderedList.add("E");
        orderedList.add("F");
        assertEquals("E", orderedList.get("E"));

    }


}