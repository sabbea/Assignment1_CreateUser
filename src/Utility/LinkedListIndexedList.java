package Utility;

import Exceptions.IndexOutOfBoundsException;

/**
 * Created by Abhishek on 7/18/2016.
 */
public class LinkedListIndexedList<T> implements IIndexedList<T> {

    @Override
    public void add(int index, T element) throws IndexOutOfBoundsException {

    }

    @Override
    public void set(int index, T element) throws IndexOutOfBoundsException {

    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public int indexOf(T element) {
        return 0;
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        return null;
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
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T getNext() {
        return null;
    }

    @Override
    public T get(T element) {
        return null;
    }
}
