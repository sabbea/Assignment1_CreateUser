package Utility;

import Exceptions.IndexOutOfBoundsException;

/**
 * Created by Abhishek on 7/11/2016.
 */
public class ArrayIndexedList<T> implements IIndexedList<T> {


    private final int CAPACITY = 100;
    protected boolean found;
    protected int location;
    private T indexedList[];
    private int numElements;
    private int origSize;

    public ArrayIndexedList(int i) {
        indexedList = (T[]) new Object[CAPACITY];
        origSize = CAPACITY;
        numElements = 0;
    }


    @Override
    public void add(int index, T element) throws IndexOutOfBoundsException {
        if ((index < 0) || (index) > size()) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        if (numElements == indexedList.length) {
            enlarge();
        }
        for (int i = numElements; i > index; i--) {
            indexedList[i] = indexedList[i - 1];
        }
        indexedList[index] = element;
        numElements++;

    }

    @Override
    public void set(int index, T element) throws IndexOutOfBoundsException {
        if ((index < 0) || (index >= CAPACITY)) {
            throw new IndexOutOfBoundsException("Invalid Index");
        } else {
            T hold = indexedList[index];
            indexedList[index] = element;
        }

    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if ((index < 0) || (index >= size())) {
            throw new IndexOutOfBoundsException("Invalid Index");
        } else {
            return indexedList[index];
        }
    }

    @Override
    public int indexOf(T element) {
        find(element);
        if (found) {
            return location;
        } else {
            return -1;
        }
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        if ((index < 0) || (index >= size())) {
            throw new IndexOutOfBoundsException("Invalid Index");
        } else {
            Object hold = indexedList[index];
            for (int i = index; i < numElements; i++)
                indexedList[index] = indexedList[index + 1];

            indexedList[numElements] = null;
            numElements--;
            return (T) hold;
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
            compareResult = targetElement.compareTo(indexedList[location]);
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
        for (int i = 0; i < indexedList.length; i++) {
            largerList[i] = indexedList[i];

        }
        indexedList = largerList;
    }

    @Override
    public void add(T element) {

    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(T element) {
        find(element);
        return found;
    }

    @Override
    public int size() {
        return numElements;
    }

    @Override
    public T getNext() {
        location++;
        return indexedList[location];

    }

    public String toString() {
        String result = "";

        for (int scan = 0; scan < numElements; scan++)
            System.out.print(indexedList[scan]);


        return result;
    }
    @Override
    public T get(T element) {
        return null;
    }


}
