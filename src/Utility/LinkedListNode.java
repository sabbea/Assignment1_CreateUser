package Utility;


import java.io.Serializable;

/**
 * Created by Abhishek on 7/6/2016.
 */
public class LinkedListNode<T> implements Serializable {
    public T element;
    public LinkedListNode pointer;

    public LinkedListNode(T element, LinkedListNode pointer) {
        this.element = element;
        this.pointer = pointer;
    }

    public LinkedListNode(T element) {
        this.element = element;
        this.pointer = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public LinkedListNode getPointer() {
        return pointer;
    }

    public void setPointer(LinkedListNode pointer) {
        this.pointer = pointer;
    }


}
