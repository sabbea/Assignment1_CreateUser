package Utility;

/**
 * Created by Abhishek on 7/11/2016.
 */
public interface IIndexedList<T> extends IList<T> {
    public void add(int index, T element) throws Exceptions.IndexOutOfBoundsException;

    public void set(int index, T element) throws Exceptions.IndexOutOfBoundsException;

    public T get(int index) throws Exceptions.IndexOutOfBoundsException;

    public int indexOf(T element);

    public T remove(int index) throws Exceptions.IndexOutOfBoundsException;
}
