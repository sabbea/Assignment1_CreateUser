package Utility;

import Exceptions.UnderflowException;
import Model.User;

import java.io.Serializable;

/**
 * Created by Abhishek on 7/11/2016.
 */

public class ArrayOrderedList<T> implements Serializable, IList<T> {
    private final int CAPACITY = 100;
    private T orderedList[];
    private int numElements;
    private int origSize;
    protected boolean found;
    protected int location;

    public ArrayOrderedList() {
        orderedList = (T[]) new Object[CAPACITY];
        origSize = CAPACITY;
        numElements = 0;
    }

    @Override
    public void add(T element) {
        int location = 0;
        T item;

        if (orderedList.length == size()) {
            enlarge();
        }

        //search for location ton insert new element
        for (int i = location; i < size(); i++) {
            item = orderedList[location];
            if (((Comparable) item).compareTo(element) < 0) {
                location++;
            } else {
                break;
            }
        }
        //shifting
        for (int i = numElements; i > location; i--) {
            orderedList[i] = orderedList[i - 1];
        }
        orderedList[location] = element;
        numElements++;
    }

    @Override
    public boolean remove() {
        return false;
    }


    public boolean remove(T element) {
        find(element);
        if (found) {
            for (int i = location; i <= numElements - 2; i++) {
                orderedList[i] = orderedList[i + 1];
            }
            orderedList[numElements] = null;
            numElements--;
        }
        return found;
    }


    @Override
    public boolean contains(T element) {
        find(element);
        if (found) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return numElements;
    }

    public boolean isEmpty() {
        if (orderedList.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T getNext() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        } else {
            location++;
            return orderedList[location];

        }
    }

    @Override
    public T get(T element) {
        find(element);
        if (found) {
            return element;
        } else {
            return null;
        }
    }

    protected void find(T target) {
        int first = 0;
        int last = numElements - 1;
        int compareResult;
        Comparable targetElement = (Comparable) target;
        found = false;

        while (first <= last) {
            location = (first + last) / 2;
            compareResult = targetElement.compareTo(orderedList[location]);
            if (compareResult == 0) {
                found = true;
                break;
            } else if (compareResult < 0) {
                last = location - 1;
            } else {
                first = location + 1;
            }

        }
    }

    private void enlarge() {
        T[] largerList = (T[]) new Object[2 * origSize];
        for (int i = 0; i < orderedList.length; i++) {
            largerList[i] = orderedList[i];

        }
        orderedList = largerList;
    }

    public String toString() {
        String result = "";

        for (int scan = 0; scan < numElements; scan++)
            System.out.print(orderedList[scan]);


        return result;
    }
}
