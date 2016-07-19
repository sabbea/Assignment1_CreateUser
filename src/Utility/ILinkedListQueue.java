package Utility;

import Exceptions.OverflowException;

/**
 * Created by Abhishek on 7/17/2016.
 */
public interface ILinkedListQueue<T> extends IQueue<T> {
    public void enQueue(T element) throws OverflowException;
}
