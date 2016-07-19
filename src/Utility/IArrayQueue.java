package Utility;

import Exceptions.OverflowException;

import java.io.Serializable;

/**
 * Created by Abhishek on 7/6/2016.
 */
public interface IArrayQueue<T> extends Serializable, IQueue<T> {
    public void enQueue(T element) throws OverflowException;

    public boolean isFull();
}
