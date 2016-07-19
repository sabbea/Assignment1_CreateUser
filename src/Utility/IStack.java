package Utility;

import Exceptions.OverflowException;
import Exceptions.UnderflowException;

/**
 * Created by Abhishek on 7/6/2016.
 */
public interface IStack<T> {
    int size();

    public T pop() throws UnderflowException;

    public T top() throws UnderflowException;

    public void push(T element) throws OverflowException;

    public boolean isEmpty();
}
