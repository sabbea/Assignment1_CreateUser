package Utility;

import Exceptions.OverflowException;
import Exceptions.UnderflowException;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by Abhishek on 7/6/2016.
 */
public interface IQueue<T> {

    public T deQueue() throws UnderflowException, UnderflowException;

    public boolean isEmpty();

    public int size();

}
