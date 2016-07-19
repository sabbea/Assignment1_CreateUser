package Utility;

import java.io.Serializable;

/**
 * Created by Abhishek on 7/6/2016.
 */
public interface IArrayStack<T> extends IStack<T>, Serializable {
    public boolean isFull();
}
