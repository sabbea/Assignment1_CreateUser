package Utility;

import static javafx.scene.input.KeyCode.T;

import Exceptions.UnderflowException;
import Model.User;

/**
 * Created by Abhishek on 7/10/2016.
 */
public interface IList<T> {

    public void add(T element);

    public boolean remove();

    public boolean isEmpty();

    public boolean contains(T element);

    public int size();

    public T getNext() throws UnderflowException;

    public T get(T element);

    public String toString();


}
